import java.io.*;

// https:// www.bael dung.com/convert-input-stream-to-string
//https:// www.java thinking.com/blog/guide-to-system-in-read/
public class AdaptiveStream {
    private InputStream is;
    private OutputStreamWriter osw;

    public AdaptiveStream(InputStream is, OutputStreamWriter osw) {
        this.is = is;
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
        InputStream is = new ByteArrayInputStream(str.getBytes());
        System.out.print((char) is.read()); // Read a character
    }
}
