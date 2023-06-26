/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hung.mathutil.core;

/**
Class nay clone lại cái class huyền thoại java.util.Math
* với các hàm nổi tiếng MAth.sqrt() Math.sin() Math.random()
* và con số PI
 */
public class MathUtility {
    public static final double PI = 3.1415;
    
    
    public static long getFactorial(int n){
        
        if (n < 0 || n > 21) {
           throw new IllegalArgumentException("sai n . nhap n tu 0 -> 20");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * getFactorial(n - 1);
        
    }
}

//TDD: Test Driven Development phát triển p/m theo phong cách
// COde đến đâu kiểm thử đến đó , viết code và viết test case/ test run
//diễn ra song song, đan xen

//Cứ có hàm là có test case
//Viết ra các test case đủ bao quát các tình huống xài hàm
//Test case: là bộ dữ liệu dùng để đưa vào app/hàm để mô phỏng lại
//1 tình huống xài app/hàm. Nó có input data, giải thích cách dùng hàm
// và có giá trị trả về expected
// lát hồi run (test run/test execution) để luận đúng sai

// Dân DEV giống dân QC ở chỗ này:
// Đều phải viết/tạo ra test case, đều phát triển run/chạy Test
// Và đều phải đọc kết quả đúng sai
// DEV khác TESTER là phải viết CODE làm APP!!!

// Test case ko viết tự do mà viết theo template
// Viết tự do: 0! = 1; 1! = 1; 2! = 2 ; 3! = 6; 5! = 120

// Viết chuẩn tại test case(xuất hiện trong đề thi: PE, KHOÁ LUẬN T?N và ĐI LÀM
// Test case #1: (Mục tiêu test) check getF() with n = 0
// Step-Procedures (cách tiến hành test - input/output...)
//          1. Hiven n = 0
//          2. Call the getF(n) getF(0)
//Expected results: (Kết quả kì vọng)