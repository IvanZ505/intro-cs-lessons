public class inplace_array {
    public static void main(String[] args) {
        int[] array = new int[args.length];

        for(int i = 0; i<args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        for(int i = array.length-1; i>0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        //alternate way\
        /*
        int start = 0;
        int end = args.length -1;
        while(start <= end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
         */
    }
}
