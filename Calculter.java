package com.firstPgm;

public class Calculter {
	
	
	public static int add(int a, int b) {
		return a+b;
	}
	public static double add(double c, double d) {
		return c-d;
	}
	public static double add(int e, double f) {
		return e*f;
	}
	public static double add(double g, int h) {
		return g/h;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculter c1=new Calculter();
		System.out.println(c1.add(5, 10));
		System.out.println(c1.add(5.32, 2.32));
		System.out.println(c1.add(51, 10.5));
		System.out.println(c1.add(5.55, 10));
		
		

	}

}
