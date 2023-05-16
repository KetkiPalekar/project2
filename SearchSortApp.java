package SearchingAndSorting;

import java.util.Scanner;

public class SearchSortApp {
	
	public static void display(int arr[],int n) {
		System.out.println("Sorted array is: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void display(String str[],int n) {
		System.out.println("Sorted array is: ");
		for(int i=0;i<n;i++) {
			System.out.print(str[i]+" ");
		}
	}
	

		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int choice,subchoice;
			
			do {
				System.out.println("\n1.Searching \n2.Sorting \n3.Stop \nEnter your Choice:");
				choice=sc.nextInt();sc.nextLine(); 
				int sortType,noOfElements;
				String searchChoice;
				
				switch(choice) {
				
				 //Code to handle searching algorithms
				 case 1: System.out.println("You want to perform searching on \n1)Array of integers \n2)Array of String");
						 subchoice=sc.nextInt();
					 	 Searching search=new Searching();
					 	 int numToBeSearched,foundAt = 0;
					 	 
					 	switch(subchoice) {
					 	 
				 	 	//this case handles array of integers for sorting
						 case 1:
							 	System.out.println("Do you want to perform searching on sorted array?(Y/N)");
							 	searchChoice=sc.next();
							 	System.out.println("Enter the no. of array elements you want:");
							 	noOfElements=sc.nextInt();
							 	int arr1[]=new int[noOfElements];
							 	
							 	
							 	switch(searchChoice) {
							 		case "N":System.out.println("Enter sorted array of integers");			 	
										 	System.out.println("Enter "+noOfElements+" integers");
										 	for(int i=0;i<noOfElements;i++) {
										 		arr1[i]=sc.nextInt();
										 	}
								 			System.out.println("\n1. Linear search\n2.Jump Search\n");
							 				 sortType=sc.nextInt(); 
							 				System.out.println("Enter number to be searched");	
							 				numToBeSearched=sc.nextInt();
							 				
							 				switch(sortType) {
									 		
								 			case 1:foundAt=search.linearSearch(arr1, numToBeSearched);
								 					break;
								 					
								 			case 2:foundAt=search.jumpSearch(arr1, noOfElements);
								 					break;
								 					
							 				default: break;
							 				}
							 				if (foundAt!=-1) {
							 					System.out.println("Element found at index"+foundAt);
							 				}
							 				else {
							 					System.out.println("Element not found!");
							 				}
							 				break;
							 				
							 		case "Y":System.out.println("Enter array of integers");			 	
											 	System.out.println("Enter "+noOfElements+" integers");
											 	for(int i=0;i<noOfElements;i++) {
											 		arr1[i]=sc.nextInt();
											 	}
											 	System.out.println("\n1.Binary Search\n2.Fibonacci Search\n3.Exponential Search\n");
											 	sortType=sc.nextInt(); 
											 	System.out.println("Enter number to be searched");	
								 				numToBeSearched=sc.nextInt();
								 				switch(sortType) {
										 		
									 			case 1:foundAt=search.binarySearch(arr1, numToBeSearched);
									 					break;
									 					
									 			case 2:foundAt=search.fibSearch(arr1, numToBeSearched);
									 					break;
									 					
									 			case 3:foundAt=search.exponentialSearch(arr1, numToBeSearched);
							 							break;
									 					
								 				default: break;
								 				}
								 				if (foundAt!=-1) {
								 					System.out.println("Element found at index"+foundAt);
								 				}
								 				else {
								 					System.out.println("Element not found!");
								 				}
							 				break;
							 				
							 		default : break;
							 	}
							 	
					 		 break;
					 		 
					 		 
					 		//this case handles array of strings for sorting	 
						 case 2:System.out.println("Enter the no. of strings you want to sort:");
						 		noOfElements=sc.nextInt();
						 		String strToBeSearched;
						 		String str1[]=new String[noOfElements];
							 	
						 		System.out.println("Do you want to perform searching on sorted array?(Y/N)");
							 	searchChoice=sc.next();
							 	System.out.println("Enter the no. of array elements you want:");
							 	noOfElements=sc.nextInt();
							 	
							 	
							 	switch(searchChoice) {
							 		case "N":System.out.println("Enter sorted array of strings");			 	
										 	System.out.println("Enter "+noOfElements+" strings");
										 	for(int i=0;i<noOfElements;i++) {
										 		str1[i]=sc.next();
										 	}
								 			System.out.println("\n1. Linear search\n2.Jump Search\n");
							 				 sortType=sc.nextInt(); 
							 				System.out.println("Enter string to be searched");	
							 				strToBeSearched=sc.next();
							 				
							 				switch(sortType) {
									 		
								 			case 1:foundAt=search.linearSearch(str1, strToBeSearched);
								 					break;
								 					
								 			case 2:foundAt=search.jumpSearch(str1, strToBeSearched);
								 					break;
								 					
							 				default: break;
							 				}
							 				if (foundAt!=-1) {
							 					System.out.println("Element found at index"+foundAt);
							 				}
							 				else {
							 					System.out.println("Element not found!");
							 				}
							 				break;
							 				
							 		case "Y":System.out.println("Enter array of strings");			 	
											 	System.out.println("Enter "+noOfElements+" strings");
											 	for(int i=0;i<noOfElements;i++) {
											 		str1[i]=sc.next();
											 	}
											 	System.out.println("\n1.Binary Search\n2.Fibonacci Search\n3.Exponential Search\n");
											 	sortType=sc.nextInt(); 
											 	System.out.println("Enter string to be searched");	
											 	strToBeSearched=sc.next();
								 				switch(sortType) {
										 		
									 			case 1:foundAt=search.binarySearch(str1, strToBeSearched);
									 					break;
									 					
									 			case 2:foundAt=search.fibSearch(str1, strToBeSearched);
									 					break;
									 					
									 			case 3:foundAt=search.exponentialSearch(str1, strToBeSearched);
							 							break;
									 					
								 				default: break;
								 				}
								 				if (foundAt!=-1) {
								 					System.out.println("Element found at index"+foundAt);
								 				}
								 				else {
								 					System.out.println("Element not found!");
								 				}
							 				break;
							 				
							 		default : break;
							 	}
						 		
						 		
							 	
							 break;
				 		  	 
						 default: break;
					 }
						 

				 		break;
				 		
				 		
				 		
				 //Code to handle sorting algorithms		
				 case 2:
					 System.out.println("You want to perform sorting on \n1)Array of integers\n2)String");
					 subchoice=sc.nextInt();
				 	 Sorting sort=new Sorting();
					 
					 
					 
				 	 switch(subchoice) {
				 	 
				 	 	//this case handles array of integers for sorting
						 case 1:
							 	System.out.println("Enter the no. of array elements you want:");
							 	noOfElements=sc.nextInt();
							 	int arr[]=new int[noOfElements];
							 	
							 	System.out.println("Enter "+noOfElements+" integers");
							 	for(int i=0;i<noOfElements;i++) {
							 		arr[i]=sc.nextInt();
							 	}
							 	
							 	System.out.println("1.Bubble Sort\n2.Insertion Sort\n3.Selection Sort\n4.Merge Sort\n5.Quick Sort"
							 			+ "\n6.Bucket Sort\n7.Radix Sort");
						 		sortType=sc.nextInt();
						 		
						 		switch(sortType) {
						 		
						 			case 1:sort.bubble(arr, noOfElements);
						 					SearchSortApp.display(arr, noOfElements);
						 					break;
						 					
						 			case 2:sort.selection(arr, noOfElements);
						 					SearchSortApp.display(arr, noOfElements);
						 					break;
						 					
						 			case 3: sort.insertionSort(arr, noOfElements);
						 					SearchSortApp.display(arr, noOfElements);
						 					break;
						 					
						 			case 4: sort.mergeSort(arr, 0, noOfElements-1);
						 					SearchSortApp.display(arr, noOfElements);
						 					break;
				 					
						 			case 5: sort.quickSort(arr, 0, noOfElements-1);
						 					SearchSortApp.display(arr, noOfElements);
						 					break;
						 					
						 			case 6: int numOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
						 					Sorting.bucketSort(arr, numOfBuckets);
						 					SearchSortApp.display(arr, noOfElements);
				 							break;
				 					
						 			case 7: Sorting.radixSort(arr);
						 			SearchSortApp.display(arr, noOfElements);
				 							break;
				 					
						 			default: break;
						 		}
					 		 break;
					 		 
					 		 
					 		//this case handles array of strings for sorting	 
						 case 2:System.out.println("Enter the no. of strings you want to sort:");
						 		noOfElements=sc.nextInt();
						 		String str[]=new String[noOfElements];
							 	
							 	System.out.println("Enter "+noOfElements+" string");
							 	for(int i=0;i<noOfElements;i++) {
							 		str[i]=sc.next();
							 	}
							 	
							 	
							 	System.out.println("1.Bubble Sort\n2.Insertion Sort\n3.Selection Sort\n4.Merge Sort\n5.Quick Sort"
							 			+ "\n6.Bucket Sort\n7.Radix Sort");
						 		sortType=sc.nextInt();
						 		
						 		switch(sortType) {
						 		
						 			case 1:sort.bubble(str, noOfElements);
						 					SearchSortApp.display(str, noOfElements);
						 					break;
						 					
						 			case 2:sort.selection(str, noOfElements);
						 					SearchSortApp.display(str, noOfElements);
						 					break;
						 					
						 			case 3: sort.insertionSort(str, noOfElements);
						 					SearchSortApp.display(str, noOfElements);
						 					break;
						 					
						 			case 4: sort.mergeSort(str, 0, noOfElements-1);
						 					SearchSortApp.display(str, noOfElements);
						 					break;
				 					
						 			case 5: Sorting.quickSort(str, 0, noOfElements-1);
						 					SearchSortApp.display(str, noOfElements);
						 					break;
						 					
						 			case 6: int numOfBuckets = (int) Math.ceil(Math.sqrt(str.length));
				 							Sorting.bucketSort(str, numOfBuckets);
				 							SearchSortApp.display(str, noOfElements);
				 							break;
				 					
						 			case 7: Sorting.radixSort(str);
						 					SearchSortApp.display(str, noOfElements);
				 							break;
				 					
						 			default: break;
						 		}
							 	
							 break;
				 		  	 
						 default: break;
					 }
				     
				 	 break;
				     
				     
				         
				 default: break;

		        }

	           }while(choice!=3);

		

	}


}
