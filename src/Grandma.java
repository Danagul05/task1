public class Grandma {
    private int age;
    private String hairColor;
    private int height;
    private String work;
    private EyesColor eyesColor;

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getHeight() {
        return height;
    }

    public String getWork() {
        return work;
    }

    public EyesColor getEyesColor() {
        return eyesColor;
    }

    public Grandma(int height,int age, String hairColor,EyesColor eyesColor) {
        this.height = height;
        this.age= age;
        this.eyesColor= eyesColor;
        this.hairColor= hairColor;


    }
    public Grandma(int height,int age, String hairColor,EyesColor eyesColor,String work) {
        this.height = height;
        this.age= age;
        this.eyesColor= eyesColor;
        this.hairColor= hairColor;
        this.work=work;



    }

}

