package designpatterns.proxy;

interface IEmployeeManager{
    void assignEmployeeToProject(Employee attempter);
    void removeEmployeeFromProject(Employee attempter);
    void updateEmployeeRecord(Employee attempter);
    void showEmployeeInfo(Employee attempter);
    void assignTaskToEmployee(Employee attempter);
}