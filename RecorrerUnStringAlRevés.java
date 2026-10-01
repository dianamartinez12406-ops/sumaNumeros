public class AlRevés {
   public static void alReves(String texto, int indice) {
    if (indice < 0) {                  
        return;
    }
    System.out.print(texto.charAt(indice));
    alReves(texto, indice - 1);        
}
public static void main(String[] args) {
    System.out.println("Al reves: ");
    alReves("Ana Lilia", "Ana LiLia".length()-1);
}


