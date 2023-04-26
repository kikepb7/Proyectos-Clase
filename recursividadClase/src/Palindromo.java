public class Palindromo {
    public static void main(String[] args) {

        String cadena = "OSO";

        if (esPalindromo(cadena)) {
            System.out.println("Es un palíndromo!");
        } else {
            System.out.println("No es un palíndromo :/");
        }
    }

    public static boolean esPalindromo(String frase){
        frase = frase.toLowerCase();

        if(frase.length()<=2){
            return true;
        }
        else{
            if(frase.charAt(0) == frase.charAt(frase.length()-1)){
                return esPalindromo(frase.substring(1, frase.length()-1));
            }
            else{
                return false;
            }
        }
    }
}