package bridge;

import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.UnknownAccountException;

public interface BankBridge {

    void transfert(String from, String to, double amount)
                throws InsufficientBalanceException, UnknownAccountException;

}
