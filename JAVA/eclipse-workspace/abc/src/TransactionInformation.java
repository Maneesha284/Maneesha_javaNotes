import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TransactionInformation {

	public static void main(String[] args) {

        try {    
        	//CREATE FILE 
        	
        	File f = new File("records.txt");
            FileInputStream file = new FileInputStream(f); 
            ObjectInputStream in = new ObjectInputStream(file);    
            
            String givenDate= "mm/dd/yyyy";           
            Date today=new Date();
            SimpleDateFormat sdf = new SimpleDateFormat(givenDate);
            String s=sdf.format(today);
            
            //HERE WRITE LOGIC
            
            in.close(); 
            file.close();              
             
            //YOU JUST PRINT OUTPUT
            System.out.println(""); 
            
        }           
        catch(IOException e)  { 
            System.out.println("IOException is caught"); 
        } 
	}

}
