package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;




public class TestingMain {

        public static void main(String[] args) {
            SimpleUser simpleUser = new SimpleUser("theForumUser");

            String result = simpleUser.getUsername();

            if (result.equals("theForumUser")) {
                System.out.println("test OK");
            } else {
                System.out.println("Error!");
            }
            System.out.println("Test - pierwszy test jednostkowy:");


            Calculator calc = new Calculator(5,10);
            int addResult = calc.sumAdd();
            Calculator calc1 = new Calculator(20,10);
            int substractResult = calc1.substratct();

            if(addResult == 15) {
                System.out.println("Test OK!");
            }
            else{
                System.out.println("Test not OK");
            }
            if(substractResult==10){
                System.out.println("Test OK!");
            }
            else{
                System.out.println("Test not OK!");
            }
            }
        }


