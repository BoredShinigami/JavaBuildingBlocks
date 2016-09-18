import java.io.*;
public class WriteFile
{
     public static void main(String[] args)
     {
         try
         {
            FileWriter file = new FileWriter("C://MyJava/tam.txt");
            
            BufferedWriter buffer = new BufferedWriter(file);
            buffer.write("Yo listen up here's a story");
            buffer.newLine();
            buffer.write("About a little guy that lives in a blue world");
            buffer.newLine();
            buffer.write("And all day and all night and everything he sees");
            buffer.newLine();
            buffer.write("Is just blue like him, inside and outside");
            buffer.close();
         }
         catch(IOException e)
         {
             System.out.println("Error");
         }
     }
}
