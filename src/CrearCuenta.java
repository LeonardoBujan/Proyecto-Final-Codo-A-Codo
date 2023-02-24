public class CrearCuenta {
    public static void main(String[] args) throws Exception {
        boolean exitoRetiro;
        boolean exitoTransferencia;

        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.depositar(100);
        System.out.println(primeraCuenta.saldo);        

        exitoRetiro = primeraCuenta.retirar(50);
        System.out.println(primeraCuenta.saldo);
        System.out.println(exitoRetiro);

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.depositar(2000);
        System.out.println(segundaCuenta.saldo);

        exitoTransferencia = segundaCuenta.transferir(300, primeraCuenta);

        System.out.println(segundaCuenta.saldo);
        System.out.println(exitoTransferencia);
        System.out.println(primeraCuenta.saldo);

        Cuenta terceraCuenta = new Cuenta();
        terceraCuenta.titular.nombre = "Leonardo";
        System.out.println(terceraCuenta.titular.nombre);
    }
}
