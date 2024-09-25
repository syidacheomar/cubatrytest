import java.util.function.Predicate;

public class LambdaExample {     // use this fx if we want to put limit on something 

    public static void main(String[] args) {
        Predicate<Integer> isGreaterThanTen = (num) -> num > 10;
        int number = 15;
        int newNum = 9;

        if(isGreaterThanTen.test(number)){
            System.out.println(number + " is greater than 10");
        }else{
            System.out.println(number + " is less than 10");
        }

        if(isGreaterThanTen.test(newNum)){
            System.out.println(number + " is greater than 10");
        }else{
            System.out.println(newNum + " is less than 10");
        }
    }
    
}
