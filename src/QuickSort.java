public class QuickSort {

    private int[] data;

    public QuickSort(int[] data) {
        this.data = data;
    }

    public void sort() {
        quickSortHelper(0, data.length - 1);
    }

    private void quickSortHelper(int left, int right) {

        int pivot = left;
        int end = right;
        int swapIndex = -1;

        while (pivot != end) {
            if (pivot < end) {
                if ((swapIndex = findRight(pivot, end)) >= 0) {
                    swap(swapIndex, pivot);
                    end = pivot + 1;
                    pivot = swapIndex;
                    swapIndex = -1;
                } else {
                    break;
                }
            } else {
                if ((swapIndex = findLeft(pivot, end)) >= 0) {
                    swap(swapIndex, pivot);
                    end = pivot - 1;
                    pivot = swapIndex;
                    swapIndex = -1;
                } else {
                    break;
                }
            }
        }

        if (left < pivot - 1) {
            quickSortHelper(left, pivot - 1);
        }
        if (pivot + 1 < right) {
            quickSortHelper(pivot + 1, right);
        }

    }

    private int findLeft(int pivot, int end) {

        int index = -1;

        for (int i = end; i < pivot; i++) {
            if (data[i] > data[pivot]) {
                index = i;
                break;
            }
        }

        return index;
    }

    private int findRight(int pivot, int end) {

        int index = -1;

        for (int i = end; i > pivot; i--) {
            if (data[i] < data[pivot]) {
                index = i;
                break;
            }
        }

        return index;
    }


    private void swap(int first, int second) {
        int temp = data[first];
        data[first] = data[second];
        data[second] = temp;

        System.out.println("Swapped " + data[first] + " with " + data[second]);
        StringBuilder result = getStringBuilder();
        System.out.println(result);
    }


    @Override
    public String toString() {
        StringBuilder result = getStringBuilder();
        return result.toString();
    }

    private StringBuilder getStringBuilder() {
        StringBuilder result = new StringBuilder("[ ");

        for (int i = 0; i < data.length; i++) {
            result.append(data[i]);
            if (i != data.length - 1) {
                result.append(" , ");
            } else {
                result.append(" ]");
            }
        }
        return result;
    }
}
