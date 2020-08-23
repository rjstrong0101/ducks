class MiniDuckSimulator {

  public static void main(String args[]) {

    Duck rhd = new RedheadDuck();
    rhd.display();
    rhd.quack();
    rhd.swim();

    Duck md = new MallardDuck();
    md.display();
    md.quack();
    md.swim();
  }
}
