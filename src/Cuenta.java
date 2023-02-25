class Cuenta {
    private double saldo;
    private int sucursal;
    private int numeroCuenta;
    private Cliente titular = new Cliente();

    public double getSaldo() {
        return this.saldo;
    }

    public int getSucursal(){
        return this.sucursal;
    }

    public void setSucursal(int sucursal){
        if (sucursal > 0){
            this.sucursal = sucursal;
        } else {
            System.out.println("No está permitido ingresar valores negativos");
        }
    }

    public int getNumeroCuenta(){
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta){
        if (numeroCuenta > 0){
            this.numeroCuenta = numeroCuenta;
        } else {
            System.out.println("No está permitido ingresar valores negativos");
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

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