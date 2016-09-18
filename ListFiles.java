import java.io.*;
class ListFiles
{
    public static void contents(String dir)
    {
        File directory = new File(dir);
        
        if(directory.exists())
        {
            String[] files = directory.list();
            System.out.println(files.length + " files found...");
            for(int i = 0; i < files.length; i++)
            {
                 System.out.println(files[i]);
            }
        }
        else
        {
            System.out.println("Folder not found...");
        }
    }
}