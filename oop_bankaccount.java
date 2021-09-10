import java.util.Scanner;

public class bankkonto 
{
    String vorname;
    String nachname;
    double kontonummer;
    double kontostand;
    
    
    public static double einzahlung(double kontostand, double putMoney)
    {
	kontostand = kontostand + putMoney;
	return kontostand;
    }
    
    public static double auszahlung(double kontostand, double getMoney)
    {
	kontostand = kontostand - getMoney;
	return kontostand;
    }
    
    public static double kontostand(double kontostand)
    {
	return kontostand;
    }
    
    public static void main(String[] args) 
    {
	    Scanner input = new Scanner(System.in);
	    bankkonto bankkonto = new bankkonto();

	    bankkonto.vorname = "Helmut";
	    bankkonto.nachname = "Best";
	    bankkonto.kontonummer = 121314;
	    bankkonto.kontostand = 1000.00;
	    String Eingabe;
	    
	    while (true)
	{
	    clrscr();
	    titel();
	    System.out.print("\nGuten Tag:\n" + bankkonto.vorname + " " + bankkonto.nachname);
	    System.out.print("\nIhr Kontostand beträgt: " + bankkonto.kontostand + " Euro\n");
	    System.out.print("(A)uszahlung / (E)inzahlung?\n\n");
	    Eingabe = input.nextLine();
	    
	    if (Eingabe.equals("e"))
	    {
		System.out.println("Wieviel möchten Sie einzahlen?");
		double putMoney = input.nextDouble();
		bankkonto.kontostand = einzahlung(bankkonto.kontostand, putMoney);
		System.out.println(bankkonto.kontostand);
	    }
	    
	    if (Eingabe.equals("a"))
	    {
		System.out.println("Wieviel möchten Sie abheben?");
		double getMoney = input.nextDouble();
		bankkonto.kontostand = auszahlung(bankkonto.kontostand, getMoney);
		System.out.println(bankkonto.kontostand);
	    }
	}
    }
    
    public static void titel()
    {
	System.out.println("██████████████████████████████████████");
	System.out.println("█████ $$$    Bankautomat    $$$ ██████");
	System.out.println("██████████████████████████████████████");
    }
    
     public static void clrscr()
    {
	System.out.print("\033[H\033[2J"); 
	System.out.flush();  
    }
}
