import java.util.Scanner;

public class LOVELETTER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            char[] arr = s.toCharArray();
            int n = s.length();
            int operationCount = 0;
            for(int i=0;i<n/2;i++){
                if(arr[i] == arr[n-i-1])
                    continue;
                else {
                    if(arr[n-i-1] > arr[i])
                        operationCount += (arr[n-i-1] - arr[i]);
                    else
                        operationCount += (arr[i] - arr[n-i-1]);
                }
            }
            System.out.println(operationCount);
        }
    }
}
