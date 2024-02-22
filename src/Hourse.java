public class Hourse extends Farm {
    private String weight;
    private int age;
    private String color;
    private String gender;
    private String nicName;

    public Hourse() {
    }

    public Hourse(String weight, int age, String color, String gender, String nicName) {
        this.weight = weight;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return "Hourse{" +
                "weight='" + weight + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", nicName='" + nicName + '\'' +
                '}';
    }
}
