

import java.util.Scanner;


    class DivideZero {
       
		static int anyFunction (int x, int y ){
			try {
              
				int a = x/y;
				return a;
			} 
			catch (ArithmeticException e) {
				System.out.println ( "Division by zero" );
			}
			return 0;
		}
		public static void main (String args[]) {
            Scanner sc=new Scanner(System.in);
			int a,b, result;
			a=0;
			b=0;
			System.out.print("Enter any two integers : ");
			try{
			a = sc.nextInt();
			b =sc.nextInt();
			}catch(Exception e){}
			result  = anyFunction (a, b); 
			System.out.println ( "Result : " + result);
            sc.close();
		}
	}

    

