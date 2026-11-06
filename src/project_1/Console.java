import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Console extends FileManager {
    public Console(InputStreamReader isr, OutputStreamWriter osw) {
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
