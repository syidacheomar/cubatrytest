import java.util.Scanner;

public class Student {
    private String name;
    private int[] score = new int[3];
    private double averageScore;

    public Student(String name, int mathScores, int scienceScores, int englishScores){
        this.name = name;
        this.score[0] = mathScores;
        this.score[1] = scienceScores;
        this.score[2] = englishScores;
    }

    public String getName(){
        return name;
    }

    public double calculateAverage(){
        int sum = 0;

        for (int scores: score){
            sum = sum + scores;
        }
        averageScore = sum / score.length;
        return averageScore;
    }

    public String assignGrade(){
        String grade = "";

        if(averageScore >= 90){
            grade = "A";
        }
        if(averageScore >= 80 && averageScore <= 89 ){
            grade = "B";
        }
        if(averageScore >= 70 && averageScore <= 79){
            grade = "C";
        }
        if(averageScore >= 60 && averageScore <= 69){
            grade = "D";
        }
        if(averageScore <= 60){
            grade = "F";
        }

        return grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i<students.length; i++){
            System.out.println("Name:   ");
            String setName = scanner.nextLine();

            System.out.println("Math Score:   ");
            int setMathScore = scanner.nextInt();

            System.out.println("Science Score:   ");
            int setScienceScore = scanner.nextInt();

            System.out.println("English Score:   ");
            int setEnglishScore = scanner.nextInt();

            scanner.nextLine();

            students[i] = new Student(setName, setMathScore, setScienceScore, setEnglishScore);
        }

        for(Student student:students){
            System.out.println("Student name:" + " " + student.getName());
            System.out.println("Average Score:" + " " + student.calculateAverage());
            System.out.println("Grade:" + " " + student.assignGrade());
            System.out.println();

        }
       scanner.close();
   
    }
}
