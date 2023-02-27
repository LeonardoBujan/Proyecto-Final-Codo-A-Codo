public class CrearCuenta {
    public static void main(String[] args) throws Exception {
        boolean exitoRetiro;
        boolean exitoTransferencia;
        
        Cliente cliente1 = new Cliente("Leonardo Martinez", 30297432);
        Cuenta primeraCuenta = new Cuenta(33, cliente1);
        System.out.println(primeraCuenta.getTitular().getNroDocumento());
        primeraCuenta.depositar(100);
        System.out.println(primeraCuenta.getSaldo());

        exitoRetiro = primeraCuenta.retirar(50);
        System.out.println(primeraCuenta.getSaldo());
        System.out.println(exitoRetiro);

        Cliente cliente2 = new Cliente("Jose Rojas", 21723456);
        Cuenta segundaCuenta = new Cuenta(45, cliente2);
        System.out.println(segundaCuenta.getTitular().getNroDocumento());
        segundaCuenta.depositar(2000);
        System.out.println(segundaCuenta.getSaldo());

        exitoTransferencia = segundaCuenta.transferir(300, primeraCuenta);

        System.out.println(segundaCuenta.getSaldo());
        System.out.println(exitoTransferencia);
        System.out.println(primeraCuenta.getSaldo());

        Cliente cliente3 = new Cliente("Rosario Diaz", 34854277);
        Cuenta terceraCuenta = new Cuenta(31, cliente3);
        System.out.println(terceraCuenta.getTitular().getNroDocumento());

        System.out.println("Se crearon " + Cuenta.getTotalCuentas() + " cuentas");
    }
}
