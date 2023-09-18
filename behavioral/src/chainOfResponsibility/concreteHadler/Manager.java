package chainOfResponsibility.concreteHadler;

import chainOfResponsibility.Chain.Expense;
import chainOfResponsibility.hadler.Approver;

public class Manager implements Approver {

    private final double MAX_APPROVAL_AMOUNT = 10000;
    private Approver next;

    @Override
    public void handleRequest(Expense expense) {    
        if (expense.getAmount() < MAX_APPROVAL_AMOUNT) {
            System.out.println("Manager will approve $" + expense.getAmount());
        } else {
            next.handleRequest(expense);
        }
    }
    
    public void setNext(Approver next) {
        this.next = next;
    }
}
