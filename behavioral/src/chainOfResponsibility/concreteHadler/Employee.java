package chainOfResponsibility.concreteHadler;

import chainOfResponsibility.Chain.Expense;
import chainOfResponsibility.hadler.Approver;

public class Employee implements Approver {

    private final double MAX_APPROVAL_AMOUNT = 1000;
    private Approver next;

    @Override
    public void handleRequest(Expense expense) {
        if (expense.getAmount() < MAX_APPROVAL_AMOUNT) {
            System.out.println("Employee will approve $" + expense.getAmount());
        } else {
            next.handleRequest(expense);
        }
    }

    public void setNext(Approver next) {
        this.next = next;
    }
}
