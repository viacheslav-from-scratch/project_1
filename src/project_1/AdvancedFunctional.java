import java.io.File;

// more than just open...save...exit
public abstract class AdvancedFunctional extends BasicFunctional {
    public abstract void open(File file);

    public abstract void save();

    public abstract void saveAs(File file);

    public abstract void help();

    public abstract void exit();

    public abstract void somethingMore();
}
