import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        URI uri = Main.class.getResource("test.txt").toURI();
        List<String> str = Files.readAllLines(Paths.get(uri), Charset.defaultCharset());
        for (int i = 0; i < str.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(str.get(i));
            }
        }

    }
}
