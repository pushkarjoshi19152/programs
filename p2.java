


class CommandLineInput {
    public static void main (String args[ ] )
    {

        
		 int number, InvalidCount = 0; 
         
         int validCount = 0;
        for (int i = 0; i < args.length; i++)  
       {
        try {
                number = Integer.parseInt(args[i]);
           }
            catch (NumberFormatException e)
           {
               InvalidCount++;
                   System.out.println ( "Invalid number at " + i + args[i]); 
           }
                     validCount++;
                 System.out.println ( "Valid number at " + i + args[i]);
            }
           System.out.println ( "Invalid entries: " + InvalidCount);
           System.out.println ( "Valid entries: "+ validCount);
    }
    }

