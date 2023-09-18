package chainOfResponsibility;

import chainOfResponsibility.Chain.Expense;
import chainOfResponsibility.concreteHadler.CFO;
import chainOfResponsibility.concreteHadler.Employee;
import chainOfResponsibility.concreteHadler.Manager;

public class App {
    
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        CFO cfo = new CFO();
        employee.setNext(manager);
        manager.setNext(cfo);

        Expense expense = new Expense(150);
        employee.handleRequest(expense);
        Expense expense2 = new Expense(1500);
        employee.handleRequest(expense2);
        Expense expense3 = new Expense(15000);
        employee.handleRequest(expense3);
    }
}
