package actividad3_figurasgeometricas;

public class Rectangulo {
    double base, altura; //Base y altura del rectángulo en centímetros
    
    Rectangulo(double baseR, double alturaR){
        base = baseR;
        altura = alturaR;
    }
    
    protected double calcularArea(){
        return base * altura;
    }
    
    protected double calcularPerimetro(){
        return (base + altura) * 2;
    }
    
}