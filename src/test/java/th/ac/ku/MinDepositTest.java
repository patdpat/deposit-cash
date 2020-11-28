package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinDepositTest {

    @Test
    void deposit_less_than_minimum(){
        float depositAmount = 50.00f;
        boolean expectedResult = false;

        Agent agent = new Agent();
        boolean actualResult = agent.checkMinDeposit(depositAmount);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_equals_minimum(){
        float depositAmount = 100.00f;
        boolean expectedResult = true;

        Agent agent = new Agent();
        boolean actualResult = agent.checkMinDeposit(depositAmount);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_more_than_minimum(){
        float depositAmount = 200.00f;
        boolean expectedResult = true;

        Agent agent = new Agent();
        boolean actualResult = agent.checkMinDeposit(depositAmount);

        assertEquals(expectedResult, actualResult);
    }
}
