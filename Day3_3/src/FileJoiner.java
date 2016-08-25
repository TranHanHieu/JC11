import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Hieu It on 8/25/2016.
 */
public class FileJoiner {
    public static void fileJoiner(String path) throws FileNotFoundException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(path));

    }
}
