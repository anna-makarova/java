package lab4;

public class ltask8 {
    public static class Main {
        public static int m() {
            try {
                System.out.println("0");
                throw new RuntimeException();
            }
            catch (RuntimeException e) {
                System.out.println("Добавлена обработка исключения");
                return 2;
            }
            finally {
                System.out.println("1");
            }
        }
        public static void main(String[] args) {
            System.out.println(m());
        }
    }
}
