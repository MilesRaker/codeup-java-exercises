public class Person {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.printf("Hello, %s", this.name);
        System.out.println();
    }

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {

      /*  Testing Person class
        Person Miles = new Person("Miles");
        Miles.sayHello();
        System.out.println("Miles.getName() = " + Miles.getName());
        Miles.setName("Miles Raker");
        Miles.sayHello();*/

        /*    Understanding References test 1:
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);*/

        /* Simple reference value here:
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);*/

        /* tricky reference value here:
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());*/
    }
}
