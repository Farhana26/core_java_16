package loopproject;

import java.util.Scanner;

public class ForWhileDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		for(int i=0;i<num;i++){
			{
				if(i % 2 == 0)
				{
					System.out.println(i + " " + "is even");
				}
				else
					System.out.println(i + " " + "is Odd");
				
			}
		}

		int a = 2;
		while(a<20){
			System.out.println("The number is :" + " " + a);
			a=a*2;
		}
	     int b = 10;
	     do{
	    	 if(b % 2 == 0)
	    	 {
	    		 System.out.println(b + " " + "is even");
				}
				else
					System.out.println(b + " " + "is Odd"); 
	    	  b++;
	    	 }
	        while(b<20);
	     }
	    		
	
	

}
