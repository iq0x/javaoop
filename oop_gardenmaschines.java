
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Main
{
	public static void main(String[] args)
    {
		System.out.println();	
		Gardenmaschines[] gardenmaschinery = new Gardenmaschines[2];
		gardenmaschinery[0] = new Gardenmaschines(1, "generators");
		gardenmaschinery[1] = new Gardenmaschines(2, "mowing maschinery");
		
		Generators[] generator = new Generators[1];
		generator[0] = new Generators(1, "Mannesmann M12953 Stromgenerator", "4-Takt", "196 ccm",  "3000 Watt" , "42 kg");
	
		MowingMaschines[] mowingMaschine = new MowingMaschines[1];
		mowingMaschine[0] = new MowingMaschines(1, "WOLF GARTEN Benzin-Rasenmäher Power-Edition 53 QRA", "53cm", "65L","96dB(A) ", "190cm³",  "4-takt");
		
		
		Maschinepower[] power = new Maschinepower[2];
		power[0] = new Maschinepower("4.4KW");
		power[1] = new Maschinepower("4.0KW");
		
		
		Fuel[] fuel = new Fuel[1];
		fuel[0] = new Fuel("Benzin");
		
		
		Dimensions[] dimension = new Dimensions[1];
		dimension[0] = new Dimensions("610 x 430 x 435 mm (LxBxH)");
		
		int i = 0;
		while (i < mowingMaschine.length)
		{
			System.out.println(mowingMaschine[i].getMowingMaschineName());		
			i++;
		}
		
		int n = 0;
		
		while (n < generator.length)
		{
			System.out.println(generator[n].getGeneratorName());		
			n++;
		}
		
		System.out.println();	
	}
}

public class Gardenmaschines
{
	private int machineryID;
	private String machineryCategory;

    public Gardenmaschines(int machineryID, String machineryCategory)
    {
		this.machineryID = machineryID;
		this.machineryCategory = machineryCategory;
    }
    
    
    public int getMachineryID()
    {
        return machineryID;
    }
    
    public String getMachineryCategory()
    {
        return machineryCategory;
    }
}


public class Generators
{
	private int generatorID;
	private String generatorName;
	private String generatorTyp;
	private String generatorDisplacement;

	private String generatorMaxPower;
	private String generatorWeight;

	

    public Generators(int generatorID, String generatorName, String generatorTyp, String generatorDisplacement, String generatorMaxPower, String generatorWeight)
    {
		this.generatorID = generatorID;
		this.generatorName = generatorName;
		this.generatorTyp = generatorTyp;
		this.generatorDisplacement = generatorDisplacement;

		this.generatorMaxPower = generatorMaxPower;
		this.generatorWeight = generatorWeight;

    }
    
    public int getGeneratorID()
    {
        return generatorID;
    }
    
    public String getGeneratorName()
    {
        return generatorName;
    }
   
    
    public String getGeneratorTyp()
    {
        return generatorTyp;
    }
    
    public String getGeneratorDisplacement()
    {
        return generatorDisplacement;
    }
    
    
    public String getGeneratorMaxPower()
    {
        return generatorMaxPower;
    }
    
    public String getGeneratorWeight()
    {
        return generatorWeight;
    }
}


public class MowingMaschines
{
	private int mowingMaschineID;
	private String mowingMaschineName;
	private String mowingCutWidth;
	private String mowingMaschineBag;
	private String mowingMaschineNOISE;
	private String mowingMaschineDisplacement;
	private String mowingMaschineTyp;

    public MowingMaschines(int mowingMaschineID, String mowingMaschineName, String mowingCutWidth, String mowingMaschineBag, String mowingMaschineNOISE, String mowingMaschineDisplacement, String mowingMaschineTyp)
    {
		this.mowingMaschineID = mowingMaschineID;
		this.mowingMaschineName = mowingMaschineName;
		this.mowingCutWidth = mowingCutWidth;
		this.mowingMaschineBag = mowingMaschineBag;
		this.mowingMaschineNOISE = mowingMaschineNOISE;
		this.mowingMaschineDisplacement = mowingMaschineDisplacement;

		this.mowingMaschineTyp = mowingMaschineTyp;
    }
    
    public int getMowingMaschineID()
    {
        return mowingMaschineID;
    }
    
    public String getMowingMaschineName()
    {
        return mowingMaschineName;
    }
    
    public String getMowingCutWidth()
    {
        return mowingCutWidth;
    }
    
    public String getMowingMaschineBag()
    {
        return mowingMaschineBag;
    }

    public String getMowingMaschineNoise()
    {
        return mowingMaschineNOISE;
    }
    
    
     public String getMowingMaschineDisplacement()
    {
        return mowingMaschineDisplacement;
    }

    
    public String getMowingMaschineTyp()
    {
        return mowingMaschineTyp;
    }
}


public class Maschinepower
{
	private String maschinePower;


    public Maschinepower(String maschinePower)
    {
		this.maschinePower = maschinePower;
    }
    
    public String getmaschinePower()
    {
        return maschinePower;
    }
  
}

public class Fuel
{
	private String maschineFuel;


    public Fuel(String maschineFuel)
    {
		this.maschineFuel = maschineFuel;
    }
    
    public String getMaschineFuel()
    {
        return maschineFuel;
    }
  
}


public class Dimensions
{
	private String maschienDimensions;


    public Dimensions(String maschienDimensions)
    {
		this.maschienDimensions = maschienDimensions;
    }
    
    public String getMaschienDimensions()
    {
        return maschienDimensions;
    }
  
}
