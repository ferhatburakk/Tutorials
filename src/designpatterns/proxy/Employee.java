package designpatterns.proxy;

class Employee{

    private String name;
    private String department;
    private String position;

    private ProxyEmployeeManager proxyEmployeeManager;

    public Employee(String name, String department, String position) {
        this.name = name;
        this.department = department;
        this.position = position;
    }

    public void manageAnotherEmployee(String request){
        proxyEmployeeManager = new ProxyEmployeeManager();
        if(request.equals("Projeye Çalışan Ata")){
            proxyEmployeeManager.assignEmployeeToProject(this);
        }
        if(request.equals("Projeden Çalışan Sil")){
            proxyEmployeeManager.removeEmployeeFromProject(this);
        }
        if(request.equals("Çalışan Bilgilerini Güncelle")){
            proxyEmployeeManager.updateEmployeeRecord(this);
        }
        if(request.equals("Çalışan Bilgilerini Görüntüle")){
            proxyEmployeeManager.showEmployeeInfo(this);
        }
        if(request.equals("Çalışan Görevlendir")){
            proxyEmployeeManager.assignTaskToEmployee(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
