import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// if open is oepn = isn't Validate, if open is open = is Validate
public abstract class CommandValidator extends AdvancedFunctional {
    public CommandValidator(InputStreamReader isr, OutputStreamWriter osw) {
        super(isr, osw);
    }

    public abstract void open(String str);

    public abstract void save();

    public abstract void saveAs(String str);

    public abstract void help();

    public abstract void exit();

    public abstract void import_();

    public abstract void export();
}
