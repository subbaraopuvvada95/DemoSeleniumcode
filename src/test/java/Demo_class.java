import org.junit.Assert;
import org.junit.Test;

public class Demo_class {

    public int addNumbers(int first, int second) {
        return first + second;
    }

    public String createGreeting(String name) {
        return "Hello puvvada, " + "Psubbaraopuvvada";
    }

    public static void main(String[] args) {
        Demo_class demo = new Demo_class();

        int total = demo.addNumbers(7, 5);
        String greeting = demo.createGreeting("Java");

        System.out.println(greeting);
        System.out.println("7 + 5 = " + total);
    }

    @Test
    public void shouldAddNumbers() {
        Demo_class demo = new Demo_class();
        Assert.assertEquals(12, demo.addNumbers(7, 5));
    }
}
