public class dummy 
{
    String name;
    double price;

    public static double price(double x)
    { 
		return x;
    }
   
    public static void main(String[] args)
    {
	    dummy dummy = new dummy();
	   
	    dummy.name = "Helmut";
	    dummy.price = 1234.00;
	    
		clrscr();
		titel();
		
		System.out.print("\niam a dummy, my name is " + dummy.name+ "\n");
		System.out.print("my price is " + price(dummy.price) + " $\n");
    }
    
    public static void titel()
    {
		System.out.println("█████████████████████████████████████");
		System.out.println("██              dummy              ██");
		System.out.println("█████████████████████████████████████");
    }
    
    public static void clrscr()
    {
		System.out.print("\033[H\033[2J"); 
		System.out.flush();  
    }
}
