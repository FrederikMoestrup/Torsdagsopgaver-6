package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();

        list1.add("Mat");
        list2.add("Mat");
        list3.add("Mat");

        list1.add("Dansk");
        list2.add("Dansk");
        list3.add("Dansk");
        list4.add("Dansk");

        list1.add("Kemi");
        list2.add("Kemi");

        list2.add("Fysik");

        list3.add("Tysk");

        list4.add("Musik");

        list2.add("Java 1.0");
        list4.add("Java 1.0");


       Student s1 = new Student("Kat",list4);
       Student s2 = new Student("Mike",list3);
       Student s3 = new Student("Sofia",list1);

       Teacher t1 = new Teacher("Tove", list3);
       Teacher t2 = new Teacher("Karsten", list2);


       ArrayList<Person> persons = new ArrayList<>();

       persons.add(s1);
       persons.add(s2);
       persons.add(s3);
       persons.add(t1);
       persons.add(t2);

        for (Person p : persons) {
            if(!p.addCourse("Java 1.0")){
                System.out.println(p.getName());
                if(p instanceof Student){
                    System.out.println("har allerede bestået dette kursus.");
                }
                else if(p instanceof Teacher){
                    System.out.println("kan ikke undervise i dette fag.");
                }
            }
        }



    }
}

