package chap4;

public class ClassVar{
	public static void main(String[] args) {
		InstCnt.instNum-=15;
		System.out.println(InstCnt.instNum);
		InstCnt cnt1 = new InstCnt();
		System.out.println(InstCnt.instNum);
		InstCnt cnt2 = new InstCnt();
	}
}