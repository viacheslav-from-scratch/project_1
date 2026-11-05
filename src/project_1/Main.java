import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        // https:// jen kov.com/tutorials/java-io/input stream reader.html
        AdaptiveStream stream = new AdaptiveStream(new ByteArrayInputStream(System.in.readAllBytes()),
                new OutputStreamWriter(System.out));

//        input()
//        print()

//        String originalString = "randomAlphabetic(8)";
//        InputStream inputStream = new ByteArrayInputStream(originalString.getBytes());
//
//        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
//        int nRead;
//        byte[] data = new byte[1024];
//        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
//            buffer.write(data, 0, nRead);
//        }
//
//        buffer.flush();
//        byte[] byteArray = buffer.toByteArray();
//
//        String text = new String(byteArray, StandardCharsets.UTF_8);
//        System.out.println(text);
//        assertThat(text, equalTo(originalString));

//        stream.input();
        stream.print("everything");
//        System.out.println(str);
//        adaptiveStream.out(str);

//      Console console = new Console();
//      new Validate(console.open(new Validate(new File())));
    }
}

//open <file>
//close
//save
//saveas <file>
//help
//exit