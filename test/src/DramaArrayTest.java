
public class DramaArrayTest {
	public static void main(String[] args) {

		System.out.println("<< 배열을 이용한 드라마 정보 >>");
//	
//	Drama d1 = new Drama("1. 그 겨울 바람이 분다.","SBS","김규태", "조인성", "송혜교");
//	Drama d2 = new Drama("2. 백년의 유산 ", "MBC", "주성우");
//	Drama d3 = new Drama("3. 아이리스 2 ", "KBS", "표민수", "장혁", "이다해");
//	Drama d4 = new Drama("4. 최고다 이순신 ", "KBS", "윤성식"," ", "아이유");
//	System.out.println(d4);
//  System.out.println(d1);

		Drama dra[] = new Drama[4];
		dra[0] = new Drama("1. 그 겨울 바람이 분다.", "SBS", "김규태", "조인성", "송혜교");
		dra[1] = new Drama("2. 백년의 유산 ", "MBC", "주성우", "", "");
		dra[2] = new Drama("3. 아이리스 2 ", "KBS", "표민수", "장혁", "이다해");
		dra[3] = new Drama("4. 최고다 이순신 ", "KBS", "윤성식", "", "아이유");

		int len = dra.length;
		for (int i = 0; i < len; i++) {
			System.out.println(dra[i]);
		}

	}
}
