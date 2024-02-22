import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cow cow1 = new Cow();
        cow1.setNicName("test");
        cow1.setAge(23);
        cow1.setGender("F");
        cow1.setWeight("34");

        Cow cow2 = new Cow();
        cow2.setNicName("test");
        cow2.setAge(23);
        cow2.setGender("F");
        cow2.setWeight("34");

        Cow cow3 = new Cow();
        cow3.setNicName("test");
        cow3.setAge(23);
        cow3.setGender("F");
        cow3.setWeight("34");

        Cow cow4 = new Cow();
        cow4.setNicName("test");
        cow4.setAge(23);
        cow4.setGender("F");
        cow4.setWeight("34");

        Cow cow5 = new Cow();
        cow5.setNicName("test");
        cow5.setAge(23);
        cow5.setGender("F");
        cow5.setWeight("34");
        Cow[] cows = {cow1, cow2, cow3, cow4, cow5};

        Hourse hourse1 = new Hourse();
        hourse1.setNicName("Байтур");
        hourse1.setAge(18);
        hourse1.setGender("M");
        hourse1.setWeight("123m");
        hourse1.setColor("black");

        Hourse hourse2 = new Hourse();
        hourse2.setNicName("Байтур");
        hourse2.setAge(18);
        hourse2.setGender("M");
        hourse2.setWeight("123m");
        hourse2.setColor("black");

        Hourse hourse3 = new Hourse();
        hourse3.setNicName("Байтур");
        hourse3.setAge(18);
        hourse3.setGender("M");
        hourse3.setWeight("123m");
        hourse3.setColor("black");

        Hourse hourse4 = new Hourse();
        hourse4.setNicName("Байтур");
        hourse4.setAge(18);
        hourse4.setGender("M");
        hourse4.setWeight("123m");
        hourse4.setColor("black");

        Hourse hourse5 = new Hourse();
        hourse5.setNicName("Байтур");
        hourse5.setAge(18);
        hourse5.setGender("M");
        hourse5.setWeight("123m");
        hourse5.setColor("black");
        Hourse[] hourses = {hourse1, hourse2, hourse3, hourse4, hourse5};

        Sheep sheep = new Sheep();
        sheep.setNicName("suui");
        sheep.setAge(1);
        sheep.setGender("f");
        sheep.setWeight("100g");
        Sheep sheep2 = new Sheep();

        sheep2.setNicName("suui");
        sheep2.setAge(1);
        sheep2.setGender("f");
        sheep2.setWeight("100g");

        Sheep[] sheep1 = {sheep, sheep2};


        Farm farm = new Farm();
        farm.setAddress("восток 5");
        farm.setOwnerName("Kuba");
        farm.setHorses(hourses);
        farm.setCows(cows);
        farm.setSheep(sheep1);
        System.out.println(farm.getOwnerName() + "\n" + farm.getAddress() + "\n" +
                Arrays.toString(farm.getCows()) + "\n" + Arrays.toString(farm.getSheep()) + "\n" + Arrays.toString(farm.getHorses()));


    }
}