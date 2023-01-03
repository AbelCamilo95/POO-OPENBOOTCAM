package OpenBoootcamp.POO;

public class SmartWatch extends SmartDevice{

    private boolean podometro;
    private boolean gps;
    private boolean telefono;

    public SmartWatch(String marca, String modelo, int pixelpantalla, int valor, boolean podometro, boolean gps, boolean telefono) {
        super(marca, modelo, pixelpantalla, valor);
        this.podometro = podometro;
        this.gps = gps;
        this.telefono = telefono;
    }

    public boolean isPodometro() {
        return podometro;
    }

    public void setPodometro(boolean podometro) {
        this.podometro = podometro;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isTelefono() {
        return telefono;
    }

    public void setTelefono(boolean telefono) {
        this.telefono = telefono;
    }
}
