package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountIsValidTest {

    @Test
    void use_unsuspended_account_should_be_true(){
        String accountId = "2345";
        boolean expectedResult = true;

        Agent agent = new Agent();
        boolean actualResult = agent.checkAccountNotDisabled(accountId);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void account_is_deactivated_return_false(){
        String accountId = "123";
        boolean expectedResult = false;

        Agent agent = new Agent();
        boolean actualResult = agent.checkAccountNotDisabled(accountId);

        assertEquals(expectedResult, actualResult);
    }
}
