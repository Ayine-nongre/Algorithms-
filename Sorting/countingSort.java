class Sort{
    public static void countingSort(int[] x){
        int maxNum = 1,minNum = 0,diff = 0,count;
        for(int i : x){
            if(i > maxNum) maxNum = i;
            if(i < minNum) minNum = i;
        }

        int range = (maxNum - minNum);
        int[] c = new int[(range+1)];

        if(0 > minNum)
            diff = (- minNum);

        for(int i = 0;i <c.length;i++){
            count = 0;
            for (int k : x) {
                if ((i - diff) == k) {
                    count++;
                }
            }
            c[i] = count;
        }

        int[] d = new int[x.length];
        int e = 0,r = 0;
        do {
            if(c[e] != 0){
                d[r] = (e - diff);
                c[e] = c[e] - 1;
                r++;
            }
            else{
                e++;
            }
        }while(r != x.length);

        printNumbers(d);
    }

    private static void printNumbers(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}

public class countingSort {
    public static void main(String[] args) {
        int[] num = {-3,2,5,6,4,7,9,8,3,2,1};
        Sort sort = new Sort();
        sort.countingSort(num); //prints out -3 1 2 2 3 5 6 7 8 9
    }
}
