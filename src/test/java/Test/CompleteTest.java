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
public class CompleteTest {
    
    public CompleteTest() {
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
     public void sortArray1CompleteTestA() {
         int[] a = {5,10,1};
         int[] exp = {1,5,10};
         a = SEP.sortArray1(a);
         assertArrayEquals(exp, a);
     }
     
     @Test
     public void sortArray1CompleteTestB() {
         int[] a = {-10,1,150,5,2};
         int[] exp = {-10,1,2,5,150};
         a = SEP.sortArray1(a);
         assertArrayEquals(exp, a);
     }
     
     @Test
     public void sortArray1CompleteTestC() {
         int[] a = {-1,-2,-3};
         int[] exp = {-3,-2,-1};
         a = SEP.sortArray1(a);
         assertArrayEquals(exp, a);
     }
     
     @Test
     public void sortArray2CompleteTestA() {
         int[] a = {5,10,1};
         int[] exp = {1,5,10};
         
         a = SEP.sortArray2(a);
         
         assertArrayEquals(exp, a);
         
     }
}
