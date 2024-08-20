package lms_task2;

public class Cow extends Animal{
    public Cow(double weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);

    }

    @Override
    public String toString() {
        return "Cow: " +
                "weight=" + weight +
                " age=" + age +
                " gender='" + gender +
                " nickName='" + nickName + "\n"
                ;
    }
}
