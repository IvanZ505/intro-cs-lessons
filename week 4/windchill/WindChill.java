public class WindChill {

    public static void main(String[] args) {
        double temp;
        double wind_speed;

        temp = Double.parseDouble(args[0]);
        wind_speed = Double.parseDouble(args[1]);
        if(temp > 50 || wind_speed > 120 || wind_speed < 3) {
            System.out.println("Error");
        } else {
            double chill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wind_speed, 0.16);

            System.out.println(chill);
        }
    }

}
