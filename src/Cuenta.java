class Cuenta {
    double saldo;
    int agencia;
    int numeroCuenta;
    Cliente titular = new Cliente();

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean retirar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Cuenta cuenta){
        boolean exitoRetiro = this.retirar(valor);
        if (exitoRetiro == true){
            cuenta.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
}