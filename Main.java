package entitas.asing;


public class Main {

    public static void main(String[] args) {
       Tank tank1 = new Tank();
       Tank tank2 = new Tank("Kotaku", 10000);
       
       tank1.info();
       tank2.info();
    }
}
