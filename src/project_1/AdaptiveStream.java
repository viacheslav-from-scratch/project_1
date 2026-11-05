import java.io.*;

// https:// www.bael dung.com/convert-input-stream-to-string
public class AdaptiveStream {
    private InputStream is;
    private OutputStreamWriter osw;

    public AdaptiveStream(InputStream is, OutputStreamWriter osw) {
        this.is = is;
        this.osw = osw;
    }

    public String input() {
        is = new ByteArrayInputStream(originalString.getBytes());
//        try {
//            int data = this.isr.read();
//            while(data != -1) {
//                osw.write((char) data);
//                osw.flush();
//                data = this.isr.read();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return "nothing";
    }

    public void print(String str) {
//    PrintWriter
    osw = new OutputStreamWriter(System.out);
        try {
            int data = isr.read();
            while(data != -1) {
                osw.write((char) data);
                osw.flush();
                data = isr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//    public String out(String str){
//
//        osw = new OutputStreamWriter(System.out);
//        try {
//            int data = isr.read();
//            while(data != -1) {
//                osw.write((char) data);
//                osw.flush();
//                data = isr.read();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
