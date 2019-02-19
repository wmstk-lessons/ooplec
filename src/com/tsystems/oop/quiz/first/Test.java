package com.tsystems.oop.quiz.first;

public class Test
{
  public static void main(String[] args){
    Car c = new SportsCar();
    System.out.println( c.gearRatio+"  "+c.accelerate() );
  }
}

class Car{
  public int gearRatio = 7;
  public String accelerate() {  return "Accelerate : Car";  }
}
class SportsCar extends Car{
  public int gearRatio = 9;
  public String accelerate() {  return  "Accelerate : SportsCar";  }

}
