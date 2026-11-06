public class Console extends Validator {
    public boolean validateFile(String filename){
        if(filename.equals("has .txt")){
            return true;
        }
        return true;
    }

    public boolean validateCommand(String arg){
        if(arg.equals("open")){
            return true;
        }
        if(arg.equals("save")){
            return true;
        }
        if(arg.equals("saveas")){
            return true;
        }
        if(arg.equals("help")){
            return true;
        }
        if(arg.equals("close")){
            return true;
        }
        if(arg.equals("exit")){
            return true;
        }
        return false;
    }

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