import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    Cuenta cuenta1 = new Cuenta("123456789P", 1234, 50, 20 );

    public void IngresarDinero(double cantidad){
        double total = cuenta1.getSaldo() + cantidad;
        cuenta1.setSaldo(total);
        System.out.println("Saldo actual: " + cuenta1.getSaldo());
    }

    public void SacarDinero(){
        System.out.println("\nSaldo actual: " + cuenta1.getSaldo());
        System.out.println("¿Cuánto dinero desea sacar?");
        double cantidad2 = sc.nextDouble();
        if(cantidad2 == cuenta1.getSaldo() || cantidad2 < cuenta1.getSaldo()){
            double total = cuenta1.getSaldo() - cantidad2;
            cuenta1.setSaldo(total);
            System.out.println("Saldo actual: " + cuenta1.getSaldo());
        }else{
            System.out.println("Saldo actual insuficiente");
        }
    }

    public void DNI(){
        System.out.println("\nSu DNI es: " + cuenta1.getDNI());
        System.out.println("Introduzca DNI correcto: ");
        String NVdni = sc.nextLine();
        cuenta1.setDNI(NVdni);
        System.out.println("Su DNI es: " + cuenta1.getDNI());
    }

    public void NumCuenta(){
        System.out.println("\nSu número de cuenta es: " + cuenta1.getNumcuenta());
        System.out.println("Introduzca nuevo número de cuenta: ");
        int NVnumcuenta = sc.nextInt();
        cuenta1.setNumcuenta(NVnumcuenta);
        System.out.println("Su nuevo número de cuenta es: " + cuenta1.getNumcuenta());
    }

    public void Interes(){
        System.out.println("\nSu interés anual es: " + cuenta1.getInteres());
    }
}
