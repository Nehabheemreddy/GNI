package Day1;
import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char alp;
		alp=sc.next().charAt(0);
		if(alp=='a'|| alp=='e'|| alp=='i'|| alp=='o'|| alp=='u') {
			System.out.println("Alphabet is vowel");
		}else {
			System.out.println("Alphabet is consonant");
		}

	}

}
