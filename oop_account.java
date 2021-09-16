
class Privatkunde 
{
    public static void main(String args[])
    {
        Personendaten pDaten = new Personendaten(1, "helmut", "soldier", "lolstr.3", 28222, "Bremen");
        Lieferanschrift lAnschrift = new Lieferanschrift(1, "helmut", "soldier", "lolstr.3", 28222, "Bremen");
        Bankverbindung bVerbindung = new Bankverbindung(1, 8318293, 313423);
    }
}


class Lieferanschrift 
{  
	private int lid;
    private String lvorname;
    private String lnachname;
    private String lstrasse;
    private int lplz;
    private String lort;
    
    public Lieferanschrift(int lid, String lvorname, String lnachname, String lstrasse, int lplz, String lort)
    {
		this.lid = lid;
		this.lvorname = lvorname;
		this.lnachname = lnachname;
		this.lstrasse = lstrasse;
		this.lplz = lplz;
		this.lort = lort;
    }
}


class Personendaten  
{  
    private int id;
    private String vorname;
    private String nachname;
    private String strasse;
    private int plz;
    private String ort;

    
    public Personendaten(int id, String vorname, String nachname, String strasse, int plz, String ort)
    {
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
    }
}


class Bankverbindung 
{  
    private int bid;
	private int iban;
	private int bic;
    
     public Bankverbindung(int bid, int iban, int bic)
    {
		this.bid = bid;
		this.iban = iban;
		this.bic = bic;
    }
}

