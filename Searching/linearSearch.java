class Search{
    public int[] linearSearch(int[] arr,int num){
        int count = 0;
        int[] value = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(num == arr[i]){
                value[count] = (i + 1);
                count++;
            }
        }
        return value;
    }
}

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {2,5,3,6,1,8,4,9,10,50,65,35,86,35,7,4,5,2,3,2,2,7};
        int num = 2;
        Search B = new Search();
        int[] position = B.linearSearch(arr,num);
        for (int i = 0; i < arr.length; i++){
            if (position[i] != 0) System.out.println("The number "+ num +" can be found in index "+ (position[i]-1));
        }
    }
}
