package com.tsystems.oop.quiz.third;

public class Test
{
  public static void main(String[] args) {
    Base b = new Derived();
    b.show();
    NewBase nb = new NewDerived();
    nb.show();
  }
  private void hide(){
    Base.show();
    Derived.show();
    new NewBase().show();
    new NewDerived().show();
  }
}
class Base {
  public static void show() {
    System.out.println("Base::show() called");
  }
}

class Derived extends Base {
  public static void show() {
    System.out.println("Derived::show() called");
  }
}

class NewBase {
  public void show() {
    System.out.println("NewBase::show() called");
  }
}

class NewDerived extends NewBase {
  public void show() {
    System.out.println("NewDerived::show() called");
  }
}
