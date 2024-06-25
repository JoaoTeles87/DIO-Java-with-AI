package Celulares;

import Funcionalidades.AparelhosTelefonicos;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhosTelefonicos, NavegadorInternet{
    private static Iphone iphone;
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música no Iphone");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música no Iphone");
    }

    @Override
    public void removerMusica() {
        System.out.println("Removendo música no Iphone");
    }

    @Override
    public void ligarAparelho(String number) {
        System.out.println("Ligando para " + number + " no Iphone");
    }

    @Override
    public void desligarAparelho() {
        System.out.println("Desligando o Iphone");
    }

    @Override
    public void abrirBrowse(String url) {
        System.out.println("Abrindo o browser no Iphone");
    }

    @Override
    public void fecharBrowser() {
        System.out.println("Fechando o browser no Iphone");
    }

    private Iphone() {
        System.out.println("Iphone criado");

    }

    static public class IphoneBuilder {
        public IphoneBuilder() {
            iphone = new Iphone();
        }
        public Iphone build() {
            return iphone;
        }
    }
}
