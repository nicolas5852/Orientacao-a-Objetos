
/**
 *
 * @author Nicolas
 */
public class Exemplo6 {
    public static void main(String[] args) {
        int num, cont = 1;
        
        num = (int)(Math.random() * 100);
        System.out.println("\t\t\tTabuada do " + num + "\n");
        do
        {
            System.out.println("\t\t\t" + num + " x " + cont + " = " + (num*cont));
            cont++;
        }while(cont <=10);
    }
    
}
