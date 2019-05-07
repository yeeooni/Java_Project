import java.util.*;

public class abstractTest1 {
	public static void main(String[] args) {

		//1. 하위 클래스 참조.
		Calendar cal1 = new GregorianCalendar();

		//2. 자신의 객체를 return 하는 static method.
		Calendar cal2 = Calendar.getInstance();

		int y = cal2.get(Calendar.YEAR);
		int m = cal2.get(Calendar.MONTH) + 1; //외국은 0부터 1월 시작 
		int d = cal2.get(Calendar.DATE);
		int h = cal2.get(Calendar.HOUR_OF_DAY);
		int mi = cal2.get(Calendar.MINUTE);
		int ss = cal2.get(Calendar.SECOND);

	System.out.println(y + "년 " + m + "월 " + d + "일 " + h + "시 " + mi + "분 " + ss + "초 "); 


	}
}