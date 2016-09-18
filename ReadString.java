import java.io.*;
public class ReadString
{
   public static void main(String[] args)
   {
       System.out.println("Enter the title of this program.");
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader buffer = new BufferedReader(isr);
       String input = "";
       
       try
       {
           input = buffer.readLine();
           buffer.close();
       }
       catch( IOException e)
       {
           System.out.println("An error occured");
       }
       System.out.println("This programme is titled - " + input);
   }
}
