package SearchingAndSorting;

public class Searching {
		
	
	//Linear search
	//Linear search for array of integers
	public static int linearSearch(int[] arr, int searchElement) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == searchElement) {
	            return i;
	        }
	    }
	    return -1;
	}
	
	//Linear search for array of integers
	public static int linearSearch(String[] arr, String searchElement) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i].equals(searchElement)) {
	            return i;
	        }
	    }
	    return -1;
	}
	
	

	//binary search
	//binary search for integer array
	public static int binarySearch(int[] arr, int searchElement) {
	    int left = 0;
	    int right = arr.length - 1;
	    while (left <= right) {
	        int mid = (left + right) / 2;
	        if (arr[mid] == searchElement) {
	            return mid;
	        } else if (arr[mid] < searchElement) {
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }
	    return -1;
	}

	//binary search for integer array
	public static int binarySearch(String[] arr, String searchElement) {
	    int left = 0;
	    int right = arr.length - 1;
	    while (left <= right) {
	        int mid = (left + right) / 2;
	        int cmp = searchElement.compareTo(arr[mid]);
	        if (cmp == 0) {
	            return mid;
	        } else if (cmp < 0) {
	            right = mid - 1;
	        } else {
	            left = mid + 1;
	        }
	    }
	    return -1;
	}

	
	
	
	//Fibonacci search
	private static final int[] FIBONACCI_SEQUENCE = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
	//for int array
	public static int fibSearch(int[] arr, int key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid = 0;
        int fib = 0;

        while (FIBONACCI_SEQUENCE[fib] <= n) {
            fib++;
        }

        fib--;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - FIBONACCI_SEQUENCE[fib - 2];
            } else {
                low = mid + FIBONACCI_SEQUENCE[fib - 1];
            }
        }

        return -1;
    }
    
    
    //for string array
    public static int fibSearch(String[] arr, String key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid = 0;
        int fib = 0;

        while (FIBONACCI_SEQUENCE[fib] <= n) {
            fib++;
        }

        fib--;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid].equals(key)) {
                return mid;
            } else if (key.compareTo(arr[mid]) < 0) {
                high = mid - FIBONACCI_SEQUENCE[fib - 2];
            } else {
                low = mid + FIBONACCI_SEQUENCE[fib - 1];
            }
        }

        return -1;
    }

	
    
    
	//Jump Search
	//for int array
    public static int jumpSearch(int[] arr, int key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int block = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (low <= high) {
            while (arr[Math.min(high, prev + block) - 1] < key) {
                prev += block;
                if (prev > high) {
                    return -1;
                }
            }

            if (arr[prev] == key) {
                return prev;
            }

            low = prev + 1;
        }

        return -1;
    }
	
	//for string array
	public static int jumpSearch(String[] arr, String key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int block = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (low <= high) {
            while (arr[Math.min(high, prev + block) - 1].compareTo(key) < 0) {
                prev += block;
                if (prev > high) {
                    return -1;
                }
            }

            if (arr[prev].compareTo(key) == 0) {
                return prev;
            }

            low = prev + 1;
        }

        return -1;
    }
	
	
	
	
	
	
	
	//exponential search
	//for int array
	public static int exponentialSearch(int[] arr, int key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int i = 1;

        while (arr[i] <= key) {
            i *= 2;
            if (i > n) {
                break;
            }
        }

        i /= 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
	
	
	
	//for sring array
	public static int exponentialSearch(String[] arr, String key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int i = 1;

        while (arr[i].compareTo(key) <= 0) {
            i *= 2;
            if (i > n) {
                break;
            }
        }

        i /= 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid].equals(key)) {
                return mid;
            } else if (key.compareTo(arr[mid]) < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
	
}
