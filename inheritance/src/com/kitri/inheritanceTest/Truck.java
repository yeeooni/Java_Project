package com.kitri.inheritanceTest;
public class Truck extends Car{


//field

int weight;
int maxWeight;




// 기본 생성자
public Truck(){

}

// 상위클래스 참조 생성자
public Truck(String carName, String color, String maker){
		super(carName, color, maker);
}


int loadUp(int weight){
		
		maxWeight += weight;
			return maxWeight;
		
}


int loadDown(int weight){

	maxWeight -= weight;
		return maxWeight;

}













}














