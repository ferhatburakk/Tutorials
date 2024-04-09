package designpatterns.strategy;

public class PDFOperation implements Transfer{
    @Override
    public void send() {
        System.err.println("PDF Gönderildi.");
    }
}
