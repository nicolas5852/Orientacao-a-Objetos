/**
 *
 * @author 0030482423014
 */
public class Exemplo3 {

    public static void main(String[] args) {
        int num;
        
        num = (int) (Math.random() * 100);
        
        if(num <= 50)
            System.out.println(num + " É menor ou igual que 50");
        else
            System.out.println(num + " É maior que 50");
        
        System.out.println();
    }
    
}
