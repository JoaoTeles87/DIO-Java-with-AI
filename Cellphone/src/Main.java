import Celulares.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone20ProMaxTurbo = new Iphone.IphoneBuilder().build();
        //endereço de memória do objeto
        System.out.println(iphone20ProMaxTurbo);
    }
}