package chap4;

import java.util.Scanner;

public class vectorPositionControl {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x, y, z;
	
		System.out.println("이동할 위치값을 입력해주세요.");
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		
		vector vector3 = new vector();
		
		vector3.movefront(x);
		vector3.moveright(y);
		vector3.jump(z);
		vector3.checkPostion();
	}
}
