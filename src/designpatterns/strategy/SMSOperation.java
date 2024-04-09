package designpatterns.strategy;

public class SMSOperation implements Transfer{
    @Override
    public void send() {
        System.err.println("SMS Gönderildi.");
    }
}
