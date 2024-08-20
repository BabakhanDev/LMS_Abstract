package lms_task2;

public class Sheep extends Animal{
    public Sheep(double weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Sheep: " +
                " weight=" + weight +
                " age=" + age +
                " gender='" + gender + ',' +
                " nickName='" + nickName + "\n";
    }
}
