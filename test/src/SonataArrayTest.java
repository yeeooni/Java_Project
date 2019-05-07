
public class SonataArrayTest {
	public static void main(String[] args) {

		System.out.println("=============== Sonata »ý»ê½ÃÀÛ =================");
//		Sonata so1 = new Sonata("Èò»ö", 5000, "½Â¿ë", "NF");
//		System.out.println(so1);
//		Sonata so2 = new Sonata("Àº»ö", 7000, "¾÷¹«", "Brilliant");
//		System.out.println(so2);
//		Sonata so3 = new Sonata("°¨È«»ö", 4000, "ÅÃ½Ã", "EF");
//		System.out.println(so3);
//		Sonata so4 = new Sonata("°¨È«»ö", 6000, "½Â¿ë", "Hybrid");
//		System.out.println(so4);

		Sonata sonata[] = new Sonata[4];

		sonata[0] = new Sonata("Èò»ö", 5000, "½Â¿ë", "NF");
		sonata[1] = new Sonata("Àº»ö", 7000, "¾÷¹«", "Brilliant");
		sonata[2] = new Sonata("°¨È«»ö", 4000, "ÅÃ½Ã", "EF");
		sonata[3] = new Sonata("°¨È«»ö", 6000, "½Â¿ë", "Hybrid");
			
		int len = sonata.length;
		for (int j = 0; j < len; j++) {
		System.out.println(sonata[j]);
		}

	}
}
