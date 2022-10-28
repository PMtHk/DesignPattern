public class VehicleFactory {

    // TODO
    public enum VehicleType {
        Bike, Car, Truck
    }

    public static Vehicle create(VehicleType type) {
        if (type.equals(VehicleType.Bike))
            return new Bike();
        else if (type.equals(VehicleType.Car)) 
            return new Car();
        else if (type.equals(VehicleType.Truck))
            return new Truck();
        else 
            return null;
    }

}
public class Client {

    public static void main(String[] args) {

        // TODO
        Vehicle bike = VehicleFactory.create(VehicleType.Bike);
        bike.doSomething();

        Vehicle car = VehicleFactory.create(VehicleType.Car);
        car.doSomething();
    }

}