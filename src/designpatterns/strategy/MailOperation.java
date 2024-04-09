package designpatterns.strategy;

public class MailOperation implements Transfer{
    @Override
    public void send() {
        System.err.println("Mail Gönderildi.");
    }
}
