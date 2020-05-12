import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Formatter;
import java.util.Locale;

public class IntegralTest {
    public static void main(String[] arg)
    {
        ParqueaderoTest p = new ParqueaderoTest();
        int grade = 0;

        try {
            p.testConstructor1Junior();
            System.out.println(formatOutput("testConstructor1Junior", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testConstructor1Junior", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testConstructor1Junior", "10", new AssertionError(e.getMessage())));
        }
        finally{
         p.tearDown();
        }
        
        try {
            p.testConstructor2Junior();
            System.out.println(formatOutput("testConstructor2Junior", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testConstructor2Junior", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testConstructor2Junior", "10", new AssertionError(e.getMessage())));
        }
        finally{
         p.tearDown();
        }
        
        try {
            p.testConstructor3();
            System.out.println(formatOutput("testConstructor3", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testConstructor3", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testConstructor3", "10", new AssertionError(e.getMessage())));
        }
        finally{
         p.tearDown();
        }
        
        try {
            p.testParquearJunior();
            System.out.println(formatOutput("testParquearJunior", "15", null));
            grade += 15;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testParquearJunior", "15", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testParquearJunior", "15", new AssertionError(e.getMessage())));
        }
        finally{
         p.tearDown();
        }
        
        try {
            p.testRetirarJunior();
            System.out.println(formatOutput("testRetirarJunior", "20", null));
            grade += 20;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRetirarJunior", "20", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRetirarJunior", "20", new AssertionError(e.getMessage())));
        }
        finally{
         p.tearDown();
        }
        
        try {
            p.testCambiarMaximoCupoJunior();
            System.out.println(formatOutput("testCambiarMaximoCupoJunior", "15", null));
            grade += 15;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCambiarMaximoCupoJunior", "15", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCambiarMaximoCupoJunior", "15", new AssertionError(e.getMessage())));
        }
        finally{
         p.tearDown();
        }
        
        try {
            p.testConstructoresSenior();
            System.out.println(formatOutput("testConstructoresSenior", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testConstructoresSenior", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testConstructoresSenior", "10", new AssertionError(e.getMessage())));
        }
        finally{
         p.tearDown();
        }
        
        try {
            p.testMetodosSenior();
            System.out.println(formatOutput("testMetodosSenior", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testMetodosSenior", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testMetodosSenior", "10", new AssertionError(e.getMessage())));
        }
        finally{
         p.tearDown();
        }
        
        System.out.println("Grade :=>> "+grade);

    }

    private static String formatOutput(String testName, String value, AssertionError e) {
        StringBuilder sb = new StringBuilder();
        Formatter f = new Formatter(sb, Locale.getDefault());
        String grade = (e == null ? value : "0");
        f.format("Comment :=>> %s: %s. %s marks\n", testName, (e == null ? "success" : "failure"), grade);
        if (e != null) {
            f.format("********************\n%s\n", e.getMessage());
        }
        return sb.toString();
    }
    
    @Test
    public void testDummy(){IntegralTest.main(null);}

}
