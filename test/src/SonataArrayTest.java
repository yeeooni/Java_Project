
public class SonataArrayTest {
	public static void main(String[] args) {

		System.out.println("=============== Sonata ������� =================");
//		Sonata so1 = new Sonata("���", 5000, "�¿�", "NF");
//		System.out.println(so1);
//		Sonata so2 = new Sonata("����", 7000, "����", "Brilliant");
//		System.out.println(so2);
//		Sonata so3 = new Sonata("��ȫ��", 4000, "�ý�", "EF");
//		System.out.println(so3);
//		Sonata so4 = new Sonata("��ȫ��", 6000, "�¿�", "Hybrid");
//		System.out.println(so4);

		Sonata sonata[] = new Sonata[4];

		sonata[0] = new Sonata("���", 5000, "�¿�", "NF");
		sonata[1] = new Sonata("����", 7000, "����", "Brilliant");
		sonata[2] = new Sonata("��ȫ��", 4000, "�ý�", "EF");
		sonata[3] = new Sonata("��ȫ��", 6000, "�¿�", "Hybrid");
			
		int len = sonata.length;
		for (int j = 0; j < len; j++) {
		System.out.println(sonata[j]);
		}

	}
}
