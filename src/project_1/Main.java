import java.io.Console;

public class Main extends Run {
    public static void main(String[] args) {
        Run commands = new Run();
        for (int i = 0; i < args.length; i++)
            for(Run command : commands)
                if (command.executable(args[0]))
                    command.execute(args[0]);
}

//open <file>
//close
//save
//saveas <file>
//help
//exit