import java.util.Scanner;
public class Mascota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usuario, nombra a tu mascota: ");
        String nombre = scanner.nextLine();

        int opc = 0;
        int hambre = 10, felicidad = 10, energia = 10;

        do
        {
            System.out.println("Nombre de la mascota: " + nombre);
            System.out.println("   .--.   ");
            System.out.println("  |o_o |  ");
            System.out.println("  |:_/ |  ");
            System.out.println(" //    \\ ");
            System.out.println("(|     | )");
            System.out.println("/'_    _/`\\");
            System.out.println("\\___)=(___/");

            System.out.println("--ANUNCIO--");
            System.out.println("**las estadisticas de la mascota no pueden superar los 10**");
            System.out.println("Hambre: " + hambre);
            System.out.println("Felicidad: " + felicidad);
            System.out.println("Energia: " + energia);

            System.out.println("¿Cuál es tu próxima acción?: ");
            System.out.println("1. Jugar con tu mascota");
            System.out.println("2. Darle de comer");
            System.out.println("3. Mandarla a dormir");
            System.out.println("4. Salir del simulador");
            int opc2 = scanner.nextInt();

            switch(opc2)
            {
                case 1:
                    {
                        System.out.println("has jugado con tu mascota... :D");
                        System.out.println("   .--.   ");
                        System.out.println("  |^_^ |  ");
                        System.out.println("  |:_/ |  ");
                        System.out.println(" //    \\        *   *");
                        System.out.println("(|     | )      * Juego! *");
                        System.out.println("/'_    _/`\\       *   *");
                        System.out.println("\\___)=(___/");
                        System.out.println("    (   )  ");
                        System.out.println("   *(   )* ");

                        felicidad = felicidad + 2;
                        hambre--;
                        energia = energia - 2;

                        felicidad = Math.min(felicidad, 10);
                        hambre = Math.min(hambre, 10);
                        energia = Math.min(energia, 10);

                        break;
                    }

                case 2:
                    {
                        System.out.println("Has alimentado a tu mascota");
                        System.out.println("   .--.   ");
                        System.out.println("  |o_o |  ");
                        System.out.println("  |:_/ |        nom nom...");
                        System.out.println(" //    \\         ><(((º>");
                        System.out.println("(|     | )");
                        System.out.println("/'_    _/`\\");
                        System.out.println("\\___)=(___/");

                        felicidad++;
                        hambre = hambre + 2;
                        energia--;

                        felicidad = Math.min(felicidad, 10);
                        hambre = Math.min(hambre, 10);
                        energia = Math.min(energia, 10);

                        break;
                    }
                case 3:
                    {
                        System.out.println("Ha mandado a dormir a tu mascota");
                        System.out.println("   .--.   ");
                        System.out.println("  | -_-|  ");
                        System.out.println("  |:_/ |        z Z z");
                        System.out.println(" //    \\ ");
                        System.out.println("(|     | )");
                        System.out.println("/'_    _/`\\");
                        System.out.println("\\___)=(___/");
                        System.out.println("    |     | ");
                        System.out.println("    '-----' ");

                        felicidad = felicidad - 2;
                        hambre = hambre - 2;
                        energia = energia + 3;

                        felicidad = Math.min(felicidad, 10);
                        hambre = Math.min(hambre, 10);
                        energia = Math.min(energia, 10);

                        break;
                    }

                case 4:
                    {
                        System.out.println("TU pinguino te esperara aqui para la proxima vez que lo visites :D");
                        System.out.println("   .--.   ");
                        System.out.println("  |^_^ |  ");
                        System.out.println("  |:_/ |         Adiós!");
                        System.out.println(" //    \\          ");
                        System.out.println("(|     | )");
                        System.out.println("/'_    _/`\\");
                        System.out.println("\\___)=(___/");
                        System.out.println("    /   \\       ");
                        System.out.println("   /_____\\         ");


                        opc = 4;
                        break;
                    }

                default:
                    {
                        System.out.println("Por favor selecciona una opcion valida");
                        System.out.println("   .--.   ");
                        System.out.println("  |o_o |  ");
                        System.out.println("  |:_/ |        ?");
                        System.out.println(" //    \\        Opción");
                        System.out.println("(|  ?  | )       inválida!");
                        System.out.println("/'_    _/`\\");
                        System.out.println("\\___)=(___/");
                        System.out.println("    (   )   ");
                        System.out.println("    /   \\      ");

                    }
            }

        }while(opc != 4);

        

    }
}
