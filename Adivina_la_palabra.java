import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Adivina_la_palabra {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> lista_palabras = new ArrayList<>(
            java.util.List.of("carta", "casa", "java", "creador")
        );

        int indice = random.nextInt(lista_palabras.size());
        String palabra_correcta = lista_palabras.get(indice);
        
        int intentos = 5;
        
        System.out.println("¡Bienvenido al juego de adivinanzas de palabras!");

        do{
            System.out.println("Te quedan " + intentos +  " intentos para adivinar la palabra secreta: _ _ _ _ _");
            String palabra = scanner.nextLine();
        
            if(palabra.equalsIgnoreCase(palabra_correcta))
            {
                System.out.println("Correcto: presiona [p] para volver a jugar");
           
                char letra = scanner.next().charAt(0);
                scanner.nextLine();
            

                if(letra == 'p' || letra == 'P')
                {
                    intentos = 5;
                }
            }
            else
            {
                intentos--;
                System.out.println("Incorrecto, te quedan " + intentos + " intentos más");
            }

            }while(intentos != 0);

        }
}
