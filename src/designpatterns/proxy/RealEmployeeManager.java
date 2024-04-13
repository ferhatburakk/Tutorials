package designpatterns.proxy;

class RealEmployeeManager implements IEmployeeManager{

    @Override
    public void assignEmployeeToProject(Employee attempter) {
        System.out.println("Projeye çalışan atama sayfası yükleniyor...");
    }

    @Override
    public void removeEmployeeFromProject(Employee attempter) {
        System.out.println("Projeden çalışan çıkarma sayfası yükleniyor...");
    }

    @Override
    public void updateEmployeeRecord(Employee attempter) {
        System.out.println("Çalışan bilgilerini güncelleme sayafası yükleniyor...");
    }

    @Override
    public void showEmployeeInfo(Employee attempter) {
        System.out.println("Çalışan bilgilerine erişim sayfası yükleniyor...");
    }

    @Override
    public void assignTaskToEmployee(Employee attempter) {
        System.out.println("Çalışana görev atama sayfası yükleniyor...");
    }
}