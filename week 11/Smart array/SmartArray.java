public class SmartArray {

    private int[] array;
    private int n;

    //default array here
//    public SmartArray() {
//        array = new int[10];
//    }

    // custom array
    public SmartArray(int capacity) {
        array = new int[capacity];
    }

    // Best cases and worst cases
    // Best case: There is space and there will only be 3 operations
    // Worst case: There is no space and it will run the for loop.
    // For a array of size n => n operations of the basic operatiaon
    // n operations
    // f(n) = n + 2 => O(n) ---> Big O
    public void add(int item) {
        if(n >= array.length) {
            int[] newarray = new int[n*2];
            System.arraycopy(array, 0, newarray, 0, array.length);
            array = newarray;

        }
        array[n] = item;
        n++;
    }

    // The big O for this will STILL be O(n), which is a linear operation.
    public void delete(int item) {
        for(int i = 0; i < n; i++) {
            if(item == array[i]) {
                array[i] = 0;
                int j = i;
                while(j < n-1) {
                    array[j] = array[j+1];
                    j++;
                }
                n--;
                return;
            }

        }
    }

    public void printSmartArray() {
        for(int i : array) {
            StdOut.print(i + " ");
        }
        StdOut.println();
    }

    public static void main(String[] args) {
        SmartArray array1 = new SmartArray(5);
        array1.add(5);
        array1.add(12);
        array1.add(1);
        array1.add(4);
        array1.add(250);
        array1.printSmartArray();
        array1.delete(4);
        array1.printSmartArray();
    }
}
