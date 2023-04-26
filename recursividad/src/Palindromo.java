public class Palindromo {
    public static void main(String[] args) {

        String cadena = "Amor a Roma";
        String cadena2 = "Hola, estoy bien";

        if (esPalindromo(cadena)) {
            System.out.println(cadena + " --> Es un palíndromo! :)");
        }
        else {
            System.out.println(cadena + " --> No es un palíndromo :/");
        }

        if(esPalindromoJose(cadena2)) {
            System.out.println(cadena2 + " --> Es un palindromo! :D ");
        }
        else {
            System.out.println(cadena2 + " --> No es un palindromo :S");
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

    public static boolean esPalindromoJose(String frase){
        // Limpiamos la frase
        frase = frase.toLowerCase().replaceAll(" ", "");

        if(frase.length() <= 1){
            return true;
        }
        else{
            return frase.charAt(0) == frase.charAt(frase.length() - 1) && esPalindromoJose(frase.substring(1, frase.length() - 1));
        }
    }
}