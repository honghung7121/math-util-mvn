/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.hung.mathutil.core.test;

import static org.hung.mathutil.core.MathUtility.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilityAdvancedTest {
    
    //tạo mảng 2 chiều chứa data sẽ dùng cho việc assertE()
    // gồm n đưa vào và expected trả về
    //  int                     long ->Object(wrapper class)
    //                                       (Integer Long)
    public static Object[][] initTestDate(){
        Object testData[][] = {{0,1},
                               {1,1},
                               {2,2},
                               {3,6}};
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestDate")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected){
        assertEquals(expected, getFactorial(n));  
    }
    
}

//TDD: Test driven Development là kĩ thuật lập trình mà 
// gắn với việc viết các test case để kiểm thử ngay những hàm mình vừa viết
// Viết code chính và viết code test(Junit, Unit Test) xen kẽ với nhau. 2 MÀU XANH ĐỎ LIÊN TỤC DIỄN RA

//DDT: Sự mở rộng thêm cho qtrinh viết code test(Junit)
//  Data Driven Testing 
//  Kĩ thuật tách bộ test data ra 1 chỗ riêng, tách vào mảng
//  tách vào file Excel, hay table; sau đó nhồi/fill/map
//  cái data từ mảnh này vào trong hàm so sánh assertEquals()
//  Giúp code dễ đọc, dễ kiểm tra xem  còn nhiều test case nào hay ko
