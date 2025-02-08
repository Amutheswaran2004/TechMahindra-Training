public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        ElectricCar electricCar1 = new ElectricCar("Tesla", "Model S", 2022, 350);

        Car[] cars = { car1, electricCar1 };

        for (Car car : cars) {
            car.startEngine();
        }
    }
}
