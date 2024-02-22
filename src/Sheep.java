public class Sheep extends Farm {
    private String weight;
    private int age;
    private String gender;
    private String nicName;

    public Sheep() {
    }

    public Sheep(String weight, int age, String gender, String nicName) {
        super();
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nicName = nicName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNicName() {
        return nicName;
    }

    public void setNicName(String nicName) {
        this.nicName = nicName;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "weight='" + weight + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nicName='" + nicName + '\'' +
                '}';
    }
}

