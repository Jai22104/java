public class Factorial {
    public static void main(String[] args) {
        int n =6;
        long fact =1;

        for(int i = 1; i<=n; i++){
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }

    // public static void main(String[] args) {
    //     int n = 5;
    //     long fact = 0;

    //     for(int i = 1; i<=n; i++){
    //         fact += i;
    //     }
    //     System.out.println("Factorial: " + fact);
    // }
    
}
