import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            // Update the file path to point to the correct location on the D drive
            String filename = "D:/Java/myfile.txt";
            FileWriter fw = new FileWriter(filename, true); 
            // Appends the string to the file
            fw.write("Java Exercises\n");
            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("D:/Java/myfile.txt"));
            // Read the file content
            while (strLine != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            
            br.close();
        } catch(IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}
