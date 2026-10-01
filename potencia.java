public class potencia {
    public static int potencia(int base, int exp) {
    if (exp == 0) {                     
        return 1;
    }
    return base * potencia(base, exp - 1); 
}
public static void main(String[] args) {
    System.out.println("3 elevado a 7: " + potencia(3, 7));
}
