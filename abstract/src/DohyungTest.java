public class DohyungTest{
	public static void main(String [] args){
			
			Rect r1 = new Rect(4, 5); 
			System.out.println("가로가 " + r1.width + "이고" + " 세로가 " + r1.height + "인 사각형의 넓이는 " + r1.getArea() + "이고 둘레는 " + r1.getRound() + "입니다.");

			Circle c1 = new Circle(4);
			System.out.println("반지름이 " + c1.radius + "인 원의 넓이는 " + c1.getArea() + "이고 둘레는 " + c1.getRound() + "입니다.");

			
			
			
			System.out.println("----------------------------------------------------------");
			
			//추상 클래스 d1 = Rect (하위클래스) 
			//Dohyung d2 = new Circle(4);
			//추상 클래스 Dohyung 에는 하위 클래스의 width, height 가 존재하지 않으므로 알 수 없다.
			
		//	Dohyung d1 = new Rect(4, 5);
		//	System.out.println("도형의 넓이는 " + d1.getArea() + "이고 둘레는 " + d1.getRound() + "입니다.");

			//Rect(하위클래스) = 강제 형변환(Rect) d1(상위클래스)
			//강제 형변환으로 인해 하위 클래스의 width, hegiht를 알 수 있다.
		//	Rect r2 = (Rect) d1; 
		//	System.out.println("가로가 " + r2.width + "이고" + " 세로가 " + r2.height + "인 사각형의 넓이는 " + r2.getArea() + "이고 둘레는 " + r2.getRound() + "입니다.");

			//Class Exception = 형변환을 하지 못할 때 나오는 오류
		
	}
}