class Sort {
    public void selectionSort(int[] x) {
        int min = 0, i, j;
        for (i = 0; i < x.length; i++) {
            min = i;
            for (j = (i + 1); j < x.length; j++) {
                if (x[j] < x[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(min, i, x);
            }
        }
        printNumbers(x);
    }

    private static void  swap(int i, int k, int[] array){
        int temp;
        temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }

    private static void printNumbers(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}

public class selectionSort {
    public static void main(String[] args) {
        int[] num = {2,5,6,7,9,8,3,-7,2,1,0};
        Sort sort = new Sort();
        sort.selectionSort(num); //prints -7 0 1 2 2 3 5 6 7 8 9
    }
}
