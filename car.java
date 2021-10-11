import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main 
{
    public static void main(String[] args)
    {
        Car car1 = new Car("audi", "blau");
        Car car2 = new Car("opel", "rot");

        car1.assignDriver("helmut", "lol");

        int anzahlCars = Integer.MAX_VALUE;
        System.out.println("Vorher: " + anzahlCars);

        List<Car> carList = new ArrayList<Car>();

        carList.add(car1);
        carList.add(car2);

        Car.showCars(carList);
        System.out.println("Nachher: " + Car.GesammtAnzahl(anzahlCars));
    }
}


public class Car
{
    private final String name;
    private final String color;
    public static int anzahl = 0;

    public Car(String name, String color)
    {
        this.name = Objects.requireNonNull(name, "name cannot be null");
        this.color = Objects.requireNonNull(color, "color cannot be null");
        anzahl++;
    }

    public void assignDriver(String license, String location)
    {
        Objects.requireNonNull(license, "license can not be null");
        Objects.requireNonNull(location, "license can not be null");
    }

    public String getCarName()
    {
        return name;
    }

    public static void showCars(List<Car> carList)
    {
        for (Car car : carList)
        {
            System.out.println(car.getCarName());
        }
    }

    public static int GesammtAnzahl(int x)
    {
        return x - anzahl;
    }
}
