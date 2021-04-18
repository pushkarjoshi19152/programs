


 class p3 {
	public static void main (String args[ ]) {
		try {
			int i = args.length;	 
            
			String myString[] = new String[3];	
	// If i = 0 then  myString null pointer error
          
				System.out.println("First word is Java !");
				System.out.println( " Number of arguments = " + i );
	           
				int y[ ] = {555, 999};
                int x = 18/ i; 	
	
				y[ i ] = x;

			}
			catch (ArithmeticException  e ) { 		// To catch the error at #2
				System.out.println ( " Div by 0 : "+ e );
			}
			catch (NullPointerException  e ) {		// To catch the error at #1
			System.out.println ( "A null pointer exception :" + e ); 
			} 
			catch (ArrayIndexOutOfBoundsException e ) { 
	
				System.out.println ("Array Index OoB : " + e);
		}
	}
}
 