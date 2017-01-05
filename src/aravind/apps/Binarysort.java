package aravind.apps;

public class Binarysort {
	public static void main(String[] args) {

	    int[] array = new int[5];
	    array[0] = 8;
	    array[1] = 7;
	    array[2] = 5;
	    array[3] = 1;
	    array[4] = 3;

	sort(array, (array.length - 1));

	      for (int x = 0; x < array.length; x++) {
	        System.out.println(" " + array[x]);
	    }
	    System.out.println("");
	    System.out.println("Binary search (R): " + rBsearch(array, 0, (array.length), 20));
	}
	    public static void sort(int[] a, int last) {
	    if (last > 0) {
	        int max = findMax(a, last);
	        swap(a, last, max);
	        sort(a, last - 1);
	    }
	}

	public static int rBsearch(int[] L, int low, int high, int k) {


	    int mid = (low + high) / 2;

	    if (low > high) {
	        return -1;
	    } else if (L[mid] == k) {
	        return mid;
	    } else if (L[mid] < k) {
	        return rBsearch(L, k, mid + 1, high);
	    } else {
	        return rBsearch(L, k, low, mid - 1);
	    }
	 }

	public static int findMax(int[] arr, int last) {

	    int max = 0;
	    for (int i = 0; i <= last; i++) {
	        if (arr[i] > arr[max]) {
	            max = i;
	        }
	    }
	    return max;
	    }

	public static void swap(int[] arr, int last, int max) {
	    int temp = arr[last];
	    arr[last] = arr[max];
	    arr[max] = temp;
	}
}
