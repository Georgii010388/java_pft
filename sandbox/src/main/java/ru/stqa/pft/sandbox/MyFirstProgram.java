package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	
   public static void main(String[] args) {
	   hello("George");
     hello("Николай");
     hello("Генрих");

     double l=5;
     System.out.println("Площадь квадрата, со стороной " + l + "=" + area(l));

     double c=5;
     double d=5;
     System.out.println("Площадь прямоугольника, со стороной " + c +  "и" + d + "=" + area(c , d));

   }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }
	
}