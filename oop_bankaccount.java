import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

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
    
     public static boolean check(double kontostand, boolean positiveBalance)
    { 
	if (kontostand <= 0)
	    positiveBalance = false; 
	else
	    positiveBalance = true;
	    
	return positiveBalance;
    }
    
    public static void main(String[] args) throws IOException
    {
	    Scanner input = new Scanner(System.in);
	    bankkonto bankkonto = new bankkonto();
	    boolean positiveBalance = false;
	    
	    Path fileName = Path.of("helmut.txt");
	    String file_content = Files.readString(fileName);
	
	    double balanceFile = Double.parseDouble(file_content);
	    
	    bankkonto.vorname = "Helmut";
	    bankkonto.nachname = "Best";
	    bankkonto.kontonummer = 121314;
	    bankkonto.kontostand = balanceFile;
	    
	    String Eingabe;
	    
	    while (true)
		{
		
		String text  = ""+ bankkonto.kontostand;
		Files.writeString(fileName, text);
		
	    
		clrscr();
		titel();
		
		
		System.out.print("\nGuten Tag:\n" + bankkonto.vorname + " " + bankkonto.nachname);
		System.out.print("\nIhr Kontostand beträgt: " + bankkonto.kontostand + " Euro\n");
		System.out.print("(a)uszahlung / (e)inzahlung?\n\n");
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
		    if(check(bankkonto.kontostand, positiveBalance))
		    {
			System.out.println("Wieviel möchten Sie abheben?");
			double getMoney = input.nextDouble();
			bankkonto.kontostand = auszahlung(bankkonto.kontostand, getMoney);
			System.out.println(bankkonto.kontostand);
		    }
		    else
			System.out.println("kein geld");
			try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
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
