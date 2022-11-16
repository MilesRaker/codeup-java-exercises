import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] arr, Person newPerson){
        Person[] people = new Person[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            people[i] = arr[i];
        }
        people[people.length -1] = newPerson;
        return people;
    }
    public static void main(String[] args) {
        // Ex 1
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // displays reference to array's memory location
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[]{new Person("Miles"), new Person("Joy"), new Person("Love")};
        Person[] newPeople = addPerson(people, new Person("Future Wife"));
        for (Person person : newPeople) {
            System.out.println(person.getName());
        }
    }
}
