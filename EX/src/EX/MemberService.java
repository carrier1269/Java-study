package EX;

public class MemberService {

	public boolean login(String id, String password)
	{
		if(id=="hong"&password=="12345")
		{
			logout(id);
			return true;
			
		}
		else
		{
			return false;
		}
	}
	
	public void logout(String id)
	{
		System.out.println(id + "로그아웃 되었습니다.");
	}
		
}
