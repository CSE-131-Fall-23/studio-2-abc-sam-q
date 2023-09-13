package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Whats your start amount");
		int startAmount = in.nextInt();
		System.out.println("Whats your win chance");
		int winChance = in.nextInt();
		System.out.println("Whats your win limit");	
		int winLimit = in.nextInt();
		
		int win= 1;
		int lose =-1;
		
		
		
		
		while (startAmount >=1&& startAmount<winLimit){
			int number = (int)(Math.random()*(100-1+1)+1);
			if (number <= winChance) {
				startAmount++;
			}
				
			else {
				startAmount--;
				
			}
		}
		if (startAmount>=1)
			System.out.println("win" );
		else
			System.out.println("lose");
		
	}
}	
		
				


