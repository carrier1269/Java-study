package chap4;

class vector {
	
	int vector3x = 0;
	int vector3y = 0;
	int vector3z = 0;
	
	public int jump(int z) {
		vector3z += z;
		return vector3z;
	}
	
	public int movefront(int x) {
		vector3x += x;
		return vector3x;
	}
	
	public int moveback(int x) {
		vector3x -= x;
		return vector3x;
	}
	
	public int moveleft(int y) {
		vector3y -= y;
		return vector3y;
	}
	
	public int moveright(int y) {
		vector3y += y;
		return vector3y;
	}
	
	public void checkPostion() {
		System.out.println("현재 벡터의 위치는 :" + vector3x +" "+ vector3y +" "+ vector3z);
	}
}
