import java.io.*;

/**
 * Created by Hieu It on 8/25/2016.
 */
public class FileSplitter {
    public static void fileSplitter(String path, int numberFlie) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path));
        File file = new File(path);
        long length = file.length();
        long lengthFile = length / numberFlie;
        for (int i = 0; i < numberFlie; i++) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(path + "." + (i + 1) + ".txt"));
            for (int j = 0; j < lengthFile; j++) {
                bufferedOutputStream.write(bufferedInputStream.read());
            }
        }
    }

    public static void main(String[] args) {
        //String path = ;
        try {
            fileSplitter("E:\\install.log", 4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
