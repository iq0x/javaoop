public class Lieferdienst 
{
    double gewicht;
    double preis;

    double kosten(double gewicht) 
    {
		if (gewicht > 20)
        {
			System.out.println("Paket kann nicht versendet werden!");
		}
		else
		{
			if (gewicht >= 5 && gewicht <= 10)
				preis = 10.50;

			else if (gewicht > 10 && gewicht < 20)
				preis = 14;
   
			else
				preis = 7;
		}
		return preis;
    }
    
	public static void display(double x) 
    {
		  System.out.println("Die Kosten betragen " + x + " Euro");
    }



    public static void main(String[] args) 
    {
        Lieferdienst paket = new Lieferdienst();

        paket.gewicht = 20;
       
        double kosten = paket.kosten(paket.gewicht);

        display(kosten);

    }
}





