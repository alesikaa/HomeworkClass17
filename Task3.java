package HomeworkClass17;

public class Task3 {
    /*Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
     3 - from different class inside different package  and observe result.

 */
    private int num1;
    protected int num2;
    int num3;
   public int num4;

     private Task3() {
        num1 = 1;
        System.out.println("Private Constructor called");
    }

    protected Task3(int num2) {
        this.num2 = num2;
        System.out.println("Protected Constructor called");
    }

      Task3(int num3, int num4) {
        this.num3 = num3;
        this.num4 = num4;
        System.out.println("Default Constructor called");
    }

    public Task3(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        System.out.println("Public Constructor called");
    }

    public static void main(String[] args) {
        // 1. Inside the same class
    Task3 obj1 = new Task3(1, 2, 3, 4);

        // 2. From outside the class
      Task3 obj2 = new Task3(5, 6, 7, 8);

        // 3. From a different class inside a different package
        // Not possible as the protected and default constructors can't be accessed from a different class or package
    }
}
