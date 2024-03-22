package RelacionesCuentaBancaria;

public class Main {
    public static void main(String[] args) {
        SavingCount cuentaAhorros = new SavingCount(15000, 5);
        cuentaAhorros.record(2000);
        cuentaAhorros.withdraw(500);
        cuentaAhorros.monthlyStatement();
        cuentaAhorros.print();

        CurrentAccount cuentaCorriente = new CurrentAccount(5000f , 3f,5f);
        cuentaCorriente.withdraw(6000);
        cuentaCorriente.record(3000);
        cuentaCorriente.monthlyStatement();
        cuentaCorriente.print();
    }
}
