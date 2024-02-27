# Time complexity project

## Objective

This project is aiming to understand how to enhance the time complexity of your code.   
   
## Implementation    
Enhance the time complexity of the below code.   
   
The below function **calculates the sum of squares** by using a `for` loop.    

```java
    public static int sumOfSquares(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i * i;
        }
        return result;
    }

```

The above code time complexity is **O(n)**.   
The required time complexity is **O(1)**.   

Hint:   
- O(1) means the code shouldn't have a `for` loop.   
- We can calculate the sum of squares using a mathematical formula `n(n+1)(2n+1)/6`.     




