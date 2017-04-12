package MN_maven;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //System.out.println("Test Eclipse - exercice 7");
        
        //int maximum = max(2,5); 
        //System.out.println(maximum);
        
        App app = new App();
        
        int monmax = 0;
        try {
        	CSVReader reader = new CSVReader(new FileReader("data.csv"), ';');
        	
        	List<String[]> myEntries = reader.readAll();
        
        	for(String[] l : myEntries){
        		for(String nb : l){
        			System.out.println("Nombre lu " + nb);
        			monmax = app.max(monmax, Integer.parseInt(nb));
        		}
        	}
        	System.out.println("MAXIMUM : " +monmax );
        	reader.close();
        } catch (IOException e){
        	e.printStackTrace();
        }
    }
    
    public int max(int a, int b){
    	//return a>b ? a:b ;
    	return a;
    }
}
