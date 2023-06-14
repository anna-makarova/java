package lab3;

public class example4 {
        public static void main(String[] args) {
                System.out.printf("Ваше число: %s", fact(10));
        }

        public static int fact(int n) {
                int result;
                if(n==1) return 1;
                else {
                        result = fact(n - 1) * n;
                        return result;
                }
        }
}
