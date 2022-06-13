class Sort{
    public void bubbleSort(int[] x){
        for(int i = (x.length-1); i >= 0; i--){
            for(int j = 0; j < (x.length-1); j++){
                int k = j+1;
                if (x[j] > x[k]) {
                   swap(j,k,x);
                }
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

public class bubbleSort{
    public static void main(String[] args) {
        int[] num = {-3,2,5,6,-9,7,9,8,3,2,1,0};
        Sort sort = new Sort();
        sort.bubbleSort(num);
    }
}
