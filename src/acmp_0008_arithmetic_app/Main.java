/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acmp_0008_arithmetic_app;

import org.me.arithmeticlib.Arithmetic;

/**
 *
 * @author Ivan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 30;
        String result = Arithmetic.arithmetic(a, b, c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("result = " + result);
        System.out.println();

        a = 5;
        b = 6;
        c = 31;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("result = " + result);
    }
}
