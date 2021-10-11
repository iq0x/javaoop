
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Comparator;

public class Main
{
	public static void main(String args[])
	{ 
		List<Banana> liste = new LinkedList<>();	
		liste.add(new Banana("medium", 2.21));
		liste.add(new Banana("old", 1.52));
		liste.add(new Banana("old", 1.23));
		liste.add(new Banana("good", 2.12));
		liste.add(new Banana("medium", 3.55));
		
		Collections.sort(liste);
		Banana.displayList(liste);
		
		Collections.sort(liste);
		Banana.displayList2(liste);
		
		Collections.sort(liste, Banana.BananaComparator);
		Banana.displayList2(liste);
	} 
}

class Banana implements Comparable<Banana>
{
	String quality;
	double weight;
		
	Banana(String quality, double weight)
	{
		this.quality = quality;
		if (this.quality.equals("old"))
			this.quality = "best";
			
		this.weight = Objects.requireNonNull(weight, "weight can not be null!");
	}
	

		
	public String getQuality()
	{
		return quality;
	}
	
	public double getWeight()
	{
		return weight;
	}
		
	public static void displayList(List<Banana> liste)
	{
		for (Banana banana : liste)
		{
			System.out.println(banana.getWeight());
		}
	}	
	
	public static void displayList2(List<Banana> liste2)
	{
		for (Banana banana : liste2)
		{
			System.out.println(banana.getQuality());
		}
	}	
		
		
	@Override
    public int compareTo(Banana other)
    {
        if(this.getWeight() == other.getWeight())
        {
            return 0;
        }
        else
        {
            if(this.getWeight() > other.getWeight())
            {
                return 1;
            }
            
            else
            {
                return -1;
            }
        }
    }	
    
    
  public static Comparator<Banana> BananaComparator = new Comparator<Banana>() 
  {
	   public int compare(Banana banana1, Banana banana2) 
	   {
			String banana1n = banana1.getQuality();
			String banana2n = banana2.getQuality();
	      
			return banana1n.compareTo(banana2n);
		}
	};
}
