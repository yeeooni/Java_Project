package com.kitri.inheritanceTest;
/*

1. 요금
기본 요금(basiPrice) : 3800원 심야 요금 : 5000원
요금합(totalPrice) : 
요금(price) : 일반 = 100원 km당 
		심야 = 150원 km당

2. 요금 계산 (calcPrice())


3. 심야 할증 : 0시부터 ~ 06시까지
*/

import java.util.*;

// Car 클래스를 상속 받겠다.
public class Taxi extends Car {

	String info() {
		return maker + " 에서 만든 " + color + " " + carName;
	}

//field
	int basicPrice;
	int totalPrice;
	int price;
	int pricePerKm;

	/*
	 * public Car(){ super(); 상위클래스가 가지고 있는 기본 생성자 자동 호출 생성자의 첫번째 줄에서만 사용 가능
	 * basicPrice = 3800; }
	 * 
	 */

	// 생성자 1. 기본 생성자.
	public Taxi() {
		// super();
	}

	// 생성자 2. car클래스 (상위클래스) 의 생성자를 호출한다.
	public Taxi(String carName, String color, String maker) {

		super(carName, color, maker);

	}

// 택시를 탔을 때 기준 method
	void initPrice() {

		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR_OF_DAY); // 현재시간 불러오는 함수

		if (hour < 6) {
			basicPrice = 5000;
			pricePerKm = 150;
		} else {

			basicPrice = 3800;
			pricePerKm = 100;
		}

	}

// 택시를 내릴 때 기준 method
	int calcPrice(int km) {

		price = basicPrice + (km * pricePerKm);
		return price;

	}

// 영업 종료 method
	void sumPrice() {

		totalPrice += price;
		price = 0;
		basicPrice = 0;
	}

// 택시의 속도제한 method
// Java Annotation Override
// default > public, public = public 
// super. 상위클래스에있는 메소드를 호출 

	@Override
	int speedUp(int speed) {

		speed = super.speedUp(speed);
		if (speed > 150)
			this.speed = 150;
		return this.speed;

	}

	@Override
	public String toString() {
		return super.toString() + "택시";
	}

}