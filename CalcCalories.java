public class CalcCalories {
        public static void main(String[] args) {
            
            int[] calories = {1700, 1250, 1500, 2000, 1500, 1250, 2350}; 
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            
            int totalCalories = 0;
        
            for (int i = 0; i < calories.length; i++) {
                System.out.println(days[i] + ": " + calories[i] + " calories");
                totalCalories += calories[i]; 
            }
            
            System.out.println("\nTotal calories intake for the week: " + totalCalories);
        }
    
}
