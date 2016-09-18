import java.io.*;
class ReadFile
{
    public static void main(String[] args)
    {
        try 
        {
            FileReader file = new FileReader("C://Users/jamie_000/Documents/Script/Aliens.txt");
            BufferedReader buffer = new BufferedReader( file );
            String line = "";
            
            while((line = buffer.readLine()) != null)
            {
                System.out.println(line);
            }
            buffer.close();
        }
        catch ( IOException e )
        {
            System.out.println("A read error has occured");
        }
        
    }
}
