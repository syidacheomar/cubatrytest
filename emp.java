class Employee{
    private String name;
    private double baseSalary;
    private double[] allowance = new double[2];
    private double bonus;
    private double totalSalary;

    public Employee(String name, double baseSalary, double healthAllowance, double transportAllowance){
        this.name = name;
        this.baseSalary = baseSalary;
        this.allowance[0] = healthAllowance;
        this.allowance[1] = transportAllowance;
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
        System.out.println("Employee Name:" + " " + getName());
        System.out.println("Base Salary:" + " " + "RM" + " " + baseSalary);
        System.out.println("Health Allowance:" + " " + "RM" + " " + this.allowance[0]);
        System.out.println("Transport Allowance:" + " " + "RM" + " " + this.allowance[1]);
        System.out.println("Total Salary:" + " " + "RM" + " " + calculateTotalSalary());
        System.out.println();
    }
    

}

public class emp{
    public static void main(String[] args){
        Employee[] employees = new Employee[3];

        try{
            employees[0] = new Employee("Syida" , 51000, 150, 150);
            employees[1] = new Employee("Nadiah" , 35000, 150, 150);
            employees[2] = new Employee("Azleen" , 20000, 150, 150);

            for(Employee employee:employees){
                employee.displayEmployeeDetails();
                System.out.println("");
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught bad" + e.getMessage());
        }finally{
            System.out.println("It will executed anyway");
        }

        System.out.println("Program is continuing");
        
        }

        

}