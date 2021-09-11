
class Main {
  
    public static void main(String args[])
    {
  
        bot[] army = new bot[100];
  
        army[0] = new bot();
        army[1] = new bot();
  
        army[0].setData(4123, "helmut");
        army[1].setData(4322, "uwe");
  
        army[0].display();
        army[1].display();
    }
}
  

class bot {
  
    public int id;
    public String name;
  

    public void setData(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
  
    public void display()
    {
        System.out.println("bot id: " + id + "\tbot name: " + name);
    }
}
