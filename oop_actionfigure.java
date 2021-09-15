
public class ActionFigur
{
	private String name;
    private String species;
	private int attack;
	private int defense;

    public ActionFigur(String name, String species, int attack, int defense)
    {
		this.name = name;
        this.species = species;
        this.attack = attack;
        this.defense = defense;
    }
    
    public static String fight(ActionFigur fighter, ActionFigur heilerin)
    {
		ActionFigur support = new ActionFigur("soeren", "gumba", 2, 4);
		ActionFigur boss = new ActionFigur("mike", "titan", 9, 12);
		
		String winner;
		
		winner = (fighter.attack + support.attack > boss.defense) ? fighter.name : boss.name;
		
		return winner;
	}



	public static void main(String[] args)
    {
        ActionFigur fighter = new ActionFigur("helmut", "soldier", 10, 3);
        ActionFigur heilerin = new ActionFigur("sergio", "troll", 4, 5); 
       
        
        System.out.println(heilerin.name + " vs " + fighter.name);
        System.out.println("uhahhhhh  aauu u &/$§%&=))&=)(/ u ahhh aaaa oooo");
        System.out.println("The Winner is: " + fight(fighter, heilerin));
    } 
}
