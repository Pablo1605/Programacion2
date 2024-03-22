package RelacionesCuentaBancaria;

public class CurrentAccount extends Count {
    private float overDraft;

    public CurrentAccount(float balance, float annualRate, float overDraft) {
        super(balance, annualRate);
        this.overDraft = overDraft;
    }

    @Override
    public void record(float amount) {
        if (overDraft > 0){
            if (amount >= overDraft){
                amount -= overDraft;
                overDraft = 0;
            } else {
                overDraft -= amount;
                amount = 0;
            }
        }
        super.record(amount);
    }

    @Override
    public void withdraw(float amount) {
        if (amount <= balance + overDraft) {
            if (amount > balance) {
                overDraft -= (amount - balance);
                balance = 0;
            } else {
                balance -= 0;
            }
            numWithdrawals++;
        } else {
            System.out.println("No hay suficiente saldo y sobregiro para retirar esa cantidad");
        }
    }
    public void print(){
        super.print();
        System.out.println("Sobregiro: "+ overDraft);
    }
}
