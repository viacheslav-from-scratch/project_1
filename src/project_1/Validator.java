public class Validator {
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
}
