
package gustavoguanabara;

/**
 *
 * @Jonathan_Rosa014
 */
public class GustavoGuanabara {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Nic", "Amarela", 0.4f );
        c1.status();
        
        System.out.println("***********OUTRA CANETA**************");
        
        Caneta c2 = new Caneta("BIC", "vermelha", 0.6f );
        c2.status();
        
        System.out.println("***********OUTRA CANETA**************");
        
        Caneta c3 = new Caneta("NAC", "Azul", 1.3f );
        c3.status();
        
        
        
    }
    
}
