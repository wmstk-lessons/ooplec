package com.tsystems.oop.task.third;

public class Test
{
}

/**
 * We create some program for controlling MoonRover
 * and suppose that users will be control Rover using interface Rover
 * check for compliance with the requirements of the OOP and change accordingly
 */
interface Rover
{
  void move(int angle, int distance);
  String getRoverStatus();
}

class RoverImpl implements Rover
{
  public double x;
  public double y;
  public double z;
  public double ort;
  public int speed;
  public System system1 = new System();
  public System system2 = new System();
  public System system3 = new System();
  public System system4 = new System();

  public void move(int angle, int distanse){
    if (checkSystems())
    {
      turnToAngle(angle);
      moveForvard();
    }
  }
  public String getRoverStatus()
  {
    return checkSystems()? "ok":"error";
  }

  public void turnToAngle(int angle)
  {
    turnWheels(getWheelsStatus(), angle);
  }

  public void moveForvard()
  {
    //super complicated method for moving
  }

  public void turnWheels(Object wheelsStatus, int angle){}

  public Object getWheelsStatus()
  {
    return new Object();
  }

  public boolean checkSystems()
  {
    return system1.getStatus() && system2.getStatus() && system3.getStatus() && system4.getStatus();
  }

  public class System
  {
    public boolean status = true;

    public boolean getStatus()
    {
      return status;
    }
  }

}
