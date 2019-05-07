package com.kitri.inheritanceTest;
public class TaxiGuest {
	public static void main(String[] args) {

		Taxi t1 = new Taxi();
		System.out.println("t1>>> " + t1.info());

		Taxi t2 = new Taxi("k5", "감홍색", "기아");
		System.out.println("t2>>> " + t2.toString());



		t2.initPrice();
		int km = 20;
		System.out.println(t2 + "를 타고 구디에서 강남까지 "+ km + "km이동!!");
		int price = t2.calcPrice(km);
		System.out.println("요금 : " + price + " 원");
		System.out.println("누적 수익 : " + t2.totalPrice + " 원");
		t2.sumPrice();
		
		t2.initPrice();
		km = 20;
		System.out.println(t2 + "를 타고 강남에서 구디까지 "+ km + "km이동!!");
		price = t2.calcPrice(km);
		System.out.println("요금 : " + price + " 원");
		System.out.println("누적 수익 : " + t2.totalPrice + " 원");
		t2.sumPrice();

		int upDown = 50;
		System.out.println("t2의 속도를 " + upDown + "만큼 가속!!!");
		int speed = t2.speedUp(upDown);
		System.out.println("t2의 속도를 " + speed + " " + t2.speed);

		upDown = 250;
		System.out.println("t2의 속도를 " + upDown + "만큼 가속!!!");
		speed = t2.speedUp(upDown);
		System.out.println("t2의 속도를 " + speed + " " + t2.speed);

				//내용이 같은 것 문자열 toString();
				Taxi t3 = new Taxi("k5", "감홍색", "기아");
				System.out.println(t2+ "  " + t3);
				

				//주소값이 다름 hashCode();
				System.out.println(t2.hashCode() + "  " + t3.hashCode());
				if(t2 == t3) // == 비교연산자는 기본데이터일 경우 값을 비교 참조형데이터일 경우 주소값을 비교 
					System.out.println("t2 와 t3는 주소값이 같은차이다.");
				else
					System.out.println("t2 와 t3는 주소값이 다른차이다.");
				
				
				if(t2.equals(t3)) 
					System.out.println("t2 와 t3는 차이름이 같은차이다.");
				else
					System.out.println("t2 와 t3는 차이름이 다른차이다.");


	}
}