import java.io.ByteArrayInputStream;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String str = "";

        for (String arg : args) {
            str += new StreamManager(new ByteArrayInputStream(arg.getBytes()));
        }

        Console console = new Console();
        // ve are validating properly "something", and if it is true -> then work
        // if it validates, then console should open validated file
        // and

        // example explaining what I do
        // we use Validate class for Validate open/close/save/saveas/help/exit
        // if it is true, then we could go further?
        // when console open the file
        // and write output or something like that
        // wait until I write and more think
        new Validate(console.open(new Validate(new File())));

        String str = "";
        for (String arg : args){  // https:// zetcode.com/java/io-input stream/
            str += arg;
        }

//        InputStreamReader isr = new InputStreamReader(new InputStream(io.output(str)));
        System.out.println(io.output(str));

        io.output.println();



    }
}

//open <file>
//close
//save
//saveas <file>
//help
//exit