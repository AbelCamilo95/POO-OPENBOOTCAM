package OpenBoootcamp.POO;

public abstract class SmartDevice {
    private String marca;
    private String modelo;
    private int pixelpantalla;
    private int valor;

    public SmartDevice(String marca, String modelo, int pixelpantalla, int valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.pixelpantalla = pixelpantalla;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPixelpantalla() {
        return pixelpantalla;
    }

    public void setPixelpantalla(int pixelpantalla) {
        this.pixelpantalla = pixelpantalla;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
