import java.util.Objects;
import java.util.List;
import java.util.LinkedList;

public class Main
{
	public static void main(String []args)
	{
		Tsunami tsunami = new Tsunami();
		Repair repeair = new Repair();
		List<House> houselist = new LinkedList<House>();
		
		int i = 0;
		
		while (i < 5)
		{
			i++;
			houselist.add(new House(false));
		}
		House.printHouseList(houselist);
		
		Tsunami.destroy(houselist);
		Repair.toRepair(houselist);
	}
}


class House
{
	boolean broken;
	
	House(boolean broken)
	{
		this.broken = Objects.requireNonNull(broken, "broken can not be null!");
		
	}
	
	public boolean getBroken()
	{
		return broken;
	}
	
	public static void printHouseList(List<House> houselist)
	{
		for(House house : houselist)
			System.out.println(house.getBroken());
	}
	
}


class Tsunami
{
	public static List<House> destroy(List<House> houselist)
	{
		for (House house : houselist)
		{
			if(house.getBroken() == false)
			{
				house.broken = true;
			}
			System.out.println(house.getBroken());
		}
		return houselist;
	}
}


class Repair
{
	public static List<House> toRepair(List<House> houselist)
	{
		for (House house : houselist)
		{
			if(house.getBroken() == true)
			{
				house.broken = false;
			}
			System.out.println(house.getBroken());
		}
		return houselist;
		
	}
}
