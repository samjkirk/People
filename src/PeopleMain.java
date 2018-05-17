import java.util.ArrayList;

public class PeopleMain {
    public static void main(String[] args) {
        ArrayList<People> list = new ArrayList<>();
        list.add(new People("Sam", 21, "Trainee Consultant"));
        list.add(new People("Benny", 21, "Trainee Consultant"));
        list.add(new People("Jarad", 22, "Trainee Consultant"));

        System.out.println("All people in database:");
        for (People p : list) {
            System.out.println(p.toString(p.getName(p), p.getAge(p), p.getJob(p)));
            System.out.println();
        }

        System.out.println();
        System.out.println("Searching list for people named 'Jarad'...");
        list.get(0).searchName("Jarad", list);

        System.out.println();
        System.out.println("Searching list for people named 'Benny'...");
        list.get(0).searchName("Benny", list);

        System.out.println();
        System.out.println("Searching list for people named 'Sam'...");
        list.get(0).searchName("Sam", list);

        System.out.println();
        System.out.println("Searching list for people named 'Dave'...");
        list.get(0).searchName("Dave", list);
    }
}
