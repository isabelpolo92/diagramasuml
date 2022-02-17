package guia1MariaIsabelpoloDS;

public class Fraccionario {

    private int numerador;
    
    private int denominador;

    private int getNumerador() {
        return this.numerador;
    }
    
    
    private int setNumerador(Integer numerador) {
        return this.numerador = numerador;
    }
   
    public int getDenominador() {
        return this.denominador;
    }
    
    public int setDenominador(Integer denominador) {
        return this.denominador = denominador;
    }
    
    public static void main(String[] args) {
    	Fraccionario test = new Fraccionario();
    	test.setDenominador(6);
    	test.setNumerador(3);
    	System.out.println(test.getNumerador()+" /  "+test.getDenominador());
    	
    	
    }
    
    
    
    
    
}

