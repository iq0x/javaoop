
class Main {
  
    public static void main(String args[])
    {
  
        bot[] army = new bot[2];
  
        army[0] = new bot();
        army[1] = new bot();
  
        army[0].setData(4123, "helmut");
        army[1].setData(4322, "uwe");
  
  
		for(bot value: army)
		{
			System.out.println(value);		
		}
		
		
		int count = 0;
		
		while (count < army.length)
		{
			army[count].getData();			
			count++;
		}
		System.out.println();
		
        army[0].getData();
        army[1].getData();
    }
}
  

class bot 
{  
    public int id;
    public String name;
  

    public void setData(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
  
    public void getData()
    {
        System.out.println("ID: " + id + "\tname: " + name);
    }
}
