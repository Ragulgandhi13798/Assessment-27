package test1.com;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		int i,j,n,space=1;
		System.out.println("Enter the number of rows");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(j=1;j<=n+1;j++)
		{
			for(i=1;i<=space;i++)
			{
				System.out.print(" ");
				}
				space++;
				for(i=1;i<=2* (n-j)+1;i++)
				{
					System.out.print("*");
				}
				System.out.println(" ");
			}

	}}



