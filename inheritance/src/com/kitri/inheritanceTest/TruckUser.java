package com.kitri.inheritanceTest;
public class TruckUser {
	public static void main(String[] args) {

			Truck truckUser1 = new Truck("옵티머스프라임", "검정색", "볼보");
			System.out.println(truckUser1.toString() );
		


			System.out.println("중량을 100 추가합니다.");
			int loadUp = truckUser1.loadUp(100);
			System.out.println("옵티머스프라임의 현재 중량은 : " + loadUp + " kg ");


			System.out.println("중량을 55 감소합니다.");
			int loadDown = truckUser1.loadDown(55);
			System.out.println("옵티머스프라임의 현재 중량은 : " + loadDown + " kg ");


			System.out.println("중량을 100 kg 초과 시 적재 불가합니다.");		
			loadUp = truckUser1.loadUp(44);
			System.out.println("옵티머스프라임의 현재 중량은 : " + loadUp + " kg ");
			




		System.out.println("");
	}
}