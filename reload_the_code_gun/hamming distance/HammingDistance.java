/*
You are given two integers M and N,
You need to find the count of bits different in 
their binary representation.

For example:
---------------
M = 4 and N =6
Binary of 4 => 1 0 0
Binary of 6 => 1 1 0
Count of bits different are 1.

Input Format:
-------------
Two integers M and N

Output Format:
--------------
Print an integer, count of bits different


Sample Input-1:
---------------
1 4

Sample Output-1:
----------------
2

Explanation:
------------
1 -> 0 0 1
4 -> 1 0 0 
		d s d

d-> different
s-> same

Now, count of d's is the answer.

==== HINT =====
Step-1: Perform XOR of two integers M and N and store in X
Step:2 Count the number of  1's in binary representation of X.
		   Use Right shift operation to count the 1's.

*/

import java.util.*;

class HammingDistance {
  public int hammingDistance(int x, int y) {
    // return Integer.bitCount(x ^ y); 
		int xor = x ^ y;
		int distance = 0;
		while (xor != 0) {
		  if (xor % 2 == 1)
			distance += 1;
		  xor = xor >> 1;
		}
		return distance;
	}
	
	public static void main (String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		int m = Integer.parseInt(sc.nextLine(),2); 
		int n = Integer.parseInt(sc.nextLine(),2); 
		System.out.println(new HammingDistance().hammingDistance(m,n)); 
	}
}