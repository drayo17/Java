
/**
 *
 * @author Daniel
 */
public class Singleton {

    private static Singleton instancia;

    private Singleton() {

    }

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
 public void mensaje(){
     System.out.println("Todo bien");
 }   
 public static void main(String[] args){
     Singleton instancia=Singleton.getInstancia();
     instancia.mensaje();
     
 }
}


