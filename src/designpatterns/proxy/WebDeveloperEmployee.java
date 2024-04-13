package designpatterns.proxy;

class WebDeveloperEmployee extends Employee{

    public WebDeveloperEmployee(String name, String department, String position) {
        super(name, department, position);
    }

    @Override
    public void manageAnotherEmployee(String request) {
        super.manageAnotherEmployee(request);
    }
}