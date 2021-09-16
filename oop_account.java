import java.util.Scanner;

class Privatkunde 
{
    public static void main(String args[])
    {
		Scanner scanner = new Scanner(System.in);
		
        Personendaten Kunde1 				= new Personendaten(1, "helmut", "BrumBrum");
        Lieferanschrift KundeAnschrift 		= new Lieferanschrift("lolstr.3", 28222, "Bremen");
        Bankverbindung KundeBankverbindung 	= new Bankverbindung(1000.0 ,8318293, 313423);
             
        Shop fischladen 						= new Shop(10, 21);
        Artikel [] NeuerArtikel 			= new Artikel[6];
        

        NeuerArtikel[0] = new Artikel(1,"forelle", 19.99, 6);
        NeuerArtikel[1] = new Artikel(2,"karpfen", 29.99, 4);
        NeuerArtikel[2] = new Artikel(3,"scholle", 39.99, 4);
        NeuerArtikel[3] = new Artikel(4,"aal", 49.99, 3);
        NeuerArtikel[4] = new Artikel(5,"thun", 59.99, 1);
        NeuerArtikel[5] = new Artikel(6,"krabe", 69.99, 2);
        
        clrscr();
        
        
        System.out.println("Herzlich Wilkommen "+ Kunde1.getVorname() + " " + KundeBankverbindung.getPersonendaten());
        System.out.println("Unser Shop ist heute offen von "+ fischladen.getOeffnungszeitenVON() + " bis um " + fischladen.getOeffnungszeitenBIS());
        
       
        System.out.println("Unser Angebot heute:");
        System.out.println("=====================================");
        
        int count = 0;
        
		while (count < NeuerArtikel.length)
		{
			System.out.println(NeuerArtikel[count].getArtikelID() + "\t" +NeuerArtikel[count].getArtikelName() + "\t" + NeuerArtikel[count].getArtikelPreis() + "$\t" + NeuerArtikel[count].getArtikelAnzahl()+ "Stk");				
			count++;
		}   
		System.out.println("====================================="); 
		System.out.print("Welchen Artikel möchten Sie kaufen Sir?:");
		int buy = scanner.nextInt();
    }
    
    static void clrscr()
	{
		System.out.print("\033[H\033[2J"); 
	}
}

//-------------------------------------------------------------------------

class Lieferanschrift 
{  
    private String strasse;
    private int plz;
    private String ort;
    
    public Lieferanschrift(String strasse, int plz, String ort)
    {
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
    }
}


class Personendaten  
{  
    private int id;
    private String vorname;
    private String nachname;

	public Personendaten(int id, String vorname, String nachname)
    {
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;

    }
    
	public String getVorname()
    {
        return vorname;
    }
}


class Bankverbindung 
{  
    private double guthaben;
	private int iban;
	private int bic;
	private Personendaten personendaten;
    
    public Bankverbindung(double guthaben, int iban, int bic)
    {
		this.iban = iban;
		this.bic = bic;
		this.guthaben = guthaben;
    }
    
    public void setPersonendaten(Personendaten personendaten) 
    {
        this.personendaten = personendaten;
    }
    
    public Personendaten getPersonendaten() 
    {
        return personendaten;
    }
}


class Shop 
{  
    private int oeffnungszeitenVON;
    private int oeffnungszeitenBIS;

    public Shop(int oeffnungszeitenVON, int oeffnungszeitenBIS)
    {
		this.oeffnungszeitenVON = oeffnungszeitenVON;
		this.oeffnungszeitenBIS = oeffnungszeitenBIS;
    }
    
    public int getOeffnungszeitenVON()
    {
        return oeffnungszeitenVON;
    }
    
    public int getOeffnungszeitenBIS()
    {
        return oeffnungszeitenBIS;
    }
}


class Artikel 
{  
	private int ArtikelID;
	private String ArtikelName;
    private double ArtikelPreis;
	private int ArtikelAnzahl;
    
    public Artikel(int ArtikelID, String ArtikelName, double ArtikelPreis, int ArtikelAnzahl)
    {
		this.ArtikelID = ArtikelID;
		this.ArtikelPreis = ArtikelPreis;
		this.ArtikelAnzahl = ArtikelAnzahl;
		this.ArtikelName = ArtikelName;
    }
    
    
    public int getArtikelID()
    {
        return ArtikelID;
    }
    
    public String getArtikelName()
    {
        return ArtikelName;
    }
    
    public double getArtikelPreis()
    {
        return ArtikelPreis;
    }
    
    public int getArtikelAnzahl()
    {
        return ArtikelAnzahl;
    }
}

