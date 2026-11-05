import java.io.*;
import java.util.Scanner;

// https:// www.bael dung.com/convert-input-stream-to-string
//https:// www.java thinking.com/blog/guide-to-system-in-read/
public class AdaptiveStream {
//    private InputStream is;
    private OutputStreamWriter osw;

    public AdaptiveStream(/*InputStream is,*/ OutputStreamWriter osw) {
//        this.is = is;
        this.osw = osw;
    }

    public String input() throws IOException {

//        InputStream inputStream = new ByteArrayInputStream(str.getBytes());
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
//        return new String(byteArray, StandardCharsets.UTF_8);
        return "nothing";
    }

    public void print(String str) throws IOException {

//        System.out.print((char) is.read()); // Read a character
//        String line = reader.readLine();
//        System.out.println("You entered: " + line);

        InputStream is = new ByteArrayInputStream(str.getBytes());
        OutputStreamWriter osw = new OutputStreamWriter(System.out);

        int ch;
        while ((ch = is.read()) != -1) {
            osw.write((char) ch);
            osw.flush();
        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
        // Read the entire line as a string and convert it to an integer
//        int number = Integer.parseInt(scanner.nextLine());
//        System.out.println("You entered: " + number);
//        scanner.close();
    }
}
