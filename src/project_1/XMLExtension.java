import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public abstract class XMLExtension extends FileValidator {
    public XMLExtension(InputStreamReader isr, OutputStreamWriter osw) {
        super(isr, osw);
    }

    public abstract void open(String str);

    public abstract void save();

    public abstract void saveAs(String str);

    public abstract void help();

    public abstract void exit();

    public abstract void import_();

    public abstract void export();

    public abstract void xmlExtension();
}
