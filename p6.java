

public class p6 {

    public static void main (String [ ] args ) {
    int i = 0;
    String greetings [ ] = {
        "Hello Twinkle !",
                "Hello Java !",
        "Hello World ! " };
     
    while ( i < 4) {
     try {
        System.out.println (greetings [i] );
         }catch (Exception e ) {
        System.out.println (e.toString());	// message of exception e in String format
        System.out.println("Resetting index value");
         
       } finally {
        System.out.println (" Hi !");
           i ++; 
                }
    } 	// while ( ) 
         } 	// main ( ) 
} // class 
