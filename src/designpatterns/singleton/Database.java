package designpatterns.singleton;

public class Database {
    private static Database db;
    private Database(){} //dışarıdan erişilmemesi için private.
    public static Database getInstance(){ //bu metot bu class'tan tek bir class oluşturulmasını sağlar.
        if (db == null) {
            db = new Database();
        }
        return db;
    }
}
