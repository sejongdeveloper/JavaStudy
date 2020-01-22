package ch10;

import java.text.DecimalFormat;

public class DecimalFormatEx2 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df.parse("1,234,567.89");
			System.out.print("1,234,567.89" + " -> ");
			
			double d = num.doubleValue();
			System.out.print(d + " -> ");
			
			System.out.println(df2.format(d));
			
			// 소수점 제외한 나머지 정수부분의 소수점자리 갯수 = E옆의 갯수
			// 1.23E5 = 1.23000
			// 1.1E5  = 1.10000
			System.out.println("=====================");
			System.out.println(d);
			System.out.println(df2.parse(df2.format(d)));
			Number num2 = df.parse("1,234,567,890.999999");
			System.out.println(num2);
			System.out.println(df2.format(num2));
			System.out.println(df2.parse(df2.format(num2)));
			
		
		} catch (Exception e) {}
	} // main
}
