


//Part class
class Engine {
 private String model;

 public Engine(String model) {
     this.model = model;
 }

 public String getModel() {
     return model;
 }
}

//Whole class that aggregates the part
class Car {
 private String make;
 private Engine engine; // Aggregation: Car has an Engine

 public Car(String make, Engine engine) {
     this.make = make;
     this.engine = engine;
 }

 public String getMake() {
     return make;
 }

 public Engine getEngine() {
     return engine;
 }
}

public class AggregationExample27 {
 public static void main(String[] args) {
     // Create an Engine instance
     Engine carEngine = new Engine("V8");

     // Create a Car instance with the Engine as a part
     Car myCar = new Car("Toyota", carEngine);

     // Accessing properties using aggregation
     System.out.println("Car Make: " + myCar.getMake());
     System.out.println("Engine Model: " + myCar.getEngine().getModel());
 }
}
