package com.tsystems.oop.task.second;

import java.util.ArrayList;
import java.util.List;

//I suppose that developer of this code make some mistakes with inheritance of interfaces
// make any changes you want to fix bug
public class Test
{
  public static void main(String[] args)
  {
    //We create a list of animals and fill it with different kind of creatures (Birds in our case)
    List<Animal> zoo = new ArrayList<>();
    zoo.add(new Duck());
    zoo.add(new Parrot());
    zoo.add(new Penguin());

    //
    zoo.forEach(animal -> migration(animal));
  }

  /**
   * All animals wants to migrate to warm lands, but each type of them use their own abilities to do this
   * if they can fly - they fly away, if they can swim - they swim away
   * @param animal
   */
  public static void migration(Animal animal){
    System.out.println("The Winter is coming and animals start their annual migration to the warmer lands");
    if (animal instanceof Runnable){
      System.out.println("Gracefully running, " + animal.getName()+"s starts their journey and go to the south");
    }
    if (animal instanceof Flyeing){
      System.out.println("With coming coldness, " + animal.getName()+"s start to fly away to southern lands");
    }
    if (animal instanceof Swimmable){
      System.out.println("The water surface is going covering by ice, and " + animal.getName()+"s away to warmer water");
    }
    System.out.println("=======================================================================");
  }
}

interface Animal
{
  String getName();
}

interface  Flyeing extends Animal
{
}

interface Runnable extends Animal
{
}

interface Bird extends Flyeing, Runnable
{
}

interface Singable extends Bird{
}

interface Swimmable extends Bird{
}

class Parrot implements Singable
{
  String name = "Parrot";

  @Override public String getName()
  {
    return name;
  }
}
class Duck implements Swimmable, Singable
{
  String name = "Duck";

  @Override public String getName()
  {
    return name;
  }
}
class Penguin implements Swimmable
{
  String name = "Penguin";

  @Override public String getName()
  {
    return name;
  }
}
