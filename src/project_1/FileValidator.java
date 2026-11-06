import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// if file.txt is file.ttx = isn't Validate, if file.txt is file.txt = is Validate
public class FileValidator extends AdvancedFunctional, XMLExtension {
    public FileValidator(InputStreamReader isr, OutputStreamWriter osw) {
        super(isr, osw);
    }

    @Override
    public void open(File file) {
        super.open(file);
    }

    @Override
    public void save() {
        super.save();
    }

    @Override
    public void saveAs(File file) {
        super.saveAs(file);
    }

    @Override
    public void help() {
        super.help();
    }

    @Override
    public void exit() {
        super.exit();
    }
}
