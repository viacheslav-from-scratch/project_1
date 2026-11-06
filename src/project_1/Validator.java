import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// if open is oepn = isn't Validate, if open is open = is Validate
public class Validator extends AdvancedFunctional {
    public Validator(InputStreamReader isr, OutputStreamWriter osw) {
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
