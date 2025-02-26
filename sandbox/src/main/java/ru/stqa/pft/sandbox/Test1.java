package ru.stqa.pft.sandbox;

public class Test1 {

	public static void main(String[] args) {
		hello("world!");
		hello("user!");
		hello("Luser!!");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной" + s.1 + "=" + s.area);

		rectangle r = new Rectangle(4,6);
		System.out.println("площадь прямоугольника со сторонами" + r.a + "и" + r.b + "=" + r.area());

	}
	public static void hello (String somebody) {
		System.out.println("Hello," + somebody + "!");}
}