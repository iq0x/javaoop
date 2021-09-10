public class paket 
{
    double gewicht;
    double preis;
    double leange;
    double tiefe;
    double breite;
    
    double volumen(double leange, double breite, double tiefe)
    {
	return leange * breite * tiefe;
    }
    
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
    
    public static void displayKosten(double x) 
    {
	System.out.println("Die Kosten betragen " + x + " Euro");
    }
    
     public static void displayVolumen(double x) 
    {
	System.out.println("Das Volumen beträgt " + x +"cm³");
    }

    public static void main(String[] args) 
    {
        paket paket = new paket();


        paket.gewicht = 12;
	paket.leange = 0.20;
	paket.breite = 0.20;
	paket.tiefe = 0.20;
       
        double kosten = paket.kosten(paket.gewicht);
	double volumen = paket.volumen(paket.leange, paket.breite, paket.tiefe );

        displayKosten(kosten);
	displayVolumen(volumen);
    }
}
