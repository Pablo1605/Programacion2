package RelacionesCuentaBancaria;

public class SavingCount extends Count {
    private boolean active;

    public SavingCount(float balance, float annualRate) {
        super(balance, annualRate);
        active = balance >= 10000;
    }

    @Override
    public void record(float amount) {
        if (active){
            super.record(amount);
        } else {
            System.out.println("La cuenta de ahorros esta inactiva, no se puede consignar");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (active){
            super.withdraw(amount);
        } else {
            System.out.println("La cuenta de ahorros esta inactiva, no se puede retirar");
        }
    }

    @Override
    public void monthlyStatement() {
        if (numWithdrawals > 4){
            annualCommission += (numWithdrawals - 4) * 1000;
        }
        super.monthlyStatement();
        active = balance >= 1000;
    }

    public void print() {
        super.print();
        System.out.println("Saldo: "+ balance);
        System.out.println("Comision mensual: "+ annualCommission);
    }
}
