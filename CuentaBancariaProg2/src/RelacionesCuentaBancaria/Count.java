package RelacionesCuentaBancaria;

public class Count {
    protected float balance;
    protected int numConsignments;
    protected int numWithdrawals;
    protected float annualRate;
    protected float annualCommission;

    public Count(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }

    public void record(float amount) {
        balance += amount;
        numConsignments++;
    }

    public void withdraw(float amount) {
        if (amount <= balance) {
            balance -= amount;
            numWithdrawals++;
        } else {
            System.out.println("No hay suficiente saldo para retirar esa cantidad");
        }
    }

    public void calculateMonthlyInterest() {
        float monthlyInterest = balance * (annualRate / 12) / 100;
        balance += monthlyInterest;
    }

    public void monthlyStatement() {
        balance -= annualCommission;
        calculateMonthlyInterest();
    }

    public void print() {
        System.out.println("Saldo: " + balance);
        System.out.println("Número de consignaciones: " + numConsignments);
        System.out.println("Número de retiros: " + numWithdrawals);
    }
}
