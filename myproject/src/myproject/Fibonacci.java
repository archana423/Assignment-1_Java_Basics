package myproject;

public class Fibonacci {
	static int fibb(int n)
	{
		
		if (n <= 1)
		return n;
        
		return fibb(n - 1) + fibb(n - 2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO");
		int N = 20;
        int s=0;
       
       // Print the first 20 numbers
       System.out.print("The first 20 Fibonacci numbers are" +  " ");
       for (int i = 0; i < 20; i++) {

        // Sum to find the average first 20 numbers
         s=s+fibb(i); 
         System.out.print(fibb(i) + " ");
         }
       // Print the average of first 20 numbers
       System.out.println("the average is;"+ s/N); 

	}

}
