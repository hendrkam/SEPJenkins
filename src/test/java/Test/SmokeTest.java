package Test;

import com.mycompany.sepjenkins.SEP;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Kamil
 */
public class SmokeTest {
    
    public SmokeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void sortArray1Test() {
         int[] a = {5,10,1};
         int[] exp = {1,5,10};
         
         a = SEP.sortArray1(a);
         
         assertArrayEquals(exp, a);
         
     }
     
     @Test
     public void sortArray2Test() {
         int[] a = {5,10,1};
         int[] exp = {1,5,10};
         
         a = SEP.sortArray2(a);
         
         assertArrayEquals(exp, a);
         
     }
}
