package chap4;

public class InstCnt {
	static int instNum = 100;
	
	InstCnt(){
		instNum++;
		System.out.println("인스턴스 생성 :"+instNum);
	}
}
