import java.util.ArrayList;
import java.util.List;

public class DramaListTest {
	public static void main(String[] args) {

		List<Drama> list = new ArrayList<Drama>();
		System.out.println("����Ʈ�� ũ��� : " + list.size());

//		String str[] = new String[4];

		Drama dra = new Drama("1. �� �ܿ� �ٶ��� �д�.", "SBS", "�����", "���μ�", "������");
		Drama dra1 = new Drama("2. ����� ���� ", "MBC", "�ּ���", "", "");
		Drama dra2 = new Drama("3. ���̸��� 2 ", "KBS", "ǥ�μ�", "����", "�̴���");
		Drama dra3 = new Drama("4. �ְ�� �̼��� ", "KBS", "������", "", "������");

		list.add(dra);
		list.add(dra1);
		list.add(dra2);
		list.add(dra3);

		System.out.println("����Ʈ�� ũ��� : " + list.size());

		int len = list.size();
		for (int i = 0; i < len; i++) {
			System.out.println(dra);
			System.out.println(dra1);
			System.out.println(dra2);
			System.out.println(dra3);
			break;
		}

	}
}
