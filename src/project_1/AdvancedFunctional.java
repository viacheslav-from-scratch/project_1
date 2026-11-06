import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// more than just open...save...exit
public abstract class AdvancedFunctional extends BasicFunctional {
    public AdvancedFunctional(InputStreamReader isr, OutputStreamWriter osw) {
        super(isr, osw);
    }

    public abstract void open(String str);

    public abstract void save();

    public abstract void saveAs(String str);

    public abstract void help();

    public abstract void exit();
}
