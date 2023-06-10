package lab7;

import java.io.*;
import java.util.ArrayList;

public class task8 {
    public static void main(String[] args) {

        File file = new File("C:\\example_folder/people.json");

        String filename = "C:\\example_folder/people.json";

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Persona Odin", 30));
        people.add(new Person("Persona Dva", 35));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            oos.writeObject(people);
            System.out.println("Файл сохранен");
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        ArrayList<Person> newPeople= new ArrayList<Person>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {
            newPeople=((ArrayList<Person>)ois.readObject());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        for(Person p : newPeople)
            System.out.printf("Имя: %s \t Возраст: %d \n", p.getName(), p.getAge());
    }
}
