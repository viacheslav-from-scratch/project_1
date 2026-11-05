import java.io.File;
import java.io.InputStream;

public class Console extends StreamManager {

    public Console(InputStream is) {
        super(is);
    }

    public void open(File file){

    }
    public void save(){

    }
    public void saveas(File file){

    }
    public void help(){

    }
    public void exit(){
        System.exit(0);
    }
}
