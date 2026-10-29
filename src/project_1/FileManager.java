import java.io.*;

public class FileManager {
//
//
//    openAndRead
//    openAndWrite
//    openAndAppend
//    write
//    read
//    close
//    append

//

    /* adding auto Temporarly File, for Example if you do not Save the file or AutoSave isn't react, so, you can save your file even after if you close the program */
//    autoTemp

    /* wrap to anykind of writing text to file implementation, autoSave every 5 minutes */
//    autoSave

    /* wrap to anykind of Files implementation, auto save file every 5 minutes*/
//    autoFileSave

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
//
//
}

