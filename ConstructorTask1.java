package HomeworkClass17;

import java.time.Year;

public class ConstructorTask1 {
    /*
    Write a java class that will have a constructor: one with parameters and second without any parameters.
     Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
   String name;
    int year;
    double money;

   ;

    // Constructor with parameters
    public ConstructorTask1(String sName, int sYear, double sMoney) {
        name=sName;
        year=sYear;
        money=sMoney;

    }

    // Constructor without parameters
    private  ConstructorTask1() {
        name="Olesea";
        year= 1993;
        money =85000;
    }
    void printInfo (){
        System.out.println( "Name : "+ name+" Year: "+year+" money: "+money);
    }

    public static void main(String[] args) {
        ConstructorTask1 st=new ConstructorTask1("Olesea", 1993, 85000);
        st.printInfo();
    }
}

