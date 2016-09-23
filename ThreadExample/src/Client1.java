import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Hieu It on 9/24/2016.
 */
public class Client1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Waitting to Server .....");
        final Socket socket = new Socket("localhost", 6060);
        System.out.println("Connected !");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));) {
                    while (true) {
                        bufferedWriter.write(new Scanner(System.in).nextLine());
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String msgReceived;
        while (true) {
            while ((msgReceived = bufferedReader.readLine()) != null) {
                System.out.println("Server : " + msgReceived);
            }
        }
    }
}
