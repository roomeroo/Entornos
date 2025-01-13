public class Ejercicio04 {
    
    public int sumar(int a, int b) {
        return (a + b);
    }

    public int restar(int a, int b){
        return (a - b);
    }

    public int multiplicar(int a, int b) {
        return (a * b);
    }

    public float dividir(int a, int b) throws ArithmeticException{
        if(b == 0)throw new ArithmeticException("No dividas por 0");
        return ((float)a / (float)b);
    }
}