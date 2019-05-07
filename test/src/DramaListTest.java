import java.util.ArrayList;
import java.util.List;

public class DramaListTest {
	public static void main(String[] args) {

		List<Drama> list = new ArrayList<Drama>();
		System.out.println("리스트의 크기는 : " + list.size());

//		String str[] = new String[4];

		Drama dra = new Drama("1. 그 겨울 바람이 분다.", "SBS", "김규태", "조인성", "송혜교");
		Drama dra1 = new Drama("2. 백년의 유산 ", "MBC", "주성우", "", "");
		Drama dra2 = new Drama("3. 아이리스 2 ", "KBS", "표민수", "장혁", "이다해");
		Drama dra3 = new Drama("4. 최고다 이순신 ", "KBS", "윤성식", "", "아이유");

		list.add(dra);
		list.add(dra1);
		list.add(dra2);
		list.add(dra3);

		System.out.println("리스트의 크기는 : " + list.size());

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
