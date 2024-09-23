public class exercise2New {

    private String name ;
    private double petrol;

   // Getter for name
   public String getName(){

    return name;
}
// Setter for name
    public void setName (String name){
    this.name = name;
}

// Getter for petrol
   public double getPetrol(){
   return petrol;
}

// Setter for petrol
    public void setPetrol (double petrol){
    this.petrol =petrol;
    }


//this is main part so need include static

    public static void main(String[]args){
      exercise2New car= new exercise2New();
    

       String[][] name= new String [2][2];   // variable
       double[][] petrol = new double [2][2]; //variable
   
      
      name [0][0] = "Honda"; name [0][1] = "Viva";
      name [1][0] = "Toyota"; name [1][1] = "Axia";

      petrol [0][0] = 67.8; petrol [0][1] = 83.9;
      petrol [1][0] = 90.8; petrol [1][1] = 34.9;

      for (int row = 0; row <name.length; row++){
         for(int col=0; col <name[row].length; col++){
          car.setName(name[row][col]);
          car.setPetrol(petrol[row][col]);

            System.out.println("Car Model is : " + car.getName() + ", Petrol for this car is: " + car.getPetrol());
         }
        }

        
  }
}