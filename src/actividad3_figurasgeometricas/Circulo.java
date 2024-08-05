package actividad3_figurasgeometricas;

public class Circulo {
    double radio; //Radio del circulo en centímetros
    
    Circulo(double r){
        radio = r;
    }
    
    protected double calcularArea(){
        return Math.PI * Math.pow(radio,2);
    }
    
    protected double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
    
}