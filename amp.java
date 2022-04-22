package ampprogram;

import java.util.Scanner;

public class amp {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n;
	int temp;
	int sum=0;
	int digits=0;
	int r;
	
	
	n = sc.nextInt();
	temp =n;
	int s = n*n;
	
	while(n!=0)
	{
		
	 r = n%10;
	 n=n/10;
	 digits++;
	 }
	
	while(digits<=2)
	{
		int r1 = n%10;
		temp = temp/10;
		sum = sum+r1*10;
	}
	
	int sum1;
	sum1 = s%10;
	
	
}
	}


