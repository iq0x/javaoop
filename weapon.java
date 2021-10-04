import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main
{
    public static void main(String[] args)
    {
        Player player1 = new Player("helmut");
        Weapon sword = new Weapon("sword");
        Weapon axe = new Weapon("axe");

        System.out.println(player1.getPlayerName());

        player1.addWeaponList(sword);
        player1.addWeaponList(axe);
        player1.showWeaponList();

        System.out.println("item anzahl: "+player1.getItemAnzahl());

    }
}

public class Player
{
    String PlayerName;
    int ItemAnzahl = 0;
    private final List<Weapon> WeaponList = new ArrayList<Weapon>();

    Player (String PlayerName)
    {
        this.PlayerName = Objects.requireNonNull(PlayerName, "PlayerName cannot be null");
    }

    public String getPlayerName()
    {
        return PlayerName;
    }

    public void addWeaponList(Weapon weapon)
    {
        WeaponList.add(weapon);
        ItemAnzahl++;
    }

    public void showWeaponList()
    {
        for (Weapon weapon : WeaponList)
        {
            System.out.println(weapon.getWeaponName());
        }
    }

    public int getItemAnzahl()
    {
        return ItemAnzahl;
    }
}

public class Weapon
{
    String WeaponName;

    Weapon(String WeaponName)
    {
        this.WeaponName = Objects.requireNonNull(WeaponName, "WeaponName cannot be null");
    }

    public String getWeaponName()
    {
        return WeaponName;
    }
}
