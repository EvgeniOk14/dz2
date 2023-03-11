import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class workWithFile
 {
    
        public static void createFile()
        {
            File file = new File("logger.txt");
            if (!file.exists())
            {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        /*public static void writeFile(String value)
        {
            try
            {
                FileWriter fw = new FileWriter("logger.txt", true);
                
                fw.write("Сортировка №" + i +": " + value + "\n");
                fw.append("\n");
                fw.flush();
                fw.close();
            }
            catch(IOException ex) 
            {
                System.out.println(ex.getMessage());
            }
        }*/
 
}       


       


    

