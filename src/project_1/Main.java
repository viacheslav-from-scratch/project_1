import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        // https:// jen kov.com/tutorials/java-io/input stream reader.html
        AdaptiveStream stream = new AdaptiveStream(new InputStreamReader(System.in),
                new OutputStreamWriter(System.out));

//        input()
//        print()

        String originalString = "randomAlphabetic(8)";
        InputStream inputStream = new ByteArrayInputStream(originalString.getBytes());

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[1024];
        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        buffer.flush();
        byte[] byteArray = buffer.toByteArray();

        String text = new String(byteArray, StandardCharsets.UTF_8);
        System.out.println(text);
//        assertThat(text, equalTo(originalString));

        stream.input();
        stream.print("everything");
//        System.out.println(str);
//        adaptiveStream.out(str);

//      Console console = new Console();
        // ve are validating properly "something", and if it is true -> then work
        // if it validates, then console should open validated file
        // and

        // example explaining what I do
        // we use Validate class for Validate open/close/save/saveas/help/exit
        // if it is true, then we could go further?
        // when console open the file
        // and write output or something like that
        // wait until I write and more think
//      new Validate(console.open(new Validate(new File())));
    }
}

//open <file>
//close
//save
//saveas <file>
//help
//exit