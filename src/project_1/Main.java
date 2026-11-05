import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        StreamManager streamManager = new StreamManager(System.in);
//        for (String arg : args) {
//            System.out.println(streamManager);
//        }

        // https:// jen kov.com/tutorials/java-io/print writer.html
        // https:// jen kov.com/tutorials/java-io/input stream.html
        // https:// jen kov.com/tutorials/java-io/arrays.html
        // https:// www.youtube.com/watch?v=-xK gxqG411c

        // looks like buffer?
        byte[] bytes = new byte[16384];
        byte[] dinamicChars = "word".getBytes();
        //write data into byte array...
        for (byte dinamicChar : dinamicChars){
            bytes = dinamicChars;
        }

        InputStream input = new ByteArrayInputStream(bytes);


        //read first byte
        int data = input.read();
        while(data != -1) {
            //do something with data
            PrintStream printOut = (char) data;
            printOut.println();
            //read next byte
            data = input.read();
        }

//        OutputStream output = new FileOutputStream("c:\\data\\system.out.txt");
//        PrintStream printOut = new PrintStream(output);

//        Reader reader =

//        System.setOut(printOut);

//        FileWriter  writer      = new FileWriter("d:\\data\\report.txt");
//        PrintWriter printWriter = new PrintWriter(writer);

//        InputStream inputStream = System.in;

//        Reader inputStreamReader = new InputStreamReader(inputStream);
//        OutputStream os =
//        OutputStream output = new StringBuffer("c:\\data\\system.out.txt");
//        PrintStream printOut = new PrintStream(output);

//        System.setOut(printOut);

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