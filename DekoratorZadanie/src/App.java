import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main(String[] args) throws IOException {
        int c;

        try {
            InputStream in =
            new LowerCaseInputStream(
                new BufferedInputStream(
                    new FileInputStream("src/file.txt")
                )
            );

            while((c=in.read())>=0){
                System.out.print((char)c);
            }

            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
