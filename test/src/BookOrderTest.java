public class BookOrderTest {
	public static void main(String[] args) {

	System.out.println("===== ���� ���� ��� =====");

	int java = 24000;
	int jquery = 21000;
	int oracle = 19000;
	int spring = 35000;

	int total = java + jquery + oracle + spring;
	double discount = total * 0.15;
	double distotal = total - discount;

			System.out.println(" JAVA : " + java);
			System.out.println(" Jquery : " + jquery);
			System.out.println(" ����Ŭ : " + oracle);
			System.out.println(" ������ : " + spring);

			System.out.println(" --------------------------");

			System.out.println(" �ֹ� �� �ݾ� : " + total+ "��");
			System.out.println(" ���� �� ���� �ݾ� : " + (int)distotal + "��");



	}
}
