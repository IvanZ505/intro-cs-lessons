public class Main {
    public static void bee(String[] args) {
        int num = 1;

        while(num<=100) {
            if (num % 15 == 0) {
                System.out.println(String.format("bingbong - %s", num));
            } else if (num % 3 == 0) {
                System.out.println(String.format("bing - %s", num));
            } else if (num % 5 == 0) {
                System.out.println(String.format("bong - %s", num));
            } else {
                System.out.println(num);
            }
            num++;
        }
    }
}
