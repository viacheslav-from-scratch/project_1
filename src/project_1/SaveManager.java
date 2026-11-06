import java.io.*;

public abstract class SaveManager extends FileManager {
    public SaveManager(InputStreamReader isr, OutputStreamWriter osw) {
        super(isr, osw);
    }

    public String openAndRead(File file){

    }
    public String openAndWrite(File file){

    }
    public String openAndAppend(File file){

    }
    public void write(){

    }
    public void read(){

    }
    public void close(){

    }
    public void append(){

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
