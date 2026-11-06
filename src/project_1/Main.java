public class Main extends Run {
    public static void main(String[] args) {
        Run commands = new Run();
        for (int i = 0; i < commands.count(); i++) {
            if (commands.executable(args[0]))
                commands.execute(args[0]);
        }
    }
}

//open <file>
//close
//save
//saveas <file>
//help
//exit