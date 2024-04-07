/*

Problem:
Given a list of integers, write a program to classify each number into one of the following categories:

Positive Even: Even numbers greater than zero.
Positive Odd: Odd numbers greater than zero.
Negative Even: Even numbers less than zero.
Negative Odd: Odd numbers less than zero.
Zero: The number zero.
Your task is to implement a function called numberClassification that takes a list of integers as input and returns a map that contains the count of each category. The map should have the categories as keys and the count of numbers in each category as values.

*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(0);
        numbers.add(7);
        numbers.add(-8);

  Map<String, Integer> resultsMap = new HashMap<String, Integer>();

  numberClassification(numbers, resultsMap);
  System.out.println("Classification Results: " + resultsMap);

  }
    
    public static void numberClassification(List<Integer> numbers, Map<String, Integer> resultsMap) {
      int zeroCount = 0;
      int positiveEvenCount = 0;
      int positiveOddCount = 0;
      int negativeEvenCount = 0;
      int negativeOddCount = 0;
      
      for(int i = 0; i < numbers.size(); i++) {
        if(numbers.get(i) == 0) {
          zeroCount++;
        } else if (numbers.get(i) > 0 && numbers.get(i) % 2 == 0){
          negativeEvenCount++;
        } else if (numbers.get(i) > 0 && numbers.get(i) % 2 != 0){
          negativeOddCount++;
        } else if (numbers.get(i) %2 == 0){
          positiveEvenCount++;
        } else {
          positiveOddCount++;
        }
      }

      resultsMap.put("Negative Even", negativeEvenCount);
      resultsMap.put("Negative Odd", negativeOddCount);
      resultsMap.put("Zero", zeroCount);
      resultsMap.put("Positive Odd", positiveOddCount);
      resultsMap.put("Positive Even", positiveEvenCount);
    
    System.out.println("Expected: {Negative Even=2, Negative Odd=1, Zero=1, Positive Odd=4, Positive Even=2} - \nActual: " + resultsMap);
  }
}
