/**
 *
 * @author Nicolas
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet = new Retangulo();
        
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        System.out.println("Altura do objeto: " + objRet.getAltura());
        System.out.println("Base do objeto: " + objRet.getBase());
        System.out.println("Perimetro do objeto: " + objRet.calcPerimetro());
        System.out.println("Area do objeto: " + objRet.calcArea());
        
        
    }
    
}
