import java.util.Arrays;
class Sort{
    public int[] mergeSort(int[] arr){
        if(arr.length < 2){
            return arr;
        }
        int middleIndex = (arr.length / 2);
        int[] leftArr = Arrays.copyOfRange(arr,0,middleIndex);
        int[] rightArr = Arrays.copyOfRange(arr,middleIndex,arr.length);
        return merge(mergeSort(leftArr),mergeSort(rightArr));
    }

    private int[] merge(int[] leftArr,int[] rightArr){
        int[] resultArr = new int[leftArr.length + rightArr.length];
        int leftIndex = 0,rightIndex = 0,resultIndex = 0;

        while((leftIndex < leftArr.length) && (rightIndex < rightArr.length)){
            if(leftArr[leftIndex] <= rightArr[rightIndex]){
                resultArr[resultIndex] = leftArr[leftIndex];
                leftIndex++;
            }
            else{
                resultArr[resultIndex] = rightArr[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        while(leftIndex < leftArr.length){
            resultArr[resultIndex] = leftArr[leftIndex];
            leftIndex++;
            resultIndex++;
        }
        while(rightIndex < rightArr.length){
            resultArr[resultIndex] = rightArr[rightIndex];
            rightIndex++;
            resultIndex++;
        }
        return resultArr;
    }
}

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {9,4,73,0,1,35,24,78,90,-3,5,6};
        Sort A = new Sort();
        int[] sortedArray = A.mergeSort(arr);
        for(int i = 0; i < arr.length; i++ ){
            System.out.print(sortedArray[i] + ",");
        }
    }
}
