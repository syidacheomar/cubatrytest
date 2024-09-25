public class StringBuilderOne {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        sb.insert(5, ","); // put "," in the 5th place
        sb.delete(5,6); // delete between 5th and 6th place (its mean the comma)
        sb.reverse();

        System.out.println(sb.toString());
    }
    
}
