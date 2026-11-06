import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https:// docs.oracle.com/en/java/java se/21/docs/api/java.base/java/io/InputStream.html
//https:// www.youtube.com/watch?v=-xKg xqG411c
// Using Low Level Code, but still more reliable for using in high level
public abstract class AdvancedStream {
    protected InputStreamReader isr;
    protected OutputStreamWriter osw;

    public AdvancedStream(InputStreamReader isr, OutputStreamWriter osw) {
        this.isr = isr;
        this.osw = osw;
    }

    public abstract void print(String str);

    public abstract void print(String str, boolean end);

    public abstract String input();

    public abstract String input(boolean end);

    public abstract String input(String str);

    public abstract String input(String str, boolean end);
}
