public class Daughter extends Mother{
    public Daughter(int height, int age, String hairColor, EyesColor eyesColor) {
        super(height, age, hairColor, eyesColor);
    }

    public Daughter(int height, int age, String hairColor, EyesColor eyesColor, String work) {
        super(height, age, hairColor, eyesColor, work);
    }
    public void talk() {
        super.talk();
        System.out.println(" Дочь разговаривает");
    }


}
