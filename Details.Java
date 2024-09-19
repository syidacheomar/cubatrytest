public class Details {
    
    private String text;
    private double GPA;
    private int year;

    public Details(String text, double GPA, int year) {
        this.text = text;
        this.GPA = GPA;
        this.year = year;
    }

    public void displayDet(){
        System.out.println(text + " " + GPA + " " + year);
        

    public static void main(String[] args){
        Details details = new Details (3.5,3);
        details.displayDet();
    }
}
