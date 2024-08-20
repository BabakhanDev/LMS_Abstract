package lms_task2;

public class Horse extends Animal{
    public Horse(double weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Horse: " +
                " weight=" + weight +
                " age=" + age +
                " gender='" + gender + ',' +
                " nickName='" + nickName +"\n";
    }
}
