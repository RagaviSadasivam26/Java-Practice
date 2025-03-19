public class Encapsulation {

    public static void main(String[] args) {
        entity e=new entity(23,"ragavi", "female", 10000);

        entity e1=new entity(23,"satish", "female", 10000);

        entity []arrObj={new entity(23,"ragavi", "female", 10000),new entity(23,"satish", "female", 10000)};

        System.out.println(e.getAge());
        System.out.println(e.getGender());
        System.out.println(e.getName());
        System.out.println(e.getSalary());

        e.setAge(28);
        System.out.println(e.getAge());


    }
}

class entity{
    private String name;
    private int age;
    private String gender;
    private int salary;

    public entity(int age, String name, String gender, int salary) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}