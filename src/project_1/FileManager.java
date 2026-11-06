import java.io.*;

// a lot of unrealized functions here, and it more complex here to explain
// I text below my comments, what it should be.
// plus, in other words, this is File, but more advanced for example for AutoSaving or just Saving
// maybe I will create new Class, for Saving and AutoSaving, the hard here is
// Saving - we save only when we write save
// SavingAnyway - is more complex for explain, but
//      if we have immediately broken at the moment, when we are using app = SavingAnyway is working
//      it should Save in any Our Action, but it Saves info in Temporary File, not in the final file.
//      AutoSaving using Auto Save final file, every 5 minutes
//      maybe we need settings for turn off/turn on, and maybe basically it should be turned off
//      because my project don't requeried any AutoSaving, but still more functional for use it in more cases.
// AutoSaving - i think you get this mechanics from text above
public class FileManager extends Validator {
    public FileManager(InputStreamReader isr, OutputStreamWriter osw) {
        super(isr, osw);
    }

//  Basic Idea:
//
//    Advanced Functions:
//          openAndRead
//          openAndWrite
//          openAndAppend

//    AutoSave Functions - @Maybe need new class for that@
//          Saving
//          SavingAnyway
//          AutoSaving
//

//    Basic:
//          write
//          read
//          close
//          append

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

