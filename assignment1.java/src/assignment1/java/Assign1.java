package assignment1.java;

import java.util.*;

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("number of rows");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++){
				System.out.print(j);
				}
			for (int j=i;j>=1;j--) {
				//System.out.print(j-1);
				if ((j-1)==0) {System.out.print("");}
				else {System.out.print((j-1));
				}
				}
				//for (int j=2;j<=i;j++) {
					//System.out.print(j);	
			//}
			System.out.println("");
			}
		
		
		

	}

}
