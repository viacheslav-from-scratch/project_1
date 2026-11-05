import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Console extends AdaptiveStream {

    public Console(InputStreamReader isr, OutputStreamWriter osw) {
        super(isr, osw);
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
