package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalDepositCashTest {

    @Test
    void total_deposit_less_than_50000(){
        boolean expectedResult = true;
        float totalDepositAmount = 30000.00f;
        Agent agent = new Agent();

        boolean actualResult= agent.checkTotalDepositAmount(totalDepositAmount);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void total_deposit_equals_50000(){
        boolean expectedResult = true;
        float totalDepositAmount = 50000.00f;
        Agent agent = new Agent();

        boolean actualResult= agent.checkTotalDepositAmount(totalDepositAmount);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void total_deposit_more_than_50000(){
        boolean expectedResult = false;
        float totalDepositAmount = 70000.00f;
        Agent agent = new Agent();

        boolean actualResult= agent.checkTotalDepositAmount(totalDepositAmount);
        assertEquals(expectedResult, actualResult);
    }

}
