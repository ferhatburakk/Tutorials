package designpatterns.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        TransferOperation transferOperation = null;
        TransferType transferType = TransferType.PDF;
        switch (transferType) {
            case SMS:
            {
                transferOperation = new TransferOperation(new SMSOperation());
                break;
            }
            case PDF:
            {
                transferOperation = new TransferOperation(new PDFOperation());
                break;
            }
            case MAIL:
            {
                transferOperation = new TransferOperation(new MailOperation());
                break;
            }
        }
        transferOperation.send();
    }
}

