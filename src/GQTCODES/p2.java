package GQTCODES;
import java.util.Scanner;
public class p2 {
	
	

	
	   
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the value of n");
			int n = sc.nextInt();
			for(int i=0;i<=n-1;i++) {
				
				for(int j=0;j<=n-1;j++) {
					
					if(j==0 || j==n/2 ||
					(i==n/2 && j<=n/2)||
					(i==0 && j <=n/2)){
					
					
					
						
					
				System.out.print("# ");
				}
					else {
						System.out.print("  ");
					}
			}
				System.out.println();
			}
		}
	}

