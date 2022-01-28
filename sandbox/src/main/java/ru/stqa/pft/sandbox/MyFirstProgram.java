package ru.stqa.pft.sandbox;

public class MyFirstProgram
{
	public static void main(String[] args) {
		System.out.println("Hello, world!");
        double a=4;
        System.out.println("Площадь квадрата со стороной "+a+" = "+area(a));
	}
    public static double area(double a){
        return a*a;
    }
}