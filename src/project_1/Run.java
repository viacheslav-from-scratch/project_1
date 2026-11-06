import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Run {
    protected Console console = System.console();
    private XMLManager xmlManager = new XMLManager();
    private Validate validate = new Validate();
//    private AdvancedStream
    private final List<String> commands = new ArrayList<>();

    public Run() {
        commands.add("open");
        commands.add("save");
        commands.add("saveas");
        commands.add("close");
        commands.add("help");
        commands.add("exit");
    }

    public int count(){
        return commands.toArray().length;
    }

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
        System.out.println(args);
    }

    public boolean executable(String args){
        for (int i = 0; i < this.count(); i++) {
            if (commands.contains(args))
                return true;
        }
        return false;
    }
}