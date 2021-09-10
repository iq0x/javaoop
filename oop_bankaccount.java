public class bankkonto 
{
  	String vorname;
	String nachname;
    double kontonummer;
    double kontostand;
    double einzahlung;
    double auszahlung;
    
    double balance(double kontostand)
    {
        return kontostand;
    }
    

    public static void main(String[] args) 
    {
        bankkonto bankkonto = new bankkonto();

        bankkonto.vorname = "Helmut";
		bankkonto.nachname = "Best";
        bankkonto.kontonummer = 121314;
		bankkonto.kontostand = 1000.00;
       
        double x = bankkonto.balance(bankkonto.kontostand);
    

        System.out.println("Die Kosten betragen " + x + " Euro");
    }
}
