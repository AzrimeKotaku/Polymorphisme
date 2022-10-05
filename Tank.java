package entitas.asing;

public class Tank extends Hero {
    
    public Tank(){
        this.name = "Default Name";
        this.health = 1500;
    }
    
    public Tank(String name, int health){
        this.name = name;
        this.health = health;
    }
    
    @Override
    public void info(){
        System.out.println("Identitas Hero");
        System.out.println("Nama : " + this.name);
        System.out.println("Health : " + this.health + "\n");
    }
}
