import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    private String name;
    private String email;
    private double hourRate;
    private int capacity;
    private int freeDays;

    public Employee(String name, String email, double hourRate , int capacity, int freeDays){
        this.name=name;
        this.email=email;
        this.hourRate=hourRate;
        this.capacity=capacity;
        this.freeDays=freeDays;
    }
    public double calculateDailyIncome() {

        double income = (capacity - freeDays) * hourRate;

        return income;

    }

    public double calculateMontlyIncome(){
        double income = (capacity-freeDays) * hourRate *20;
    }
/
    public static  void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Introduceti numarul de angajati: ");
        int numEmployees = scanner.nextInt();
    }
    ArrayList > Employee > employess = newA


        }
    }
}
