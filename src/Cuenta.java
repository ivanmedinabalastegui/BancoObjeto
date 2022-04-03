public class Cuenta {
    private String DNI;
    private int numcuenta;
    private double saldo;
    private int interes;

    public Cuenta(String DNI, int numcuenta, double saldo, int interes) {
        this.DNI = DNI;
        this.numcuenta = numcuenta;
        this.saldo = saldo;
        this.interes = interes;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public String toString() {
        return "DNI= " + DNI +
                "\nNúmero de cuenta= " + numcuenta +
                "\nSaldo= " + saldo +
                "\nInterés= " + interes;
    }
}
