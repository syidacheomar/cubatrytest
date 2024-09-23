public class TypeCastingDemo{
    public static void main(String[] args){

        //declare and initialise variables
        int var1 = 500;
        double var2 = 4.0;
        float var3 = 45.05f;
        char var4 = 'F' ;

        //casting each of variables 
        double var1Double = var1; //casting from int to double
        int var2Integer = (int) var2; //casting from double to integer
        double var3Double = var3; //casting from float to double
        int var4Integer = var4; //casting from char to int

        //print out result of casting
        System.out.println("int to double:" + " " + var1Double);
        System.out.println("double to integer:" + " " + var2Integer);
        System.out.println("float to double:" + " " + var3Double);
        System.out.println("char to int:" + " " + var4Integer);

        //using wrapper class to convert between types
        String intToString = Integer.toString(var1); //int to String
        int stringToInt = Integer.parseInt(intToString); //String to int
        


        
        
    }
}