public class BookOrderTest {
	public static void main(String[] args) {

	System.out.println("===== 도서 구입 목록 =====");

	int java = 24000;
	int jquery = 21000;
	int oracle = 19000;
	int spring = 35000;

	int total = java + jquery + oracle + spring;
	double discount = total * 0.15;
	double distotal = total - discount;

			System.out.println(" JAVA : " + java);
			System.out.println(" Jquery : " + jquery);
			System.out.println(" 오라클 : " + oracle);
			System.out.println(" 스프링 : " + spring);

			System.out.println(" --------------------------");

			System.out.println(" 주문 총 금액 : " + total+ "원");
			System.out.println(" 할인 후 결제 금액 : " + (int)distotal + "원");



	}
}
