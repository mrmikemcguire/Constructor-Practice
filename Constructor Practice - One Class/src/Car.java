import java.util.ArrayList;

public class Car
	{
	private String make;
	private String model;
	private String color;
	private double mpg;
	private double gasCapacity;

	public Car(String ma, String mo, String c, double m, double g)
		{
		make = ma;
		model = mo;
		color = c;
		mpg = m;
		gasCapacity = g;
		}
	
	public String getMake()
		{
		return make;
		}

	public String getModel()
		{
		return model;
		}

	public String getColor()
		{
		return color;
		}

	public double getMpg()
		{
		return mpg;
		}

	public double getGasCapacity()
		{
		return gasCapacity;
		}

	public static void main(String[] args)
		{
		 ArrayList <Car> inventory = new ArrayList<Car>();
		 
		 inventory.add(new Car("Honda", "Civic", "Blue", 40.3, 10.0));
		 inventory.add(new Car("Suburu", "Outback", "Red", 21.4, 12.9));
		 inventory.add(new Car("Ford", "Fiesta", "Yellow", 33.7, 11.5));
		 inventory.add(new Car("Mazda", "CX-9", "White", 19.4, 18.7));
		 inventory.add(new Car("Chevrolet", "Camaro", "Red", 12.3, 16.2));
		 
		 for (Car c : inventory)
			 {
			 System.out.println(c.getMpg());
			 }
		}
	}
