package loopproject;

import java.util.Random;

public class UseRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rm = new Random(1000);
		int [] array = new int[10];
		for(int i =0;i<array.length;i++){
		     array[i] = rm.nextInt();
		}
		//rm.close();
		
		 for(int j=0; j<array.length;j++){
			 
			 System.out.println("ANSwer:" + " " + array[j]);
			 
		 }
	}

}
