import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    @Test
    public void shouldAddTwoNumbers(){
        int sum = Calculator.additionOfTwoNumbers(10,5);
        Assert.assertEquals(sum,15);
    }
    @Test
    public void shouldMulitplyTwoNumbers(){
        int product = Calculator.multiplyOfTwoNumbers(10,5);
        Assert.assertEquals(product,50);
    }
    @Test
    public void shouldDivideTwoNumbers(){
        int result = Calculator.divisionOfTwoNumbers(10,5);
        Assert.assertEquals(result,2);
    }
    @Test
    public void shouldSubtractTwoNumbers(){
        int result = Calculator.subtractionOfTwoNumbers(10,5);
        Assert.assertEquals(result,5);
    }
}
