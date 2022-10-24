package EX2;

public class MaxAndMinTest {
	
	public static int minValue(int[] arr) {
		int min = arr[0];
		for(int n : arr) {
			if(n < min)
			{
				min = n;
			}
		}
		return min;
	}
	
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for(int n : arr) {
			if(n > max)
			{
				max = n;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {52, 23, 45, 89, 77};
		
		System.out.println("최소값 : " + minValue(arr));
		System.out.println("최대값 : " + maxValue(arr));
	}
}
