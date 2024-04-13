package designpatterns.proxy;

class ProxyEmployeeManager implements IEmployeeManager{

    private RealEmployeeManager realEmployeeManager;

    @Override
    public void assignEmployeeToProject(Employee attempter) {
        if(attempter.getPosition().equals("Yönetici")){
            realEmployeeManager = new RealEmployeeManager();
            realEmployeeManager.assignEmployeeToProject(attempter);
        }
        else {
            System.out.println("Yetkisiz işlem girişimi! Girişimci : "+attempter.getName());
        }
    }

    @Override
    public void removeEmployeeFromProject(Employee attempter) {
        if(attempter.getPosition().equals("Yönetici")){
            realEmployeeManager = new RealEmployeeManager();
            realEmployeeManager.removeEmployeeFromProject(attempter);
        }
        else {
            System.out.println("Yetkisiz işlem girişimi! Girişimci : "+attempter.getName());
        }
    }

    @Override
    public void updateEmployeeRecord(Employee attempter) {
        if(attempter.getDepartment().equals("İnsan Kaynakları")){
            realEmployeeManager = new RealEmployeeManager();
            realEmployeeManager.updateEmployeeRecord(attempter);
        }
        else{
            System.out.println("Yetkisiz işlem girişimi! Girişimci : "+attempter.getName());
        }
    }

    @Override
    public void showEmployeeInfo(Employee attempter) {
        if(attempter.getDepartment().equals("İnsan Kaynakları") && attempter.getPosition().equals("Uzman")){
            realEmployeeManager = new RealEmployeeManager();
            realEmployeeManager.showEmployeeInfo(attempter);
        }
        else{
            System.out.println("Yetkisiz işlem girişimi! Girişimci : "+attempter.getName());
        }
    }

    @Override
    public void assignTaskToEmployee(Employee attempter) {
        realEmployeeManager = new RealEmployeeManager();
        realEmployeeManager.assignTaskToEmployee(attempter);
    }
}

