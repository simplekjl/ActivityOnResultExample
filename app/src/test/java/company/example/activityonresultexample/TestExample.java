package company.example.activityonresultexample;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by admin on 1/22/2016.
 */
public class TestExample
{
    /*
        If you want to create a HTML for test unit you have to run the project by code into the terminal
        
     */
    @Test
    public void addint() {
        MathTest nObject = new MathTest();
        int result = nObject.addTwo(2, 3);
        assertEquals(5,result);
    }
}
