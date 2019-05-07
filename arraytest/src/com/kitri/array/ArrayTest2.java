package com.kitri.array;

public class ArrayTest2 {
	public static void main(String[] args) {

		Car car[] = new Car[6];
		car[0] = new Car("쏘나타", "현대", "검정색");
		car[1] = new Car("K5", "기아", "흰색");
		car[2] = new Car("SM5", "삼성", "은색");
		car[3] = new Car("아반떼 ", "현대", "흰색");
		car[4] = new Car("니어로", "기아", "비둘기색");
		car[5] = new Car("싼타페", "검정색", "현대");

		System.out.println(car[0].getCarName());

		int len = car.length;
		for (int i = 0; i < len; i++) {
			System.out.println(i + "번째 구역 : " + car[i]);
		}

//	비둘기색 니어로(기아)는 5번째에 있습니다.
//		String name = "니어로";
		/*
		 * if(name.equlas(car[i].gerCarName())) { System.out.println(car[i].getColor() +
		 * " " + car[i].getCarName() + "(" + car[i].getMaker() + ")" + "은 " + (i + 1) +
		 * "번째에 있습니다."); } }
		 */

//		QM5는 없습니다.
		String name = "QM5";
		Car findCar = null;
		int count = 0;

		for (int i = 0; i < len; i++) {
			if (name.equals(car[i].getCarName())) {
				findCar = car[i];
				count = i + 1;
				break; // 결과를 찾았을 경우 중지한다.
			}
		}
		if (findCar != null) {
			System.out.println(findCar.getColor() + " " + findCar.getCarName() + "(" + findCar.getMaker() + ")" + "은 "
					+ count + "번째에 있습니다.");
		} else {
			System.out.println(name + "은 없습니다.");
		}

	}
}