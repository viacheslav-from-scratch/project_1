import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// basic functions for Validate, Console, FileManager, they are use the same functions
public abstract class BasicFunctional extends AdvancedStream {
    public BasicFunctional(InputStreamReader isr, OutputStreamWriter osw) {
        super(isr, osw);
    }

    public abstract void open(String str);

    public abstract void save();

    public abstract void saveAs(String str);

    public abstract void help();

    public abstract void exit();
}
