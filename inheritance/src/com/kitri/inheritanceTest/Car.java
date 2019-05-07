package com.kitri.inheritanceTest;
public class Car {
	

	// field
	String carName;
	String color;
	String maker;
	int speed;

	//기본 생성자 객체를 메모리로 올리는 작업 / 초기화 작업
	//하나라도 생성자를 만들면 기본 생성자가 사라진다.(생략이 아님.)
	// this( ); 자기가 가지고 있는 생성자를 가지고 올 때
	// this( ); 생성자의 첫번째 줄에 나와야 한다.
	public Car(){
		
			this("쏘나타", "흰색", "현대");
  } 
 
	//재귀호출로 인해 생성자 안에 this( )를 사용할 수 없다.
	public Car(String carName, String color, String maker){
			//super();
			this.carName = carName;
			this.color = color;
			this.maker = maker;
	}
	
	// 속도가 마음대로 변동되는 메소드이다.
	
	    int speedUp(int speed){
		this.speed += speed;
		return this.speed;
	}

	int speedDown(int speed){
		speed -= speed;
			if(speed < 0) 
				stop();
		return speed;
	}

	void stop(){
		speed = 0;
	}


//자동차의 정보를 info method안에 집어넣어서 중복되는 코드를 줄임.

	@Override
	public String toString(){
		return maker + "에서 만든 " + color + " " + carName;
	}
	

// 두 객체를 비교할 때는 equals를 사용한다.
	@Override
	public boolean equals(Object obj){
			
			Car car = (Car)obj;
			if(carName.equals(car.carName))
				return true;
			else 
				return false;
	
	
	
	}


}