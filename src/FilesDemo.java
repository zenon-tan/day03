import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {

    public static void main(String[] args) {
        
        String filePath = "src/demo.txt";
        readFile(filePath);
        writeFile("src/pokemon.txt");


    }

    public static void readFile(String fname) {

        // Path Object
        Path pth = Paths.get(fname);
        File obj = pth.toFile();

        if(obj.exists()) {
            System.out.println("File Exists");

        } else {
            System.out.println("File not found");
        }

        // Reader object

        try {

            FileReader fr = new FileReader(obj);
            BufferedReader bdf = new BufferedReader(fr);
            String line;

            while(null != (line = bdf.readLine())) {

                System.out.println("> " + line);
                
            }

            bdf.close(); // Always close the reader after you're done
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getLocalizedMessage());
            
        } catch (IOException e) { 
            //IOException: file is there but unable to read
            System.out.println("Unable to read line: " + e.getLocalizedMessage());


        }

    }

    public static void writeFile(String fname){

        try {

            FileWriter fw = new FileWriter(fname, false);
            // fw.write("Mama\n");
            // fw.write("Haha\n");
            // fw.write("Lala\n");

            // BufferWriter is more efficient at writing to files

            BufferedWriter bfw = new BufferedWriter(fw);
            bfw.write("Mama2\n");
            bfw.write("Haha2\n");
            bfw.write("Lala2\n");


            bfw.flush(); //Ensures that all the changes are moved to the file
            bfw.close(); // Closes the writer after writing is done

            
        } catch (IOException e) {
            System.out.println("Unable to write: " + e.getLocalizedMessage());
            


    }
    
}
}
