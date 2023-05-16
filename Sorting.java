package SearchingAndSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
	
		//Bubble sort
		public void bubble(int arr[], int n) {
			int i,j,t,flag=0;
			for(i=0;i<n;i++) {
				flag=0;
				for(j=0;j<n-1-i;j++) {
					if(arr[j]>arr[j+1]) {
						flag=1;
						t=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=t;
					}
				}
				if(flag==0)
					break;
			}
		}
		
		public void bubble(String str[], int n) {
		    for (int i = 0; i < n - 1; i++) {
		        for (int j = 0; j < n - i - 1; j++) {
		            // Compare adjacent elements and swap if they are in the wrong order
		            if (str[j].compareTo(str[j+1]) > 0) {
		                String temp = str[j];
		                str[j] = str[j+1];
		                str[j+1] = temp;
		            }
		        }
		    }
		}
	
		
		
		
		
	
		//Insertion sort
		public void insertionSort(int arr[],int n) {
			int i,j,k;
			for(i=1;i<n;i++) {
				k=arr[i];
				for(j=i-1;j>=0 && arr[j]>k;j--) 
					arr[j+1]=arr[j];
				arr[j+1]=k;
			}
		}
		
		public void insertionSort(String arr[], int n) {
			 for (int i = 1; i < n; ++i) {
			      String key = arr[i];
			      int j = i - 1;

			      while (j >= 0 && arr[j].compareTo(key) > 0) {
			        arr[j + 1] = arr[j];
			        j = j - 1;
			      }
			      arr[j + 1] = key;
			    }
		}
		
		
		
		
		
		//bucket sort
		//bucket sort for integer array
		public static void bucketSort(int[] arr, int numOfBuckets) {
		// Create buckets
	    List<Integer>[] buckets = new List[numOfBuckets];
	    for (int i = 0; i < numOfBuckets; i++) {
	      buckets[i] = new ArrayList<Integer>();
	    }
	    
	    // Add elements to buckets
	    for (int i = 0; i < arr.length; i++) {
	      int bucketIndex = (numOfBuckets * arr[i]) / (getMaxValue(arr) + 1);
	      buckets[bucketIndex].add(arr[i]);
	    }
	    
	    // Sort individual buckets
	    for (int i = 0; i < numOfBuckets; i++) {
	      Collections.sort(buckets[i]);
	    }
	    
	    // Merge the sorted buckets into the original array
	    int index = 0;
	    for (int i = 0; i < numOfBuckets; i++) {
	      for (int j = 0; j < buckets[i].size(); j++) {
	        arr[index++] = buckets[i].get(j);
	      }
	    }
	    
		}
	    public static int getMaxValue(int[] arr) {
	        int maxValue = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	          if (arr[i] > maxValue) {
	            maxValue = arr[i];
	          }
	        }
	        return maxValue;
	      }
	    
	    
	    //bucket sort for string array
	    public static void bucketSort(String[] arr, int numOfBuckets) {
	        // Create buckets
	        List<String>[] buckets = new List[numOfBuckets];
	        for (int i = 0; i < numOfBuckets; i++) {
	          buckets[i] = new ArrayList<String>();
	        }
	        
	        // Add elements to buckets
	        for (int i = 0; i < arr.length; i++) {
	          int bucketIndex = (numOfBuckets * (int)arr[i].charAt(0)) / ('z' + 1);
	          buckets[bucketIndex].add(arr[i]);
	        }
	        
	        // Sort individual buckets
	        for (int i = 0; i < numOfBuckets; i++) {
	          Collections.sort(buckets[i]);
	        }
	        
	        // Merge the sorted buckets into the original array
	        int index = 0;
	        for (int i = 0; i < numOfBuckets; i++) {
	          for (int j = 0; j < buckets[i].size(); j++) {
	            arr[index++] = buckets[i].get(j);
	          }
	        }
	    }
		
	    
	    
	    
	    
	    
		//Merge sort
		//merge sort for integer array
		public void merge(int arr[],int tar[],int low1,int high1,int low2,int high2) {
			int i=low1,j=low2,k=low1;
			
			while(i<=high1 && j<=high2) {
				if(arr[i]<arr[j]) {
					tar[k]=arr[i];
					k++;i++;
				}
				else if(arr[i]>arr[j]) {
					tar[k]=arr[j];
					k++;j++;
				}
				else {
					tar[k]=arr[i];
					i++;j++;k++;
				}
			}
			
			while(i<=high1) {
				tar[k]=arr[i];
				k++;i++;
			}
			
			while(j<=high2) {
				tar[k]=arr[j];
				k++;j++;
			}
			
		}
		
		
		public void mergeSort(int arr[],int low,int high) {
			int mid;
			int temp[]=new int[arr.length];
			
			if(low<high) {
				mid=(low+high)/2;
				mergeSort(arr,low,mid);
				mergeSort(arr,mid+1,high);
				
				merge(arr,temp,low,mid,mid+1,high);
				copy(arr,temp,low,high);
			}
		}
		
		public void copy(int arr[],int temp[],int low,int high) {
			int i;
			System.out.println(" ");
			for(i=low;i<=high;i++) {
				arr[i]=temp[i];
			}
		}

		
		//Merge sort for string array
		public static void mergeSort(String[] arr, int left, int right) {
		    if (left < right) {
		      int mid = (left + right) / 2;
		      mergeSort(arr, left, mid);
		      mergeSort(arr, mid + 1, right);
		      merge(arr, left, mid, right);
		    }
		  }

		  public static void merge(String[] arr, int left, int mid, int right) {
		    int n1 = mid - left + 1;
		    int n2 = right - mid;

		    String[] L = new String[n1];
		    String[] R = new String[n2];

		    for (int i = 0; i < n1; ++i) {
		      L[i] = arr[left + i];
		    }
		    for (int j = 0; j < n2; ++j) {
		      R[j] = arr[mid + 1 + j];
		    }

		    int i = 0, j = 0;
		    int k = left;
		    while (i < n1 && j < n2) {
		      if (L[i].compareTo(R[j]) <= 0) {
		        arr[k] = L[i];
		        i++;
		      } else {
		        arr[k] = R[j];
		        j++;
		      }
		      k++;
		    }

		    while (i < n1) {
		      arr[k] = L[i];
		      i++;
		      k++;
		    }

		    while (j < n2) {
		      arr[k] = R[j];
		      j++;
		      k++;
		    }
		  }
		  
		  
		  
		  
		  //selection sort
		  public void selection(int arr[],int n) {
				int i,j,t,min=0;
				for(i=0;i<n;i++) {
					min=i;
					for(j=i+1;j<n;j++) {
						if(arr[min]>arr[j]) {
							min=j;
						}
					}
					if(i!=min) {
						t=arr[i];
						arr[i]=arr[min];
						arr[min]=t;
					}
				}
			}
			
			public void selection(String arr[], int n) {
				for (int i = 0; i < n - 1; i++) {
				      int min_idx = i;
				      for (int j = i + 1; j < n; j++) {
				        if (arr[j].compareTo(arr[min_idx]) < 0) {
				          min_idx = j;
				        }
				      }
				      String temp = arr[min_idx];
				      arr[min_idx] = arr[i];
				      arr[i] = temp;
				    }
			}
		  
		  
		  
		  
	
		//Radix sort
		//Radix sort for integer array
		  public static void radixSort(int[] arr) {
		    int maxNumber = getMaxNumber(arr);
		    for (int exp = 1; maxNumber / exp > 0; exp *= 10) {
		      countingSort(arr, exp);
		    }
		  }

		  public static int getMaxNumber(int[] arr) {
		    int maxNumber = arr[0];
		    for (int i = 1; i < arr.length; i++) {
		      if (arr[i] > maxNumber) {
		        maxNumber = arr[i];
		      }
		    }
		    return maxNumber;
		  }

		  public static void countingSort(int[] arr, int exp) {
		    int[] count = new int[10];
		    int[] output = new int[arr.length];

		    for (int i = 0; i < arr.length; i++) {
		      int digit = (arr[i] / exp) % 10;
		      count[digit]++;
		    }

		    for (int i = 1; i < count.length; i++) {
		      count[i] += count[i - 1];
		    }

		    for (int i = arr.length - 1; i >= 0; i--) {
		      int digit = (arr[i] / exp) % 10;
		      output[count[digit] - 1] = arr[i];
		      count[digit]--;
		    }

		    for (int i = 0; i < arr.length; i++) {
		      arr[i] = output[i];
		    }
		  }

		  


		//Radix sort for string array
		  public static void radixSort(String[] arr) {
		    int maxLength = getMaxStringLength(arr);
		    for (int i = maxLength - 1; i >= 0; i--) {
		      countingSort(arr, i);
		    }
		  }

		  public static int getMaxStringLength(String[] arr) {
		    int maxLength = 0;
		    for (String s : arr) {
		      if (s.length() > maxLength) {
		        maxLength = s.length();
		      }
		    }
		    return maxLength;
		  }

		  public static void countingSort(String[] arr, int index) {
		    int[] count = new int[256];
		    String[] output = new String[arr.length];

		    for (int i = 0; i < arr.length; i++) {
		      int charIndex = index < arr[i].length() ? arr[i].charAt(index) + 1 : 0;
		      count[charIndex]++;
		    }

		    for (int i = 1; i < count.length; i++) {
		      count[i] += count[i - 1];
		    }

		    for (int i = arr.length - 1; i >= 0; i--) {
		      int charIndex = index < arr[i].length() ? arr[i].charAt(index) + 1 : 0;
		      output[count[charIndex] - 1] = arr[i];
		      count[charIndex]--;
		    }

		    for (int i = 0; i < arr.length; i++) {
		      arr[i] = output[i];
		    }
		  }
		  
		//Quick sort code for integer array
			public void quickSort(int arr[],int low ,int high) {
				int pivloc;
				if(low>=high) return;
				pivloc=partition(arr,low,high);
				quickSort(arr,low,pivloc-1);
				quickSort(arr,pivloc+1,high);
			}
			
			public int partition(int arr[],int low,int high) {
				int pivot=arr[low];
				int left=low,right=high,t;
				
				while(left<=right ) {
					while(arr[left]<=pivot && left<high) 
						left++;
					while(arr[right]>pivot)
						right--;
					if(left<right) {
						t=arr[left];
						arr[left]=arr[right];
						arr[right]=t;
						left++;right--;
					}
					else left++;
				}
				arr[low]=arr[right];
				arr[right]=pivot;
				return right;
			}
			
			
			//quick sort
			//quick sort for string array
			public static void quickSort(String[] arr, int low, int high) {
			    if (low < high) {
			      int pi = partition(arr, low, high);
			      quickSort(arr, low, pi - 1);
			      quickSort(arr, pi + 1, high);
			    }
			  }

			  public static int partition(String[] arr, int low, int high) {
			    String pivot = arr[high];
			    int i = low - 1;
			    for (int j = low; j < high; j++) {
			      if (arr[j].compareTo(pivot) < 0) {
			        i++;
			        String temp = arr[i];
			        arr[i] = arr[j];
			        arr[j] = temp;
			      }
			    }
			    String temp = arr[i + 1];
			    arr[i + 1] = arr[high];
			    arr[high] = temp;
			    return i + 1;
			  }

}
