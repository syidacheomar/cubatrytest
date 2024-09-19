public class calcCalo {
    public static void main(String[] args) {
        int[] dayOfWeek = {1,2,3,4,5,6,7};
        String dayName;
        int intake= 1200;
        int addedCalories = 100;

        for (int num:dayOfWeek){
            
            switch (num) {
                case 1:
                    dayName = "Monday " + intake;
                    break;
                case 2:
                    dayName = "Tuesday " + intake;
                    break;
                case 3:
                    dayName = "Wednesday "+ (intake = intake + addedCalories);
                    break;
                case 4:
                    dayName = "Thursday "+ (intake = intake + addedCalories);
                    break;
                case 5:
                    dayName = "Friday "+ (intake = intake + addedCalories);
                    break;
                case 6:
                    dayName = "Saturday "+ (intake = intake + addedCalories);
                    break;
                case 7:
                    dayName = "Sunday "+ (intake = intake + addedCalories);
                    break;
                default:
                    dayName = "Invalid Value";
                    break;
            }
            System.out.println(dayName);
    
        } 
        

    }
    }
