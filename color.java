


import java.util.Random;
import java.io.*;

public class Qube 
{
	private int color;

	public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    public static void drawQube(int color)
    {
		if (color == 0)
			System.out.print(ANSI_RED_BACKGROUND + " " + ANSI_RESET);
		if (color == 1)
			System.out.print(ANSI_GREEN_BACKGROUND + " " + ANSI_RESET);
		if (color == 2)
			System.out.print(ANSI_YELLOW_BACKGROUND + " " + ANSI_RESET);
		if (color == 3)
			System.out.print(ANSI_BLUE_BACKGROUND + " " + ANSI_RESET);
		if (color == 4)
			System.out.print(ANSI_PURPLE_BACKGROUND + " " + ANSI_RESET);
		if (color == 5)
			System.out.print(ANSI_CYAN_BACKGROUND + " " + ANSI_RESET);
		if (color == 6)
			System.out.print(ANSI_WHITE_BACKGROUND + " " + ANSI_RESET);
	}
	
    public static void main(String[] args)
    {
		Random rand = new Random();
		
		while (true)
		{
			try{Thread.sleep(100);}catch(InterruptedException e){System.out.println(e);}
			
			clrscr();
			
			Qube[] cube = new Qube[1000];
			
			for (int i = 1; i<= 200; i++)
			{
				cube[i] = new Qube();
				
				int c = cube[i].color;
				
				c = rand.nextInt(6);
				
				drawQube(c);
			
				if(i % <input id="input" size="7"></input> == 0)
				{
					System.out.print("\n"); 
				}
			}
		}
    }

    public static void clrscr()
    {
		System.out.print("\033[H\033[2J"); 
		System.out.flush(); 	
    }
}
