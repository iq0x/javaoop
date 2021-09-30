import java.util.LinkedList;
import java.util.List;


public class Main 
{
    public static void main(String[] args) 
    {
        Team team = new Team();

        team.hinzufuegen(new Player("helmut"));
        team.hinzufuegen(new Player("johan"));
        team.hinzufuegen(new Player("Uwe"));
        team.hinzufuegen(new Player("otoo"));

        System.out.println("teamlist:");
        team.ausgeben();
    }
}


public class Player 
{
    private String PlayerName;

    public Player(String PlayerName) 
    {
		setPlayerName(PlayerName);
    }

    public String getPlayerName() 
    {
        return PlayerName;
    }

    public void setPlayerName(String PlayerName) 
    {
        this.PlayerName = PlayerName;
    }
}


public class Team 
{
    private final List<Player> playerListe = new LinkedList<>();

    public void hinzufuegen(Player player) 
    {
        if (player != null) 
        {
            playerListe.add(player);
        }
    }

 
    public Player getPlayer(int index) 
    {
        return playerListe.get(index);
    }

  
    public void ausgeben() 
    {
        for (Player player : playerListe) 
        {
            System.out.println(player.getPlayerName());
        }
    }
}
