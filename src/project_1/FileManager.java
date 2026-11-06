import java.io.*;

public abstract class FileManager extends XMLExtension {
    public FileManager(InputStreamReader isr, OutputStreamWriter osw) {
        super(isr, osw);
    }

    public String openAndRead(File file){
        try {
            FileReader fileReader = new FileReader(file);
            return fileReader.toString();
        } catch (FileNotFoundException fnfe) {
            System.err.println(fnfe);
            fnfe.printStackTrace();
        } finally {
            System.out.println("Finally, we don't corrupt your file, try again.");
        }

        return null;
    }
    public String openAndWrite(File file){

        try{
            FileWriter fileWriter = new FileWriter(file);
            return fileWriter.toString();
        } catch (IOException ioe) {
            System.err.println(ioe);
            ioe.printStackTrace();
        } finally {
            System.out.println("Finally, we don't corrupt your file, try again.");
        }

        return null;
    }
    public String openAndAppend(File file){
        try {
            FileWriter fileWriter = new FileWriter(file);
            return fileWriter.toString();
        } catch (IOException ioe) {
            System.err.println(ioe);
            ioe.printStackTrace();
        } finally {
            System.out.println("Finally, we don't corrupt your file, try again.");
        }

        return null;
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

