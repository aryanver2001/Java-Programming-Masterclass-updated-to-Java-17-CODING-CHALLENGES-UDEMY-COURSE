public class ReverseArray {
    // write code here
    private static void reverse(int[] array) {
    System.out.print("Array = [");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        if (i < array.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");

    int start = 0;
    int end = array.length - 1;

    while (start < end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;
    }

    System.out.print("Reversed array = [");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        if (i < array.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}

}
