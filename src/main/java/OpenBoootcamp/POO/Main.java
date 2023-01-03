package OpenBoootcamp.POO;

public class Main {
    public static void main(String[] args) {

        SmartPhone apple141 = new SmartPhone("apple","iphone 14",7,5600000,"5G",true);

        System.out.println(apple141.getMarca());
        System.out.println(apple141.getModelo());
        System.out.println(apple141.getPixelpantalla());
        System.out.println(apple141.getValor());
        System.out.println(apple141.getTipoconexion());
        System.out.println(apple141.isRed());

        SmartWatch applewatch = new SmartWatch("apple","6 gen",4,2300000,true,true,true);

        System.out.println(applewatch.getMarca());
        System.out.println(applewatch.getModelo());
        System.out.println(applewatch.getPixelpantalla());
        System.out.println(applewatch.getValor());
        System.out.println(applewatch.isPodometro());
        System.out.println(applewatch.isGps());
        System.out.println(applewatch.isTelefono());

    }
}