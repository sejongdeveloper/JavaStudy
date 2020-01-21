package ch03_quiz;

public class Exercise3_2 {
	public static void main(String[] args) {
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket==0?0:1); // 모든 사과를 담는데 필요한 바구니의 수
		int numOfBucket2 = (int) Math.ceil(numOfApples*0.1);
		int numOfBucket3 = (int)(numOfApples*0.1+0.9);
		int numOfBucket4 = (int)(numOfApples/10.0+0.9);
				
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		System.out.println("필요한 바구니의 수2 :"+numOfBucket2);
		System.out.println("필요한 바구니의 수3 :"+numOfBucket3);
		System.out.println("필요한 바구니의 수4 :"+numOfBucket4);
	}
}
