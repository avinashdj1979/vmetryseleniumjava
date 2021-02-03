package edu.vmetry.javasel.methods;

public class MethodsChallenge {
	
	public static void main(String[] args) {
		System.out.println(convertFeetAndInchesToCentimeters(5,10));
		System.out.println(convertFeetAndInchesToCentimeters(63));
		System.out.println(convertFeetAndInchesToCentimeters(0,10));
		System.out.println(convertFeetAndInchesToCentimeters(-1,10));
		System.out.println(convertFeetAndInchesToCentimeters(1,13));
		System.out.println(convertFeetAndInchesToCentimeters(10));
	}
	
	public static double convertFeetAndInchesToCentimeters(int feet, int inches) {
		double centimeter = -1d;
		
		if((feet >= 0) && ((inches >=0) && (inches <= 12))) {
			double finalInches = (feet * 12) + inches;
			return finalInches * 2.54d;
		}
		return centimeter;
	}
	
	public static double convertFeetAndInchesToCentimeters(int inches) {
		double centimeter = -1d;
		
		if(inches >= 0) {
			int feet = 0;
			if(inches >= 12) {
				feet = inches / 12;
				inches = inches % 12;
			}

			centimeter = convertFeetAndInchesToCentimeters(feet, inches);
		}
		return centimeter;
	}

}
