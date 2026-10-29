import java.io.*;

public class Main{
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/java/command-line-arguments-in-java/
        // https://www.baeldung.com/java-command-line-arguments
        // https://www.baeldung.com/java-blank-empty-strings
        // https://www.geeksforgeeks.org/java/java-array-empty-check/
        // https://www.geeksforgeeks.org/java/arrays-stream-method-in-java/
        // https://www.geeksforgeeks.org/java/system-exit-in-java/
        // https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/io/Console.html
        

        Console console = System.console();
        
        // for (int i = 0; i < args.length; i++) {
            // String arg = args[i];
            if ((console = System.console()) != null){
            //     (arg = con.readLine()) != null) {
                System.out.println(args[0]);
            }
            else {
                System.out.println("No args");
            }
            //         // java.util.Arrays.fill(passwd, ' ');
            // }
        // }

        // Scanner sc = new Scanner(con.reader());
        // System.in

        
        if(!console.isTerminal()){
            System.out.println("Do you use Terminal?");
        }

        // https://jenkov.com/tutorials/java-io/system-in-out-error.html
        // https://jenkov.com/tutorials/java-io/filereader.html
        // https://jenkov.com/tutorials/java-io/bufferedoutputstream.html
        
        // File file = new File("./example.txt");

        // try {
        //     try {

        //         InputStream input = new BufferedInputStream(
        //                 new FileInputStream(file));

        //         int data = input.read();

        //         while(data != -1){
        //             System.out.print((char) data);
        //             data = input.read();
        //         }

        //         OutputStream output = new FileOutputStream(file);
        //         output.write("Hello World".getBytes());
        //         output.close();

        //     } catch (FileNotFoundException fnfe) {
        //         System.err.println("File opening failed:");
        //         fnfe.printStackTrace();
        //     }
        // } catch (IOException ioe) {
        //     System.err.println("IO error:");
        //     ioe.printStackTrace();
        // }

        // InputStream input = new FileInputStream(file);

        // int data = input.read();

        // while(data != -1){
        //     data = input.read();
        // }
        // try {
        //     FileWriter fw = new FileWriter(file);
        //     System.out.println(fw.getEncoding());
        // } catch (IOException ioe) {

        // }
        
        
        // try {
        //     OutputStream output = new FileOutputStream(file);
        //     output.write("Hello World".getBytes());
        //     output.close();
        // } catch (Exception e) {
        // } finally {
        // }

        // try {
        //     try {
        //         // InputStream input = new FileInputStream(file);

        //         // int data = input.read();

        //         // while(data != -1){
        //         //     data = input.read();
        //         // }
                
        // } catch (FileNotFoundException fnfe) {
        //     System.err.println("File opening failed:");
        //     fnfe.printStackTrace();
        // }
        // } catch (IOException ioe) {
        //     System.err.println("IO error:");
        //     ioe.printStackTrace();
        // }
        

        

        // try {
        //     InputStream input = new FileInputStream(file);
        //     System.out.println("File opened...");
        // } catch (IOException e){
        //     System.err.println("File opening failed:");
        //     e.printStackTrace();
        // }

        // try {
        //     OutputStream output = new FileOutputStream(file);
        //     PrintStream printOut = new PrintStream(output);

        //     System.out.println("File opened...");

        //     System.setOut(printOut);
            
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        

        
        // try {
        //     Reader fileReader = new FileReader(file);

        //     int data = fileReader.read();
        //     while(data != -1) {
        //         // https://www.geeksforgeeks.org/java/java-int-to-char-conversion/
        //         System.out.print((char) data);

        //         data = fileReader.read();
        //     }
        //     fileReader.close();
        //     // InputStream input = new FileInputStream(file);
        //     // System.out.println("File opened...");

        //     // OutputStream output = new FileOutputStream(file);
        //     // PrintStream printOut = new PrintStream(output);

        //     // System.setOut(printOut);
        // } catch (FileNotFoundException fnfe) {
        //     System.err.println(fnfe);
        // } catch (IOException e){
        //     System.err.println("File opening failed:");
        //     e.printStackTrace();
        // }

        // try {
        //     OutputStream output = new FileOutputStream("/Users/Slavik/project_1/example.txt");
        //     PrintStream printOut = new PrintStream(output);

        //     System.setOut(printOut);
        // } catch (FileNotFoundException fnfe) {
        //     System.err.println(fnfe);
        // } finally {

        // }
        
        
        

        // System.out.println(console.writer());

        // if (con != null) {
        //     Scanner sc = new Scanner(con.reader());
        //     sc.nextLine();
        //     System.out.println(sc);
        // }
        



        // if(args.length <= 2){
        //     // exit
        //     if(args[0].equals("exit")){
        //         System.out.println("Exiting the program...");
        //         System.exit(0);
        //     }
            
        //     if(args.length != 1){
        //         for (int i = 0; i < args.length; i++)
        //         // open
        //             if(args[0].equals("open"))
        //                 CorrectFormat(args[1])
        //                 CorrectFormat == true
        //                     System.out.println(args[i]);
        //     } else
        //         if(args[0].equals("open"))
        //             System.out.println(
        //                 """
        //                 open: missing file operand
        //                 Try: 'open <file-path>'
        //                 or 'open help' for more information.
        //                 """
        //             );
        // }
        // else {
        //     System.out.println(
        //         """
        //         Too much argument.
        //         Try: 'help' - for more infor
        //         """
        //     );
        // }
    }
}