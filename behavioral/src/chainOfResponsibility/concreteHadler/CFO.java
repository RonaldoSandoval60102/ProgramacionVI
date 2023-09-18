package chainOfResponsibility.concreteHadler;

import chainOfResponsibility.Chain.Expense;
import chainOfResponsibility.hadler.Approver;

public class CFO implements Approver {

    @Override
    public void handleRequest(Expense expense) {
        System.out.println("CFO will approve $" + expense.getAmount());
    }

}
