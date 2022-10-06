package fizzbuzz.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzServiceTest {

     @Test
     public void should_return_normal_number(){
          assertGuessNumber("1", 1);
          assertGuessNumber("2", 2);
     }

     private static void assertGuessNumber(String expected, int i) {
          assertEquals(expected, new FizzbuzzService().guessNunber(i));
     }

     @Test
     public void given_can_be_divided_by_3_should_return_fizz(){
          assertGuessNumber("fizz", 3);
          assertGuessNumber("fizz", 6);
          assertGuessNumber("fizz", 13);
     }

     @Test
     public void given_can_be_divided_by_5_should_return_buzz(){
          assertGuessNumber("buzz", 5);
          assertGuessNumber("buzz", 10);
          assertGuessNumber("buzz", 52);
     }

     @Test
     public void given_can_be_divided_by_3_and_5_should_return_fizzbuzz(){
          assertGuessNumber("fizzbuzz", 15);
          assertGuessNumber("fizzbuzz", 30);
          assertGuessNumber("fizzbuzz", 54);
     }
}
