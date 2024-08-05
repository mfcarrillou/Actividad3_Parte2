package actividad3_figurasgeometricas;

public class TrianguloRectangulo {
    double base, altura; //Base y altura del triángulo en centímetros
    double h; //Hipotenusa del triángulo (Tercer lado)
    
    TrianguloRectangulo(double baseT, double alturaT){
        base = baseT;
        altura = alturaT;
    }
    
    protected double calcularArea(){
        return (base * altura)/2;
    }
    
    protected double calcularHipotenusa(){
        return Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
    }
    
    protected double calcularPerimetro(){
        return base + altura + calcularHipotenusa();
    }
    
    protected String tipoTriangulo(){
        h = calcularHipotenusa();
        String tipo;
        if( base == altura && base == h){
           tipo = "Equilátero";
        } else if ( base != altura && base != h) {
           tipo = "Escaleno";
        } else{
           tipo = "Isósceles";
        }
        return tipo;
    }
    
}