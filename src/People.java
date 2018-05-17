import java.util.ArrayList;

public class People extends PeopleMain {
    public String name;
    public int age;
    public String jobTitle;

    public People(String name, int age, String job){
        setName(name);
        setAge(age);
        setJob(job);
    }

    // Setter methods
    private void setName(String name){
        this.name = name;
    }
    private void setAge(int age){
        this.age = age;
    }
    private void setJob(String jobTitle){
        this.jobTitle = jobTitle;
    }

    // Getter methods
    public String getName(People person){
        return person.name;
    }
    public int getAge(People person){
        return person.age;
    }
    public String getJob(People person){
        return person.jobTitle;
    }

    // toString method
    public String toString(String n, int a, String j) {
        return "Name: " + n + "\n" + "Age: " + a + "\n" + "Job: " + j;
    }

    // Search by persons name method
    public void searchName(String name, ArrayList<People> inputArray){
        int results = 0;

        // Checks if 'name' matches any of the names in the array
        for (int i=0; i< inputArray.size();i++) {           // Need to change this to a foreach loop?

            // If there's a match:
            if (inputArray.get(i).getName(inputArray.get(i)).equals(name)) {
                results++;
                System.out.println("Result " + results + ": ");
                System.out.println(inputArray.get(i).toString(inputArray.get(i).name, inputArray.get(i).age, inputArray.get(i).jobTitle));
            }
        }
        // if not:
        if (results==0) {
            System.out.println("No results");
        }
    }
}
