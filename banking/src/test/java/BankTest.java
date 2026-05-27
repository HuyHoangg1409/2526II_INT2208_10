import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BankTest {
    @Test
    public void TestInvalidInput() {
        assertEquals("Invalid Input", Bank.classifyProfile(17, 200.0f, 575, 'C'));
        assertEquals("Invalid Input", Bank.classifyProfile(66, 200.0f, 575, 'C'));
        assertEquals("Invalid Input", Bank.classifyProfile(42, 4.9f, 575, 'C'));
        assertEquals("Invalid Input", Bank.classifyProfile(42, 500.1f, 575, 'C'));
        assertEquals("Invalid Input", Bank.classifyProfile(42, 200.0f, 299, 'C'));
        assertEquals("Invalid Input", Bank.classifyProfile(42, 200.0f, 851, 'C'));
        assertEquals("Invalid Input", Bank.classifyProfile(42, 200.0f, 575, 'A'));
    }

    @Test
    public void TestReject() {
        assertEquals("REJECT", Bank.classifyProfile(42, 200.0f, 350, 'C'));
        assertEquals("REJECT", Bank.classifyProfile(42, 15.0f, 300, 'C'));
        assertEquals("REJECT", Bank.classifyProfile(42, 10.0f, 800, 'F'));
        assertEquals("REJECT", Bank.classifyProfile(42, 10.0f, 650, 'C'));
        assertEquals("REJECT", Bank.classifyProfile(42, 10.0f, 650, 'F'));
    }

    @Test
    public void TestManualReview() {
        assertEquals("MANUAL REVIEW", Bank.classifyProfile(42, 10.0f, 800, 'C'));
        assertEquals("MANUAL REVIEW", Bank.classifyProfile(42, 5.0f, 701, 'C'));
        assertEquals("MANUAL REVIEW", Bank.classifyProfile(42, 200.0f, 650, 'F'));
        assertEquals("MANUAL REVIEW", Bank.classifyProfile(42, 200.0f, 750, 'F'));
        assertEquals("MANUAL REVIEW", Bank.classifyProfile(42, 500.0f, 850, 'F'));
    }

    @Test
    public void TestApprove() {
        assertEquals("APPROVE", Bank.classifyProfile(42, 200.0f, 650, 'C'));
        assertEquals("APPROVE", Bank.classifyProfile(42, 200.0f, 750, 'C'));
        assertEquals("APPROVE", Bank.classifyProfile(42, 500.0f, 850, 'C'));
    }
}
