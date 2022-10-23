package chap3;

public class CalcTest {

	public static void main(String[] args) {
		Calclurator c = new Calclurator();
		
		int sum = c.add(10, 20);
		System.out.println(sum);
		System.out.println(add(23.0, 56.5));

	}
	
	static double add(double a, double b) {return a+b;}

}
