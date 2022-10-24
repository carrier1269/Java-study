package EX2;

public class UseCircle {
	  public static void main(String[] args) {
	    // 좌표 [2, 2] 반지름 4인 원의 생성
	    Circle c = new Circle(2, 2, 4);
	    // 원의 정보 출력
	    c.showCircleInfo();
	  }
	}


class Circle
{
  int rad;	
  Point center;    
  
  public Circle(int x, int y, int r) {
      center = new Point(x, y);
      rad = r;
  }
  
  public void showCircleInfo() {
      System.out.println("radius: " + rad);
      center.showPointInfo();
  }
}


