public class Equals {

    public static void main(String[] args) {
        String str1 = "Hello" ;
        String str2 = "Hello" ;
        String str3 = new String("Hello"); //new object sebab tu tak sama if == to str1 or str2

        System.out.println(str1 == str2);
        System.out.println(str1 == str3); // java will check first
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3)); // we forcced java to accept the value
        
    }
    
}
