class Search{
    public int binarySearch(int[] x,int y,int low,int high) {
        int mid;
        if (low > high) return -1;
        mid = (low + high) / 2;
        if (y == x[mid]) return mid;
        else if (y > x[mid]) return binarySearch(x, y, (mid + 1), high);
        else return binarySearch(x, y, low, (mid - 1));
    }
}

public class binarySearch {
    public static void main(String[] args) {
        int[] num = {-9,-3,0,1,2,2,3,5,6,7,8,9};
        Search finder = new Search();
        int numPosition = finder.binarySearch(num,5,0,num.length);
        System.out.println("The number you're searching for is in index " + numPosition); //prints out "The number you're searching for is in index 7"
    }
}
