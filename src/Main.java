public class Main {
    public static void main(String[] args) {
      Mother mother = new Mother(170,40,"Brown",EyesColor.BLUE,"doctor");
      Daughter daughter = new Daughter(160,16,"Black",EyesColor.BLUE);
      Daughter daughter1 = new Daughter(165,17,"White",EyesColor.BLUE);
        System.out.println(mother.getInfo());
        System.out.println(daughter.getInfo());
        System.out.println(daughter1.getInfo());
        mother.talk();
        mother.talk("Привет");
        daughter1.talk("Привет");
    }
}