package chainOfResponsibility.hadler;

import chainOfResponsibility.Chain.Expense;

public interface Approver {
    void handleRequest(Expense expense);
}
