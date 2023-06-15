
package org.hung.mathutil.core.test;

import static org.hung.mathutil.core.MathUtility.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        //assertEquals(70, 70);
        assertEquals(1, getFactorial(0));      
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));

    }
    
}


//DDT là 1 phần mở rộng của Unit Test framework
//DATA DRIVEN TESTING
//           KO NHẦM VỚI TDD: TEST DRIVEN DEVELOPMENT
//                                 VIẾT CODE VÀ TEST SONG HÀNH VỚI NHAU => ĐÃ XONG

//NHƯNG CODE TEST BỐC MÙI (BAD SMELL) TRONG CODE NHIỀU
//NÊN NGƯỜI TA CHẾ RA CÁCH VIẾT CODE TEST ĐẸP HƠN, GỌN HƠN, DỄ BẢO TRÌ HƠN
