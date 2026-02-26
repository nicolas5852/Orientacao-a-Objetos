/**
 *
 * @author Nicolas
 */
public class Exemplo4 {
    public static void main(String[] args) {
        int num, cont;
        
        num = (int)(Math.random() * 100);
        System.out.println("\t\t\tTabuada do " + num + "\n");
        for(cont = 1;cont <=10;cont++)
        {
            System.out.println("\t\t\t" + num + " x " + cont + " = " + (num*cont));
        }
    }
    
}
