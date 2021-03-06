import java.util.regex.*;  
import java.util.Random;

class Main 
{
    public static void main(String args[])
    {
		clrscr();
        Urlaubstage[] u = new Urlaubstage[5];
  
		int i = 0;
		int j = 0;
		
		Random rand = new Random();
        
        int utage = 0;;

        
		while (i < u.length)
		{
			u[i] = new Urlaubstage();
			i++;
		}
       
		u[0].setData("ABC523451", "Helmut", "Srgiano", "01.05.1945", 30, utage);
		u[1].setData("ABC756543", "Jan", "Deluxe", "05.03.1975", 30, utage);
		u[2].setData("ABC123456", "Uwe", "Knecht", "03.09.1999", 30, utage);
		u[3].setData("ABC423111", "Oliver", "Hammer", "07.11.1990", 30, utage);
		u[4].setData("ABC987211", "Dieter", "derbear", "01.02.1888", 30, utage);
		
		while (j < u.length)
		{
			u[j].getData(rand.nextInt(30));	
			j++;
		}
    }
    
     public static void clrscr()
    {
		System.out.print("\033[H\033[2J"); 
		System.out.flush(); 	
    }
}
  

class Urlaubstage 
{  
    private String id;
    private String vorname;
    private String nachname;
    private String geb;
    private int jahresuralub;
    
  
	
	
    public void setData(String id, String vorname, String nachname, String geb, int jahresuralub, int utage)
    {
		boolean check;
		if(check = Pattern.matches("[a-zA-Z0-9]*", id)) 
			this.id = id;
		
		if(check = Pattern.matches("[a-zA-Z]*", vorname)) 
			this.vorname = vorname;
			
		if(check = Pattern.matches("[a-zA-Z]*", nachname))	
			this.nachname = nachname;
			


		this.geb = geb;
			

		this.jahresuralub = jahresuralub;
    }
  
    public void getData(int utage)
    {
		int rest = jahresuralub - utage;
		System.out.println(id + "\t" + vorname + "\t" + nachname + "\t" + geb + "\t" + jahresuralub+"Tage" + "\t" + utage+"Tage " + "\tResturlaub: " + rest);

    }
    
  
}
