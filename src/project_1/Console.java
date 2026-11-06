public class Console {
    private FileManager fileManager = new FileManager();
    private Validator validator = new Validator();
    private AdvancedStream stream = new AdvancedStream();

    public void open(String[] args){
        if(validateCommand(args[0])){
            if(validateFile(args[1])){
                if(validateCommand(args[0]) && validateFile(args[1])){
                    System.out.println("true");
                } else System.out.println("false");
            } else System.out.println("false");
        } else System.out.println("false");
    }

    public void save(String[] args){
        if(validateCommand(args[0])){
            System.out.println("true");
        } else System.out.println("false");
    }

    public void saveAs(String[] args){
        if(validateCommand(args[0])){
            if(validateFile(args[1])){
                if(validateCommand(args[0]) && validateFile(args[1])){
                    System.out.println("true");
                } else System.out.println("false");
            } else System.out.println("false");
        } else System.out.println("false");
    }

    public void help(String[] args){
        if(validateCommand(args[0])){
            System.out.println("true");
        } else System.out.println("false");
    }

    public void close(String[] args){
        if(validateCommand(args[0])){
            System.out.println("true");
        } else System.out.println("false");
    }

    public void exit(String[] args){
        if(validateCommand(args[0])){
            System.out.println("true");
        } else System.out.println("false");
    }

    public void run(String[] args){

//        open(args);
//        save(args);
//        saveAs(args);
//        help(args);
//        close(args);
//        exit(args);
    }
}