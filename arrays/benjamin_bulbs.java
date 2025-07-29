import java.util.Scanner;
public class benjamin_bulbs {
    public static void main(String[] args){
    Scanner scn= new Scanner(System.in);
    int n = scn.nextInt();

    for(int i =1; i*i <=n ; i++){
        System.out.println(i*i);
    }
    
}
}
 

// //Problem Statement: The Benjamin Bulb Problem
// There are n bulbs in a row, all initially turned off. You make n passes over the bulbs.

// On the first pass, you toggle every bulb (turn it on if it’s off, or off if it’s on).

// On the second pass, you toggle every 2nd bulb (i.e., bulb 2, 4, 6, ...).

// On the third pass, you toggle every 3rd bulb (i.e., bulb 3, 6, 9, ...).

// ...

// On the i-th pass, you toggle every i-th bulb.

// This continues until the n-th pass, where only the n-th bulb is toggled.

// After all the passes, which bulbs remain ON?

// 💡 Key Insight / Observation
// A bulb ends up being toggled once for each of its factors.

// For example:

// Bulb 6 is toggled on passes 1, 2, 3, and 6 (because 1, 2, 3, and 6 divide 6).

// Bulb 9 is toggled on passes 1, 3, and 9.

// Now here's the crucial insight:

// A number has an odd number of total factors only if it's a perfect square.

// Hence, only bulbs at positions that are perfect squares remain ON.

// ✅ Final Answer:
// After all passes, the bulbs that remain ON are those at the positions of perfect squares less than or equal to n.

// So, for a given n, the bulbs that remain ON are:

// text
// Copy
// Edit
// //