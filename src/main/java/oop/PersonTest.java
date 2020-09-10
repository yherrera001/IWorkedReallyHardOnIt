package oop;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person(2,"Corey");
        //Person is the datatype. person1 is the object.
        //when I use *new I am referring to the constructor in other tab

        person1.name = "Peter";
        System.out.println(person1.name);
        //person1.walk(person1.walk());

        /* An id = address in memory
        a state = instance variable (properties)
        behavior = methods (walk)
         */
    }
}
