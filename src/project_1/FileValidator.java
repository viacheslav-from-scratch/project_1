import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// if file.txt is file.ttx = isn't Validate, if file.txt is file.txt = is Validate
public abstract class FileValidator extends CommandValidator {
    public FileValidator(InputStreamReader isr, OutputStreamWriter osw) {
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
