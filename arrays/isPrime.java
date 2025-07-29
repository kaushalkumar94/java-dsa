import java.util.Scanner;

public class isPrime {
    public static void main(String[] var0){
        //System.out.println("ENTER NO OF NUMBER YOU WANT TO CHECK PRINE OR NOT :");
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i =1 ; i < t; i++){
           int n = scn.nextInt(); 
         
        int count= 0;
        for(int div=2; div*div<= n; div++){// we starteed the loop from 2 because no need to check for 1 
            if( n % div== 0){
                count++;
                break;// here break is put so that is should not check if we found 1st number which
                      // divides the given number (because even if one number if dividing other than 1
                      // and itself the number is not prime)

            }
        }
    
        if (count==0){
            System.out.println("  prine ");
        }
        else{
            System.out.println("not prime");
        }
    }
    
}
}
// //When determining if a number n is prime, we need to check if it has any
// divisors other than 1 and itself. The most efficient way to do this is by
// checking divisibility only up to the square root of n (√n).
// Mathematical Explanation
// Factors come in pairs
// If n = a × b, then one factor (a or b) must be ≤ √n, and the other must be ≥
// √n.
// Example:
// For n = 36, factor pairs are:
// (1, 36), (2, 18), (3, 12), (4, 9), (6, 6)
// Notice that after 6 × 6 = 36, the pairs repeat in reverse (9 × 4, 12 × 3,
// etc.).
// No need to check beyond √36 = 6 because any larger factor would already have
// a corresponding smaller pair.
// If no divisor ≤ √n, then n is prime
// If n has no divisors ≤ √n, it cannot have any divisors > √n (since they would
// have paired with a smaller factor).
// Example
// Check if 17 is prime:
// √17 ≈ 4.123, so check divisibility from 2 to 4.
// 17 % 2 ≠ 0, 17 % 3 ≠ 0, 17 % 4 ≠ 0 → Prime.
// Check if 16 is prime:
// √16 = 4, so check 2, 3, 4.
// 16 % 2 = 0 → Not prime.