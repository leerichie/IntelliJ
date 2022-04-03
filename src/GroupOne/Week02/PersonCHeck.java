package GroupOne.Week02;

import java.util.Scanner;

public class PersonCHeck {
    public static void main(String[] args) {

        //class-Person, object-person1

        Person person1 = new Person();
        person1.name = "Lee";
        person1.surname = "Richie";
        person1.age = 33;
        person1.pesel = "82041528376";

        Person person2 = new Person();
        person2.name = "Ania";
        person2.surname = "Richie";
        person2.age = 33;
        person2.pesel = "82042203048";
// 2. who is older
        if (person1.age > person2.age) {
            System.out.println(person1.name + " is older.");
        }
        if (person1.age < person2.age) {
            System.out.println(person1.name + " is younger.");
        }
        if (person1.age == person2.age) {
            System.out.println(person1.name + " and " + person2.name + " are the same age.");
        }
// 3. objects to array tablica

        Person[] arrayOfPersons = new Person[2];
        arrayOfPersons[0] = person1;
        arrayOfPersons[1] = person2;

//print details of arrays together
        for(int i=0; i<arrayOfPersons.length; i++){
            System.out.println(arrayOfPersons[i].name + " " + arrayOfPersons[i].surname);
            System.out.println(arrayOfPersons[i].surname);
            System.out.println(arrayOfPersons[i].age);
            System.out.println(arrayOfPersons[i].pesel);
        }
// 4. another 2 arrays
        Scanner personAdd = new Scanner(System.in);

        Person person3 = new Person();
        Person person4 = new Person();


        System.out.println("Enter name: ");
        person3.name = personAdd.nextLine();
        System.out.println("Enter surname: ");
        person3.surname = personAdd.nextLine();
        System.out.println("Enter age: ");
        person3.age = personAdd.nextInt();
        personAdd.nextLine();
        System.out.println("Enter pesel: ");
        person3.pesel = personAdd.nextLine();

        System.out.println("Enter name: ");
        person4.name = personAdd.nextLine();
        System.out.println("Enter surname: ");
        person4.surname = personAdd.nextLine();
        System.out.println("Enter age: ");
        person4.age = personAdd.nextInt();
        personAdd.nextLine();
        System.out.println("Enter pesel: ");
        person4.pesel = personAdd.nextLine();

        Person[] arrayOfNewPersons = new Person[2];
        arrayOfNewPersons[0] = person3;
        arrayOfNewPersons[1] = person4;

        for(int i=0; i< arrayOfNewPersons.length; i++){
            System.out.println(arrayOfNewPersons[i].name);
            System.out.println(arrayOfNewPersons[i].surname);
            System.out.println(arrayOfNewPersons[i].age);
            System.out.println(arrayOfNewPersons[i].pesel);

        }
        boolean result = person1 instanceof Person;
        if(result) {
            System.out.println("Is a person: " + result);
        }



    }
}
