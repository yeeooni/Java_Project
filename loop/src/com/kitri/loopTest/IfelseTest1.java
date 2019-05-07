package com.kitri.loopTest;
public class IfelseTest1 {
	public static void main(String[] args) {


			int year = 3;
			String yearPrint;
			if (year == 1 || year == 2){
					yearPrint = "1900년대";
			} else if (year == 3 || year == 4){
					yearPrint = "2000년대";
			}
				else{
					yearPrint = "없음";		
				}
				System.out.println(yearPrint);
						
	}
}