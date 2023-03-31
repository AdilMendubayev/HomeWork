public class TaskFive {
    public static void main(String[] args) {
        Person personOne = new Person("Roma", 23);
        Person personTwo = new Person("Bob", 34);
        Person personThree = new Person("Dan", 13);
        personOne.getInfo();
        personTwo.getInfo();
        personThree.getInfo();

    }
}
class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void getInfo() {
        System.out.println("This is " + name + ", He is " + age + " years old");
    }
}
