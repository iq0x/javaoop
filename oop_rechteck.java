
public class Rechteck 
{
    int seitenlaengeA;
    int seitenlaengeB;

    int umfang() 
    {
        return 2 * seitenlaengeA + 2 * seitenlaengeB;
    }

    int flaeche() 
    {
        return seitenlaengeA * seitenlaengeB;
    }


    private static int umfang;

    public static void main(String[] args) 
    {
        Rechteck r = new Rechteck();

        r.seitenlaengeA = 3;
        r.seitenlaengeB = 4;
        
        
        int umfang = r.umfang();
        int flaeche = r.flaeche();

        System.out.println(Umfangumfang);
        System.out.println(flaeche);
    }
}




