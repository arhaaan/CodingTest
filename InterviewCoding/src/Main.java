import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);

	public Main() {
		
		int n;
		
		n = sc.nextInt();
		sc.nextLine();
		
		int arr[];
		
		for(int i=1; i<=n; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.print(" Frontend Backend,");
			}else if (i%5 == 0) {
				System.out.print(" Backend,");
			}else if (i%3 == 0) {
				System.out.print(" Frontend,");
			}else {
				System.out.print(" "+i+",");
			}
			
		}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
