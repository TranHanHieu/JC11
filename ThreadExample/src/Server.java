import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by Hieu It on 9/23/2016.
 */
public class Server extends Thread {

    public static void main(String[] args) throws IOException {

        System.out.println("Waitting to Client ...");
        ServerSocket serverSocket = new ServerSocket(6060);
        final ArrayList<Socket> arrayList = new ArrayList<>();

        while (true) {
            final Socket socket = serverSocket.accept();
            System.out.println("Connected !");

            arrayList.add(socket);
            Thread threadServer = new Thread(new Runnable() {
                String msgReceived;

                @Override
                public void run() {
                    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
                        while ((msgReceived = bufferedReader.readLine()) != null) {
                            System.out.println("Client : " + msgReceived);

                            for (int i = 0; i < arrayList.size(); i++) {
                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(arrayList.get(i).getOutputStream()));

                                bufferedWriter.write(msgReceived);
                                bufferedWriter.newLine();
                                bufferedWriter.flush();
                            }
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            threadServer.start();
        }
    }
}
