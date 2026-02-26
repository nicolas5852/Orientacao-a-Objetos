/**
 *
 * @author Nicolas
 */
public class Exemplo7 {
    public static void main(String[] args) {
        int[] TabNum = new int[3];
        int cont;
        
        TabNum[0] = 10;
        TabNum[1] = 15;
        TabNum[2] = 7;
        
        for(cont = 0;cont < 3;cont++)
        {
            System.out.println("Conteudo da TabNum[" + cont + "] = " + TabNum[cont]);
        }
    }
}
