package assign.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				Scanner sc=new Scanner(System.in);
				System.out.println("enter array size");
				int as=sc.nextInt();
			
				List<Integer> arr=new ArrayList<>();
				for(int i=0;i<as;i++) {
					System.out.println("input Number");
					arr.add(sc.nextInt());
				}
				System.out.print("Odd Numbers are");
				arr.forEach(s1->{if(s1%2!=0) 
				System.out.print(" "+s1);});
	}}
			

		

	


