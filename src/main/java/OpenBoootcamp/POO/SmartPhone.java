package OpenBoootcamp.POO;

public class SmartPhone extends SmartDevice{

    private String tipoconexion;
    private boolean red;

    public SmartPhone(String marca, String modelo, int pixelpantalla, int valor, String tipoconexion, boolean red) {
        super(marca, modelo, pixelpantalla, valor);
        this.tipoconexion = tipoconexion;
        this.red = red;
    }

    public String getTipoconexion() {
        return tipoconexion;
    }

    public void setTipoconexion(String tipoconexion) {
        this.tipoconexion = tipoconexion;
    }

    public boolean isRed() {
        return red;
    }

    public void setRed(boolean red) {
        this.red = red;
    }
}
