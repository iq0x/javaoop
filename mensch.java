
public class Main
{
	public static void main(String args[])
	{
		Mensch helmut = new Mensch("Helmut",35, 0);
		System.out.println("Anzahl Menschen = " + Mensch.getAnzahlMenschen());
		Mensch uwe = new Mensch("uwe",35, 0);

		helmut.setAlter(5);

		System.out.println("helmut iq = " + helmut.iq);
		helmut.bildung();
		System.out.println("helmut iq = " + helmut.iq);
		helmut.bildung(20);
		System.out.println("helmut iq = " + helmut.iq);

		Hund otto = new Hund();
		otto.setAlter(20);

		System.out.println(helmut.getAlter());

		System.out.println("Anzahl Menschen = " + Mensch.getAnzahlMenschen());

		System.out.println(helmut.toString());
	}
}


public abstract class Lebewesen
{
	String name;
	int alter;

	void setAlter(int alter)
	{
		this.alter = alter;
	}

	public int getAlter()
	{
		return alter;
	}
}


public final class Mensch extends Lebewesen
{
	int iq = 0;

	private static int anzahlMenschen = 0;

	public static int getAnzahlMenschen()
	{
		return anzahlMenschen;
	}

	void bildung()
	{
		iq += 5;
	}

	void bildung(int wieviel)
	{
		iq += wieviel;
	}

	Mensch(String name, int alter, int iq)
	{
		this.name = name;
		this.alter = alter;
		this.iq = iq;
		anzahlMenschen++;
	}

	Mensch () {}


	@Override
	public String toString()
	{
		return String.format("Name: %s, Alter: %s, IQ: %s", name, alter, iq);
	}
}


public class Hund extends Lebewesen
{

}
