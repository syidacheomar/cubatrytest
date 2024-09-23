public class Exercise2 { 
  private String carNames;
  private int petrolUsages;

  public Exercise2(String carNames, int petrolUsages) {
      this.carNames = carNames;
      this.petrolUsages = petrolUsages;
  }

  public String getCarNames() {
    return carNames;
}

  public int getPetrolUsages() {
      return petrolUsages;
  }

  public static void main(String[] args) {
      // Combined car names and petrol usages into a single array
      String[][] carNames = {
      {"Myvi", "Bezza"},
      {"Yaris", "HondaCity"}
      };
      int[][] petrolUsages = {
        {57, 25},
        {40, 15}
    };

      // Create and print car information
      for (int i = 0; i < carNames.length; i++) {
        for (int j = 0; j < carNames[i].length; j++) {
            Exercise2 car = new Exercise2(carNames[i][j], petrolUsages[i][j]); // Create a new car object

            // Print car information
            System.out.println(car.getCarNames() + " was used " + car.getPetrolUsages() + " liters of fuel per 100km");
        }
    }
  }
}
