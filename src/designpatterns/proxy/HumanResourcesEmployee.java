package designpatterns.proxy;

class HumanResourcesEmployee extends Employee{

    public HumanResourcesEmployee(String name, String department, String position) {
        super(name, department, position);
    }

    @Override
    public void manageAnotherEmployee(String request) {
        super.manageAnotherEmployee(request);
    }
}