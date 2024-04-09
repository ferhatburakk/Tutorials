package designpatterns.observer;

public class UserMan implements Observer {
    private Observable observable;
    @Override
    public void notify(String message) {
        System.out.println(message + " UserMan Mesaj Geldi.");
    }
    public void removeObserver(){
        observable.removeObserver(this);
    }
}
