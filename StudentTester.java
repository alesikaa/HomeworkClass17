package HomeworkClass17;

public class StudentTester {
    public static void main(String[] args) {

            Students student1 = new Students("John", 80, 70, 90);
            Students student2 = new Students("Jane", 90, 80, 70);
            Students student3 = new Students("Jim", 70, 90, 80);
            Students student4 = new Students("Joan", 60, 60, 60);
            Students student5 = new Students("Jake", 100, 100, 100);

            System.out.println("Average grade of " + student1.name + ": " + student1.calculateAverage());
            System.out.println("Average grade of " + student2.name + ": " + student2.calculateAverage());
            System.out.println("Average grade of " + student3.name + ": " + student3.calculateAverage());
            System.out.println("Average grade of " + student4.name + ": " + student4.calculateAverage());
            System.out.println("Average grade of " + student5.name + ": " + student5.calculateAverage());
        }
    }








