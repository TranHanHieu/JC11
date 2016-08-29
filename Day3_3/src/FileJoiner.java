import java.io.*;

/**
 * Created by Hieu It on 8/25/2016.
 */
public class FileJoiner {
    public static void fileJoiner(String path) throws IOException {

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("FileJoiner.txt"));
        String[] splits = path.split(",");
        String nameFile = "";
        int a;

        for (int i = 0; i < splits.length; i++) {
            nameFile = splits[i];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(nameFile));
            while ((a = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(a);
            }
            bufferedInputStream.close();
        }
        bufferedOutputStream.close();
    }

    public static void main(String[] args) {

        try {
            fileJoiner("E:\\install.log.1.txt,E:\\install.log.2.txt,E:\\install.log.3.txt,E:\\install.log.4.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
