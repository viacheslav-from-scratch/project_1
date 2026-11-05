import java.io.File;
import java.io.InputStream;

public class Console extends SmartStream {

    public Console(InputStream is) {
        super(is);
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
