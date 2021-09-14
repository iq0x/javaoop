class Main {
  
    public static void main(String args[])
    {
        Urlaubstage[] u = new Urlaubstage[5];
  
		int i = 0;
		int j = 0;
		
		while (i < u.length)
		{
			u[i] = new Urlaubstage();
			i++;
		}
       
		u[0].setData(523451, "Helmut", "Srgiano", "01.05.1945");
		u[1].setData(756543, "Jan", "Deluxe", "05.03.1975");
		u[2].setData(123456, "Uwe", "Knecht", "03.09.1999");
		u[3].setData(423111, "Oliver", "Hammer", "07.11.1990");
		u[4].setData(987211, "Dieter", "derbear", "01.02.1888");
		
		
		while (j < u.length)
		{
			u[j].getData();	
			j++;
		}
		
    }
}
  

class Urlaubstage 
{  
    private int id;
    private String vorname;
    private String nachname;
    private String geb;
    
  
    public void setData(int id, String vorname, String nachname, String geb)
    {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geb = geb;
    }
  
    public void getData()
    {
        System.out.println(id + "\t" + vorname + "\t" + nachname + "\t" + geb);
    }
}
