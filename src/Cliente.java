class Cliente{
    private String nombre;
    private int nroDocumento;
    private String telefeno;

    // metodo constructor
    public Cliente(String nombre, int nroDocumento){
        if (nombre != null){
            this.nombre = nombre;
        } else {
            System.out.println("Completar nombre de cliente");
        }
        if (nroDocumento > 1) {
            this.nroDocumento = nroDocumento;
        } else {
            System.out.println("Completar con dni valido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getTelefeno() {
        return telefeno;
    }

    public void setTelefeno(String telefeno) {
        this.telefeno = telefeno;
    }
}