public class functions {
    public static void main(String[] args) {
        for(int x = 0; x<=100; x++) {
            boolean tof = tof(x);
            if(!tof) {
                System.out.println(x);
            } else {
                System.out.println("Boo");
            }
        }
    }

    public static boolean tof(int x) {
        if((x % 5 == 0) || (x % 3 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
