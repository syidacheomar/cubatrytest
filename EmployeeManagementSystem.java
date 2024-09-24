import java.util.Scanner;

class Employee{
    private String name;
    private double baseSalary = 0.0;
    private double healthAllowance = 0.0;
    private double transportAllowance = 0.0;
    private double bonus = 0.0;
    private double totalSalary = 0.0;

    public Employee(String name, double baseSalary, double healthAllowance, double transportAllowance, double bonus){
        this.name = name;
        this.baseSalary = baseSalary;
        this.healthAllowance = healthAllowance;
        this.transportAllowance = transportAllowance;
        this.bonus = bonus;
    }

    public String getName(){
        return name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public double getHealthAllowance(){
        return healthAllowance;
    }

    public double getTransportAllowance(){
        return transportAllowance;
    }

    public double getBonus(){
        return bonus;
    }

    public double getTotalSalary(){
        return totalSalary;
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

       totalSalary= baseSalary + healthAllowance + transportAllowance + assignBonus();
       return totalSalary;
    }
    

}

public class EmployeeManagementSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for(int i = 0; i<employees.length; i++){
            
            System.out.println("Name:");
            String setName = scanner.nextLine();

            System.out.println("Base Salary:");
            double setBaseSalary = scanner.nextDouble();

            System.out.println("Health allowance:");
            double setHealthAllowance = scanner.nextDouble();

            System.out.println("Transport allowance:");
            double setTransportAllowance = scanner.nextDouble();

            scanner.nextLine();

            employees[i] = new Employee(setName, setBaseSalary, setHealthAllowance, setTransportAllowance, setTransportAllowance);
            
        }

        for(Employee employee:employees){
            System.out.println("Employee Name:" + " " + employee.getName());
            System.out.println("Base Salary:" + " " + "RM" + " " + employee.getBaseSalary());
            System.out.println("Health Allowance:" + " " + "RM" + " " + employee.getHealthAllowance());
            System.out.println("Transport Allowance:" + " " + "RM" + " " + employee.getTransportAllowance());
            System.out.println("Total Salary:" + " " + "RM" + " " + employee.calculateTotalSalary());
            System.out.println();
        }

        scanner.close();
    }
}
