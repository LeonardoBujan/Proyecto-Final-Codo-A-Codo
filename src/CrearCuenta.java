public class CrearCuenta {
    public static void main(String[] args) throws Exception {
        boolean exitoRetiro;
        boolean exitoTransferencia;

        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.depositar(100);
        System.out.println(primeraCuenta.getSaldo());

        exitoRetiro = primeraCuenta.retirar(50);
        System.out.println(primeraCuenta.getSaldo());
        System.out.println(exitoRetiro);

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.depositar(2000);
        System.out.println(segundaCuenta.getSaldo());

        exitoTransferencia = segundaCuenta.transferir(300, primeraCuenta);

        System.out.println(segundaCuenta.getSaldo());
        System.out.println(exitoTransferencia);
        System.out.println(primeraCuenta.getSaldo());

        Cuenta terceraCuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNombre("Leonardo");
        cliente.setNroDocumento(25437894);
        cliente.setTelefeno("01145678932");
        terceraCuenta.setTitular(cliente);
        System.out.println("Nombre: " + terceraCuenta.getTitular().getNombre());
    }
}
