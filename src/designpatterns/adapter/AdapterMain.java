package designpatterns.adapter;

public class AdapterMain {
    public static void main(String[] args) {

        Crypt crypt = new CryptA();
        crypt.encrypt("Ferhat");
        crypt.decrypt("Ahmet");

        System.out.println("-------------");

        crypt = new CryptB();
        crypt.encrypt("Dilek");
        crypt.decrypt("Mehmet");

        System.out.println("-------------");

        CodeX codeX = new CodeX();

        crypt = new CodeXAdapter(codeX);
        crypt.encrypt("Ahmet");
        crypt.decrypt("Acar");
    }
}
