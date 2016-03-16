package ru.stqa.pft.sandbox;

/**
 * Created by gavanesov on 14.03.2016.
 */
public class Rectangle {

  public double a;
  public double b;

  public Rectangle(double a, double b) {
    this.a= a;
    this.b= b;

  }

  public  double area() {    // метод
    return this.a * this.b;
  }
}
