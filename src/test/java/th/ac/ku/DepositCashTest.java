package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashTest {

    @Test
    void deposit_less_than_30000_return_true(){
         boolean expectedResult = true;
         float depositAmount = 5000.00f;

         Agent agent  = new Agent();
         boolean actualResult = agent.checkDepositEachTime(depositAmount);

         assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_equal_30000_return_true(){
        boolean expectedResult = true;
        float depositAmount = 30000.00f;

        Agent agent  = new Agent();
        boolean actualResult = agent.checkDepositEachTime(depositAmount);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_more_than_30000_return_false(){
        boolean expectedResult = false;
        float depositAmount = 32000.00f;

        Agent agent  = new Agent();
        boolean actualResult = agent.checkDepositEachTime(depositAmount);

        assertEquals(expectedResult, actualResult);
    }
}
