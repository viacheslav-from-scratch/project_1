import java.io.*;
import java.nio.charset.StandardCharsets;

//https:// docs.oracle.com/en/java/java se/21/docs/api/java.base/java/io/InputStream.html
//https:// www.youtube.com/watch?v=-xKg xqG411c
public class AdaptiveStream {
    private InputStreamReader isr;
    private OutputStreamWriter osr;

    public AdaptiveStream() {
    }

    public void print(String str) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(System.out, StandardCharsets.UTF_8);
            osw.write(str + "\n");
            osw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void print(String str, boolean end) {
        if(end)
            try {
                OutputStreamWriter osw = new OutputStreamWriter(System.out, StandardCharsets.UTF_8);
                osw.write(str + "\n");
                osw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        else
            try {
                OutputStreamWriter osw = new OutputStreamWriter(System.out, StandardCharsets.UTF_8);
                osw.write(str);
                osw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    public String input() {
        try {
            InputStreamReader isr = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            BufferedReader bf = new BufferedReader(isr);

            return bf.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e); // or throw new UncheckedIOException(e);
        }
    }

    public String input(String str) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(System.out, StandardCharsets.UTF_8);
        osw.write(str);
        osw.flush();

        InputStreamReader isr = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader bf = new BufferedReader(isr);

        return bf.readLine();
    }
}
