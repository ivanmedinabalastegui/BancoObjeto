import java.util.Scanner;

public class ProgramaBanco {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Metodos mt = new Metodos();
        int opcion = 0;
        System.out.println("\nMenú Banco");

        while(opcion!=6){
            System.out.println("\n1. Ingresar dinero\n2. Sacar dinero\n3. Modificar DNI\n4. Modificar número" +
                    " de cuenta\n5. Ver interés anual\n6. Salir");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("\n¿Cuánto dinero desea ingresar?");
                    double cantidad = sc.nextDouble();
                    mt.IngresarDinero(cantidad);
                    break;

                case 2:
                    mt.SacarDinero();
                    break;

                case 3:
                    mt.DNI();
                    break;

                case 4:
                    mt.NumCuenta();
                    break;

                case 5:
                    mt.Interes();
                    break;

                case 6:
                    break;
            }
        }
    }
}
