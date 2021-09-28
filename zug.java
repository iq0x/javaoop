import java.io.*;
import java.util.*;

public class Main 
{
     public static void main(String args[])
     {
		   ArrayList<Container> container = new ArrayList<Container>();
		    
		   
		   container.add(new Container(40));
		   container.add(new Container(20));
		   container.add(new Container(20));
		   container.add(new Container(40));
		   container.add(new Container(40));
		   container.add(new Container(20));
		   container.add(new Container(20));
		   container.add(new Container(20));
		   container.add(new Container(20));
		   container.add(new Container(20));
		   container.add(new Container(20));
		   
		   
		   
		  System.out.println("\nder zug hat:" + sortieren(container) + " Wagoons");    
     }
     
     public static int sortieren(ArrayList<Container> container)
     {
		 
		 
		 ArrayList<Wagoon> wagoon = new AarrayList<Wagoon>();  
		  int a = 0;
		   int b = 0;
		   
		   for(Container lol: container)
		   {
				if (lol.getContainerLeange() == 20)
				{
					a++;
					if (a % 2 == 0)
					{
						wagoon.add(new Wagoon(1));
					}
				}
					
				if (lol.getContainerLeange() == 40)
				{
					b++;
					wagoon.add(new Wagoon(1));
				}
		   }
		   
		   if(a % 2 != 0)
				wagoon.add(new Wagoon(1));
				
			
		   
		 
		 return wagoon.size();
	 }
}


public class Container  
{
    private int containerLeange;

    public Container(int containerLeange) 
    {
         this.containerLeange = containerLeange;

    }

    public int getContainerLeange() 
    {
         return containerLeange;
    }
}


public class Wagoon  
{
    private int wagoonAnzahl;
    
    public Wagoon(int wagoonAnzahl) 
    {
         this.wagoonAnzahl = wagoonAnzahl;

    }

    public int getWagoonAnzahl() 
    {
         return wagoonAnzahl;
    }
}
