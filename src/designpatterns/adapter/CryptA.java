package designpatterns.adapter;

public class CryptA implements Crypt {
    public void encrypt(String text) {
        System.out.println("#CryptA#encrypt()");
    }
    public void decrypt(String text) {
        System.out.println("#CryptA#decrypt()");
    }
}
