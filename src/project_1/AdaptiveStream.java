import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https:// docs.oracle.com/en/java/java se/21/docs/api/java.base/java/io/InputStream.html
//https:// www.youtube.com/watch?v=-xKg xqG411c
// Using Low Level Code, but still more reliable for using in high level
public class AdaptiveStream extends BasicFunctional {
    protected InputStreamReader isr;
    protected OutputStreamWriter osw;

    public AdaptiveStream(InputStreamReader isr, OutputStreamWriter osw) {
        this.isr = isr;
        this.osw = osw;
    }

    public void print(String str) {
        try {
            osw.write(str + "\n");
            osw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void print(String str, boolean end) {
        try {
            if(end)
                osw.write(str + "\n");
            else
                osw.write(str);
            osw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String input() {
        try {
            BufferedReader bf = new BufferedReader(isr);

            return bf.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String input(boolean end) {
        try {
            if (end)
                osw.write("\n");
            else
                osw.flush();
            BufferedReader bf = new BufferedReader(isr);

            return bf.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String input(String str) {
        try {
            osw.write(str + "\n");
            osw.flush();

            BufferedReader bf = new BufferedReader(isr);

            return bf.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String input(String str, boolean end)  {
        try {
            if(end)
                osw.write(str + "\n");
            else
                osw.write(str);
            osw.flush();

            BufferedReader bf = new BufferedReader(isr);

            return bf.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
