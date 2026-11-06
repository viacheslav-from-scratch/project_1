import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        AdaptiveStream stream = new AdaptiveStream(new InputStreamReader(System.in, StandardCharsets.UTF_8),
                new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

        for (String arg : args) {
            stream.print(arg);
        }

        stream.input("Hi: ");

//        stream.print(str);
//        System.out.println(str);
//        adaptiveStream.out(str);
//
//        Console console = new Console();
//        new Validate(console.open(new Validate(new File())));
    }
}

//open <file>
//close
//save
//saveas <file>
//help
//exit