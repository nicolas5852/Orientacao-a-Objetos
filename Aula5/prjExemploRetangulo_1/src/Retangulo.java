/**
 *
 * @author Nicolas
 */
public class Retangulo {
    private double altura;
    private double base;
    
    public void setAltura(double x){
        altura = x;
    }
    
    public void setBase(double x) {
        base = x;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public double getBase(){
        return base;
    }
    
    public double calcArea(){
        return altura * base;
    }
    
    public double calcPerimetro(){
        return (altura + base) * 2;
    }
}
