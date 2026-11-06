import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// if open is oepn = isn't Validate, if open is open = is Validate
public class CommandValidator extends AdvancedFunctional {
    public Validator(InputStreamReader isr, OutputStreamWriter osw) {
        super(isr, osw);
    }

    @Override
    public void open(File file) {

    }

    @Override
    public void save() {

    }

    @Override
    public void saveAs(File file) {

    }

    @Override
    public void help() {

    }

    @Override
    public void exit() {

    }

    @Override
    public void somethingMore() {

    }
}
