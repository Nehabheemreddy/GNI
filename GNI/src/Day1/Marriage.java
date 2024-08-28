package Day1;
import java.util.Scanner;
public class Marriage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int male,female;
		male=sc.nextInt();
		female=sc.nextInt();
		if(female>18&&male>21) {
			System.out.println("he or she is elgible for marriage");
		}else {
			System.out.println("he or she is not elgible for marriage");
		}

	}

}
