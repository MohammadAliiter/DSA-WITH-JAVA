public class Constructor {
    public static class Main {
        int modelYear;
        String modelName;
      
        public Main(int year, String name) {
          modelYear = year;
          modelName = name;
        }
    }
        public static void main(String[] args) {
          Main myCar = new Main(1969, "nano");
          System.out.println(myCar.modelYear + " " + myCar.modelName);
        }
      
      
}

