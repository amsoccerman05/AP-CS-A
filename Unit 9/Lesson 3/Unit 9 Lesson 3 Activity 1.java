// each of these are seperate classes for projectstem

public class Farm {

  private Farmer theFarmer;
  private Animal firstAnimal;
  private Animal secondAnimal;
  private Animal thirdAnimal;

  public Farm(Farmer f, Animal a1, Animal a2, Animal a3) {
    theFarmer = f;
    firstAnimal = a1;
    secondAnimal = a2;
    thirdAnimal = a3;
  }

  public String toString() {
    String s = theFarmer + " had a farm.";
    s += "\nAnd on that farm he had a " + firstAnimal;
    s += "\nAnd on that farm he had a " + secondAnimal;
    s += "\nAnd on that farm he had a " + thirdAnimal;
    return s;
  }

}

public class Animal {

  private String name;

  public Animal(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public String speak() {
    return "";
  }

  public String toString() {
    return getName() + " (" + speak() + " " + speak() + ").";
  }

}

public class Farmer {

  private String forename;
  private String surname;

  public Farmer(String f, String s) {
    forename = f;
    surname = s;
  }

  public String toString() {
    return forename + " " + surname;
  }

}

public class Cow extends Animal {

  public Cow() {
    super("cow");
  }

  public String speak() {
    return "moo";
  }

}

public class Pig extends Animal {

  public Pig() {
    super("pig");
  }

  public String speak() {
    return "oink";
  }

}

public class Sheep extends Animal {

  public Sheep() {

    super("sheep");
  }

  public String speak() {
    return "baa";
  }

}

// Passed