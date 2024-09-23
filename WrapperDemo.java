public class WrapperDemo {
    public static void main(String[] args){
        
        //declare and initialise variable
        int var1 = 1000;
        double var2 = 105.0;
        float var3 = 50.05f;
        char var4 = 'A' ;
        boolean var5 = false;

        //create instance of each wrapper class
        Integer var1Wrapper = Integer.valueOf(var1);
        Double var2Wrapper = Double.valueOf(var2);
        Float var3Wrapper = Float.valueOf(var3);
        Character var4Wrapper = Character.valueOf(var4);
        Boolean var5Wrapper = Boolean.valueOf(var5);

        //print out primitive variables 
        System.out.println("Primitive Integer:" + " " + var1);
        System.out.println("Primitive Double:" + " " + var2);
        System.out.println("Primitive Float:" + " " + var3);
        System.out.println("Primitive Char:" + " " + var4);
        System.out.println("Primitive Boolean:" + " " + var5);

        //print out wrapper class objects
        System.out.println("Wrapper Integer:" + " " + var1Wrapper);
        System.out.println("Wrapper Double:" + " " + var2Wrapper);
        System.out.println("Wrapper Float:" + " " + var3Wrapper);
        System.out.println("Wrapper Char:" + " " + var4Wrapper);
        System.out.println("Wrapper Boolean:" + " " + var5Wrapper);

    }
    
}
