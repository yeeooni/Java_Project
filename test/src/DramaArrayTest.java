
public class DramaArrayTest {
	public static void main(String[] args) {

		System.out.println("<< �迭�� �̿��� ��� ���� >>");
//	
//	Drama d1 = new Drama("1. �� �ܿ� �ٶ��� �д�.","SBS","�����", "���μ�", "������");
//	Drama d2 = new Drama("2. ����� ���� ", "MBC", "�ּ���");
//	Drama d3 = new Drama("3. ���̸��� 2 ", "KBS", "ǥ�μ�", "����", "�̴���");
//	Drama d4 = new Drama("4. �ְ�� �̼��� ", "KBS", "������"," ", "������");
//	System.out.println(d4);
//  System.out.println(d1);

		Drama dra[] = new Drama[4];
		dra[0] = new Drama("1. �� �ܿ� �ٶ��� �д�.", "SBS", "�����", "���μ�", "������");
		dra[1] = new Drama("2. ����� ���� ", "MBC", "�ּ���", "", "");
		dra[2] = new Drama("3. ���̸��� 2 ", "KBS", "ǥ�μ�", "����", "�̴���");
		dra[3] = new Drama("4. �ְ�� �̼��� ", "KBS", "������", "", "������");

		int len = dra.length;
		for (int i = 0; i < len; i++) {
			System.out.println(dra[i]);
		}

	}
}
