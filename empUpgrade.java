import java.util.ArrayList;
import java.util.function.Predicate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Employee{
    private String name;
    private double baseSalary;
    private double[] allowance = new double[2];
    private double bonus;
    private double totalSalary;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        this.allowance[0] = 150; //health allowance
        this.allowance[1] = 300; //transport allowance
    }

    public String getName(){
        return name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public double assignBonus(){

        if(baseSalary > 50000){
            bonus = 0.10*baseSalary;
        }
        
        if(baseSalary >=30000 && baseSalary <= 50000){
            bonus = 0.05*baseSalary;
        }
        if(baseSalary <30000){
            bonus = 0.00*baseSalary;
        }
        return bonus;

    }

    public double calculateTotalSalary(){

       totalSalary= baseSalary + this.allowance[0] + this.allowance[1] + assignBonus();
       return totalSalary;
    }

    public void displayEmployeeDetails(){

        LocalDateTime nowDT = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Employee Name:" + " " + getName());
        System.out.println("Base Salary:" + " " + "RM" + " " + baseSalary);
        System.out.println("Health Allowance:" + " " + "RM" + " " + this.allowance[0]);
        System.out.println("Transport Allowance:" + " " + "RM" + " " + this.allowance[1]);
        System.out.println("Bonus:" + assignBonus());

        Predicate<Double> isGreaterThanThousand= (number) -> number > 1000;
        if(isGreaterThanThousand.test(bonus)){
            System.out.println("Congrats! your bonus is above 1000");
        }

        System.out.println("Total Salary:" + " " + "RM" + " " + calculateTotalSalary());
        System.out.println("Date of Payslip:" + formatter.format(nowDT));

    }
}

public class empUpgrade{
    public static void main(String[] args){

        ArrayList<Employee> emp = new ArrayList<>();

        emp.add(new Employee("Syida" , 51000));
        emp.add(new Employee("Azleen" , 35000));
        emp.add(new Employee("Beymat" , 25000));
        

        for(Employee employee:emp){
            employee.displayEmployeeDetails();
            System.out.println();
        } 

    }

}