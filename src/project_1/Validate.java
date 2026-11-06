import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Validate extends AdaptiveStream {
    public Validate(InputStreamReader isr, OutputStreamWriter osw) {
        super(isr, osw);
    }

    @Override
    public void open(File file) {
        super.open(file);
    }
}
