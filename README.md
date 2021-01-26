# Практична робота "Створення і використання статичних методів"
## Завдання №5 "Знайти всі прості числа між двома заданими числами"
Код з файлу Exercise
```java
package domain;

/**
 * Клас який представляє завдання
 * @author Ilona1212
 */
public class Exercise {
    
    /**
     * Знаходить всі прості числа між двома заданими числами
     * @param min число від якого почати пошук
     * @param max число до якого шукати
     * @return прості числа через кому
     */
    public static String Calculate(int min, int max) {
        String s = "";
        
        for (int i = min; i <= max;i++){
            if (checkSimple(i)) {
                s += String.valueOf(i) + ", ";
            }
        }
        
        if (s.equals("")) {
            return "numbers found";
        }
        
        s = s.substring(0, s.length()-2);
        
        return s;
    }
    
    private static boolean checkSimple(int i){
    if (i <= 1)
        return false;
    else if (i <= 3)
        return true;
    else if (i%2 == 0 || i%3 == 0)
        return false;
    int n = 5;
    while (n*n <= i){
        if (i%n == 0 || i%(n+2) == 0)
            return false;
        n=n+6;
    }
    return true;
}
    
}
```

Код з файлу TestResult
```java
package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        System.out.println("Primary numbers from " + a + " to " + b +" : " + Exercise.Calculate(a, b));
    }
}
```
Фото виконання програми:

![alt-текст](https://github.com/ppc-ntu-khpi/35---static-methods-Ilona1212/blob/master/Images/1.png?raw=true)
![alt-текст](https://github.com/ppc-ntu-khpi/35---static-methods-Ilona1212/blob/master/Images/2.png?raw=true)
![alt-текст](https://github.com/ppc-ntu-khpi/35---static-methods-Ilona1212/blob/master/Images/3.png?raw=true)
