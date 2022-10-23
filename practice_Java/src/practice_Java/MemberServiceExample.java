package practice_Java;
import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberService s = new MemberService();
		
		System.out.println("id와 password를 입력해주세요");
		String id= sc.nextLine();
		System.out.println(id);
		String password=sc.nextLine();
		System.out.println(password);
		boolean c = s.login(id, password);
		

		System.out.println(c);
		s.logout(password);
		
		
		
		
	}
}
