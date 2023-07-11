package collections.arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FindElement {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ibrahima"),
                new Person("Aliou"),
                new Person("Diogo")
        );
        Person person = new Person("Mamadou");
        System.out.println(people.contains(person));
        System.out.println(people.indexOf(person));
        System.out.println(containsObject(person, people));
    }

    static boolean containsObject(Person person, List<Person> people){
        Person foundPerson = people.stream().filter(p -> p.nom.equals(person.nom)).findAny().orElse(null);
        return foundPerson != null;
    }


    static class Person{
        String nom;
        public Person(String nom) {
            this.nom = nom;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(nom, person.nom);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nom);
        }
    }
}
