package Day1;
import java.util.Scanner;
public class Oldest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c) {
			System.out.println("A is oldest");
		}else if(b>a&&b>c) {
			System.out.println("B is oldest");
		}else {
			System.out.println("C is oldest");
		}

	}

}
