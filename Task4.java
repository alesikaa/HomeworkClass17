package HomeworkClass17;

public class Task4 {
    //Write program that have static constructor and observe result.
    static int num1;
    int num2;

   static {
        num1 = 1;
        System.out.println("Static block called");
        }
         Task4(int num2) {
        this.num2 = num2;
        System.out.println("Instance Constructor called");
        }

    public static void main(String[] args) {
    Task4 obj1 = new  Task4(2);
    Task4 obj2 = new  Task4(3);
        }
        }




