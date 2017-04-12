package MN_maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Test Eclipse - exercice 7");
        
        int maximum = max(2,5);
        
        System.out.println(maximum);
    }
    
    public static int max(int a, int b){
    	return a>b ? a:b ;
    	//return a;
    }
}
