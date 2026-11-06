public abstract class Validator extends FileManager {
    public abstract boolean validateFile(String filename);
    public abstract boolean validateCommand(String arg);
}
