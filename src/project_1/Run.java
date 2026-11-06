import java.io.Console;

public class Run {
    protected Console console = System.console();
    private XMLManager xmlManager = new XMLManager();
    private Validate validate = new Validate();
//    private AdvancedStream

    public void open(String[] args){
        if(validate.command(args[0])){
            if(validate.file(args[1])){
                if(validate.command(args[0]) && validate.command(args[1])){
                    System.out.println("true");
                } else System.out.println("false");
            } else System.out.println("false");
        } else System.out.println("false");
    }

    public void save(String[] args){
        if(validate.command(args[0])){
            System.out.println("true");
        } else System.out.println("false");
    }

    public void saveAs(String[] args){
        if(validate.command(args[0])){
            if(validate.file(args[1])){
                if(validate.command(args[0]) && validate.file(args[1])){
                    System.out.println("true");
                } else System.out.println("false");
            } else System.out.println("false");
        } else System.out.println("false");
    }

    public void help(String[] args){
        if(validate.command(args[0])){
            System.out.println("true");
        } else System.out.println("false");
    }

    public void close(String[] args){
        if(validate.command(args[0])){
            System.out.println("true");
        } else System.out.println("false");
    }

    public void exit(String[] args){
        if(validate.command(args[0])){
            System.out.println("true");
        } else System.out.println("false");
    }

    public void execute(String args){
        for (String arg : args) {
            open(args);
            save(args);
            saveAs(args);
            help(args);
            close(args);
            exit(args);
        }
    }

    public boolean executable(String args){

    }
}