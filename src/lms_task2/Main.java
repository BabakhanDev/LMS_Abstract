package lms_task2;

public class Main {
    public static void main(String[] args) {

        Animal[] farm1Cows = {
                new Cow(450,5,"Female","Cow1"),
        new Cow(500,4,"Male","Cow2"),
        new Cow(480,6,"Female","Cow3"),
        new Cow(470,3,"Male","Cow4"),
        new Cow(460,2,"Female","Cow5")};

        Animal[] farm1Sheep = {
                new Sheep(70,3,"Female","Sheep1"),
                new Sheep(80,2,"Male","Sheep2"),
                new Sheep(75,4 ,"Female","Sheep3")
        };

        Animal[] farm1Horse = {
                new Horse(600, 5, "Male", "KaraJorgo"),
                new Horse(650, 6, "Female", "Akkula")
        };
        Farm farm1 = new Farm("Chuy",farm1Cows,farm1Sheep,farm1Horse,"Bakai");
        System.out.println("farm1: "+farm1);

        Animal[] farm2Cows = {
                new Cow(490,3,"Female","Cow1")};
        Animal[] farm2Sheep = {new Sheep(78,4,"Male","baran")};
        Animal[] farm2Horses = {
                new Horse(620,5,"Female","Spirit")};
        Farm farm2 = new Farm("Naryn",farm2Cows,farm2Sheep,farm2Horses,"Asan");
        System.out.println(" ");
        System.out.println("farm2: "+farm2);

    }
    }

