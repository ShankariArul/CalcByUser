package Math;

import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		
				Scanner reader = new Scanner(System.in);
				
				System.out.print("Enter number A ");
				
				
			    int a = reader.nextInt();
			    
			    System.out.print("Enter number B");
			    
			    int b = reader.nextInt();
			    
			   
			    System.out.println(Math.subtractExact(a, b));
			    
			    System.out.println(Math.addExact(a, b));
			       

	}

}
