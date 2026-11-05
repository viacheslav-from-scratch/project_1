import java.io.*;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void main(String[] args) throws IOException {
//        StreamManager streamManager = new StreamManager(System.in);

        // https:// www.bael dung.com/java-lang-system

//        InputStreamReader isr = new InputStreamReader(System.in);
////        OutputStreamWriter osw = new OutputStreamWriter(System.out);
////
//////        while (isr.read() != -1) {
////
//////        }
////        int data = isr.read();
////        while(data != -1){
////            char theChar = (char) data;
////            data = isr.read();
////            osw.write(theChar);
////        }
////
////        isr.close();

        // https:// jen kov.com/tutorials/java-io/input stream reader.html
        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);

        int data = isr.read();
        while(data != -1) {
            osw.write((char) data);
            osw.flush();
            data = isr.read();
        }



//        osw.write("Hello, World!");

//        osw.write(isr.read());
//        String a = ;
//        isr.close();


//        while (osw.write(a) != -1) {

//        }
//        osw.write(a);
//        osw.flush();

//        System.setOut(new PrintStream("filename.txt"));

//        Console console = new Console();
        // ve are validating properly "something", and if it is true -> then work
        // if it validates, then console should open validated file
        // and

        // example explaining what I do
        // we use Validate class for Validate open/close/save/saveas/help/exit
        // if it is true, then we could go further?
        // when console open the file
        // and write output or something like that
        // wait until I write and more think
//        new Validate(console.open(new Validate(new File())));
    }
}

//open <file>
//close
//save
//saveas <file>
//help
//exit