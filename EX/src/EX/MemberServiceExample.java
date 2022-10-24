package EX;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService MS = new MemberService();
		
		String id = "hong";
		String password = "12345";
		
		System.out.println(MS.login(id,password));
		

	}

}
