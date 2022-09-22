public class Bingbong {
    public static void main(String[] args) {
        int num = 1;

        while(num<=100) {
            if (num % 15 == 0) {
                System.out.printf("bingbong - %s%n", num);
            } else if (num % 3 == 0) {
                System.out.printf("bing - %s%n", num);
            } else if (num % 5 == 0) {
                System.out.printf("bong - %s%n", num);
            } else {
                System.out.println(num);
            }
            num++;
        }
    }
}
