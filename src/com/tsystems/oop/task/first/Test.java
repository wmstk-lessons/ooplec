package com.tsystems.oop.task.first;

/**
 * A programmer was in a great hurry to go vacation and probably he did a few mistakes
 * make some changes in code so it can works properly
 */

public class Test
{
  public static void main(String[] args)
  {
    //Lets create our animals
    Felidae cat = new Cat("Tomas");
    Felidae leo = new Lion("King Leo");

    //Lets see what we have
    observe((Mamals) cat);
    observe((Mamals) leo);
  }

  public static void observe(Mamals animal){
    if (animal instanceof Cat){
      System.out.println("Oh! it's a sweet furry cat, his name is " + ((Cat) animal).name);
    }
    else if (animal instanceof Lion){
      System.out.println("Be careful, here is the great king of animals " + ((Lion) animal).name);
    }
    else {
      System.out.println("Ups, we don't know who is it");
    }
  }

}

abstract class Mamals{

  static String name;
}

interface Felidae{
  String word = "Rooar";
}
interface Felis extends Felidae{
  String word = "Miyau";
}
interface Pantera extends Felidae{
}

class Cat extends Mamals implements Felis{
  {
    System.out.println(name + " was created and says: " + word);
  }

  public Cat(String name){
    this.name=name;
  }
}
class Lion extends Mamals implements Pantera{
  {
    System.out.println(name + " was created and says: " + word);
  }
  public Lion(String name){
    this.name=name;
  }

}