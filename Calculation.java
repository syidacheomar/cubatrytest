public class Calculation {
    
    // private double gpaSem1 = 3.5;
    // private double gpaSem2 = 4.0;
    // private double gpaSem3 = 3.8;
    // private double gpaAverage = gpaSem1 + gpaSem2 + gpaSem3;

    // public Calculation(double gpaSem1, double gpaSem2, double gpaSem3, double gpaAverage){
    //     this.gpaSem1 = gpaSem1;
    //     this.gpaSem2 = gpaSem2;
    //     this.gpaSem3 = gpaSem3;
    //     this.gpaAverage = gpaAverage; 
    // }

    // public void displayCalculation(){
    //     System.out.println("GPA Semester 1 : " + gpaSem1);
    //     System.out.println("GPA Semester 2 : " + gpaSem2);
    //     System.out.println("GPA Semester 3 : " + gpaSem3);
    //     System.out.println("The average GPA is" + gpaAverage);
    

    public static void main(String[] args) {

        double gpaSem1 = 3.5;
        double gpaSem2 = 4.0;
        double gpaSem3 = 3.8;
        double gpaAverage = (gpaSem1 + gpaSem2 + gpaSem3) / 3;
        System.out.println("The average GPA is" + gpaAverage);
    }

}
