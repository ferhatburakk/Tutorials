package designpatterns.observer;

public class UserWoman implements Observer {
    private Observable observable;
    public UserWoman() {
    }
    public void setObservable(Observable observable) {
        this.observable = observable;
    }
    @Override
    public void notify(String message) {
        System.out.println(message + " UserWoman Mesaj Geldi.");
    }
    public void removeObserver() {
        observable.removeObserver(this);
    }

}
