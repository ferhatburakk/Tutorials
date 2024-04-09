package designpatterns.strategy;

public class TransferOperation {
    private final Transfer transfer;
    public TransferOperation(Transfer transfer) {
        this.transfer = transfer;
    }
    public void send() {
        transfer.send();
    }
}
