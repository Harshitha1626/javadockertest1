import java.util.Scanner;
public class Palindrome{
	public static void maim(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = nextInt(),rev = 0,temp = num;
		while(n>rev)rev=rev*10+n%10,n/10=0;
		System.out.println(temp==rev? "Palindrome:" "Not palindrome:");
		sc.close();
	}
}
