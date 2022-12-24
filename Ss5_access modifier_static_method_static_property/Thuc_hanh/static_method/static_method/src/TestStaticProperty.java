public class TestStaticProperty {
    public static void main(String args[]) {
        Car mazda = new Car("Mazda", "ChinhLe");
        Car toyota = new Car("Toyota", "LeChinh");
        Car mercesdes = new Car("Merc", "ChinhLeVan");
        Car ferrari = new Car("ferrari", "LeVanChinh");
        System.out.println("Amount number of car is: " + Car.numberOfCar);
    }
}
