package actividad3_figurasgeometricas;

public class Cuadrado {
    double lado; //Longitud de los lados del cuadrado en centímetros
    
    Cuadrado(double l){
        lado = l;
    }
    
    protected double calcularArea(){
        return Math.pow(lado,2);
    }
    
    protected double calcularPerimetro(){
        return lado * 4;
    }
    
}