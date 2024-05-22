//program to delete File.
package delete_file;

import java.io.File;

public class FileDelete {
    public static void delete(String filename)
    {
        File file=new File(filename);
        if(file.delete())// using delete() method of the File class.
        {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("File not deleted");
        }
    }
}
