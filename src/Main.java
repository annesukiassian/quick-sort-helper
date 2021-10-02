public class Main {
    public static void main(String[] args) {

        int[] data = {37, 2, 6, 4, 89, 8, 10, 12, 68, 45};

        int[] arr = {50, 61, 0, -8, 23, 7, 11, 80};

        QuickSort quickSort = new QuickSort(data);
        System.out.println("Unsorted array");
        System.out.println(quickSort);
        quickSort.sort();
    }

}
