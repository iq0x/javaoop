class Main {
  
    public static void main(String args[])
    {
        Urlaubstage[] u = new Urlaubstage[2];
  
        u[0] = new Urlaubstage();
 
        u[0].setData(4123, "helmut");
  
		System.out.println();
		
        u[0].getData();
    }
}
  

class Urlaubstage 
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
