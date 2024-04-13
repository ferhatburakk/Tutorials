package designpatterns.proxy;

public class EmployeeManager{

    public void assignEmployeeToProject(Employee attempter) {
        System.out.println("Projeye çalışan atama sayfası yükleniyor...");
    }

    public void removeEmployeeFromProject(Employee attempter) {
        System.out.println("Projeden çalışan çıkarma sayfası yükleniyor...");
    }

    public void updateEmployeeRecord(Employee attempter) {
        System.out.println("Çalışan bilgilerini güncelleme sayafası yükleniyor...");
    }

    public void showEmployeeInfo(Employee attempter) {
        System.out.println("Çalışan bilgilerine erişim sayfası yükleniyor...");
    }

    public void assignTaskToEmployee(Employee attempter) {
        System.out.println("Çalışana görev atama sayfası yükleniyor...");
    }
}
