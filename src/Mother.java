public class Mother extends Grandma{
public void talk() {
    System.out.println("Мама разговаривает");
}
    public void talk(String voice) {
        System.out.println(voice);}



 final    public String getInfo() {
        return getInfo() +
                "\nage: " + getAge() +
                "\nhailColor: " + getHairColor() +
                "\neyesColor: " + getEyesColor() +
                "\nwork: " + getWork() +
                "\nheight: " + getHeight();}

    public Mother(int height, int age, String hairColor, EyesColor eyesColor) {
        super(height, age, hairColor, eyesColor);
    }

    public Mother(int height, int age, String hairColor, EyesColor eyesColor, String work) {
        super(height, age, hairColor, eyesColor, work);
    }
}