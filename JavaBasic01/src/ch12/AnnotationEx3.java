package ch12;

import java.util.ArrayList;

class NewClass2 {
	int newField;
	
	int getNewField() {
		return newField;
	}
	
	@Deprecated
	int oldField;
	
	@Deprecated
	int getOldField() {
		return oldField;
	}
}
/*
 *  deprecation : deprecation인걸 사용할때 경고억제
 *  unchecked : 지네릭스를 지정하지 않을 때 경고억제
 *  rawtypes : 지네릭스를 사용하지 않을 때 경고억제
 *  varargs : 가변인자가 지네릭스일 때 발생하는 경고억제
 */
public class AnnotationEx3 {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		NewClass2 nc = new NewClass2();
		
		nc.oldField = 10; // @Deprecated가 붙은 대상을 사용
		System.out.println(nc.getOldField()); // @Deprecated가 붙은 대상을 사용
		
		@SuppressWarnings({"unchecked", "rawtypes"}) // 지네릭스 관련 경고를 억제
		ArrayList<NewClass2> list = new ArrayList(); // 타입을 지정하지 않음.
		list.add(nc);
	}
}
