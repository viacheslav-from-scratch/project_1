import java.io.File;
import java.io.InputStream;
import java.io.OutputStreamWriter;

public class Console extends AdaptiveStream {

    public Console(InputStream is, OutputStreamWriter osw) {
        super(is, osw);
    }

    public void open(File file){

    }
    public void save(){

    }
    public void saveAs(File file){

    }
    public void help(){

    }
    public void exit(){
        System.exit(0);
    }
}
