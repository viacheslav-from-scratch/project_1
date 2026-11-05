import java.io.*;

public class StreamManager {
    private InputStream is;

    public StreamManager(InputStream is) {
        this.is = is;
    }

    public String output(String str){
//        try (InputStream is = new ByteArrayInputStream(str.getBytes())) {
//
//            int byteRead;
//            while ((byteRead = is.read()) != -1) {
//                this.str += (char) byteRead;
//            }
//
//            System.out.println("End of stream reached");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        return this.str;
    }

//    public void input(){
//
////        OutputStream os = new OutputStream();
////        os.write(abc.getBytes());
//    }

    public void in(){
//        OutputStream os = new OutputStream();
//        os.write(abc.getBytes());
    }
}
