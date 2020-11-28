package th.ac.ku;

import java.util.Arrays;

public class Agent {
    private float maxDepositAmount = 30000;
    private float minDepositAmount = 100.00f;
    private float maxTotalDepositAmount = 50000;
    private String[] suspendedAccounts = new String[] {"123", "345"};

    public boolean checkDepositEachTime(float amount){
        boolean isDepositAmountLessThanOrEqualMaximumDepositAmount = amount <= maxDepositAmount;

        return isDepositAmountLessThanOrEqualMaximumDepositAmount;
    }

    public boolean checkTotalDepositAmount(float amount){
        boolean isTotalDepositAmountLessThanOrEqualMaxTotalDepositAmount = amount <= maxTotalDepositAmount;

        return isTotalDepositAmountLessThanOrEqualMaxTotalDepositAmount;
    }

    public boolean checkAccountNotDisabled(String accountId){
        boolean isNotSuspendedAccount = !Arrays.asList(suspendedAccounts).contains(accountId);

        return  isNotSuspendedAccount;
    }

    public boolean checkMinDeposit(float amount) {
        boolean isDepositAmountMoreThanOrEqualMinDepositAmount = amount >= minDepositAmount;

        return isDepositAmountMoreThanOrEqualMinDepositAmount;
    }
}
