package designpatterns.adapter;

public interface Crypt {
    void encrypt(String text);
    void decrypt(String text);
}
