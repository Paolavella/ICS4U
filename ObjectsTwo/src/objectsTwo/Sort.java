
package objectsTwo;

public class Sort {


	// friendly method Insertion Sort for int, String and String arrays.
	public static int insertionSort(int arrayToSort[]){
		return insertionSort(arrayToSort, 0, arrayToSort.length-1);

	}
	public static double insertionSort(double array2Sort[]){
		return insertionSort(array2Sort,0, array2Sort.length-1);
	}
	public static String insertionSort(String array3[]){
		return insertionSort(array3,0, array3.length-1);
	}







	/**private method Insertion Sort 
	 * int array
	 * **/
	private static int insertionSort(int array[], int startIndex, int endIndex){
		int temp;
		int size = array.length;
		for (int i = 1; i< size; i++){
			int j=i;
			temp = array[i];
			while(j>0 && array[j-1]>temp){
				j=j-1;
				array [j] =temp;
			}
		}
		return 0;

	}
	/**private method Insertion Sort 
	 * double array
	 * **/
	private static int insertionSort(double array2[], int startIndex, int endIndex){
		double temp;
		int size = array2.length;
		for (int i = 1; i< size; i++){
			int j=i;
			temp = array2[i];
			while(j>0 && array2[j-1]>temp){
				j=j-1;
				array2[j] =temp;
			}
		}
		return 0;

	}
	/**private method Insertion Sort 
	 * String array
	 * **/
	private static String insertionSort(String arrayString[],int startIndex, int endIndex){
		String temp;
		int size = arrayString.length;
		for (int i = 1; i< size; i++){
			int j=i;
			temp = arrayString[i];
			while(j>0 && arrayString[j-1].compareTo(temp)==1){
				j=j-1;
				arrayString[j] =temp;
			}
		}
		return "yes";

	}

	/**public method Selection Sort 
	 * Int array
	 * **/
	public static int selectionSort(int array[], int startIndex, int endIndex){
		int temp, min;
		int size = array.length;
		for (int i = 0; i< size; i++){
			min = i;
			for(int j=i+1; j<size; j++){
				if (array[j]< array[min]){
					min = j;
				}
			}
			temp = array[min];
			array[min]= array[i];
			array[i] = temp;
		}

		return 0;

	}
	/**public method Selection Sort 
	 * double array
	 * **/
	public static double selectionSort(double array2[], int startIndex, int endIndex){
		double temp;
		int min;
		int size = array2.length;
		for (int i = 0; i< size; i++){
			min = i;
			for(int j=i+1; j<size; j++){
				if (array2[j]< array2[min]){
					min = j;
				}
			}
			temp = array2[min];
			array2[min]= array2[i];
			array2[i] = temp;
		}

		return 0;

	}
	/**public method Selection Sort 
	 * String array
	 * **/
	public static String selectionSort(String arrayString[],int startIndex, int endIndex){
		String temp;
		int min;
		int size = arrayString.length;
		for (int i = 0; i< size; i++){
			min = i;
			for(int j=i+1; j<size; j++){
				if (arrayString[j].compareTo(arrayString[min])==1){
					min = j;
				}
			}
			temp = arrayString[min];
			arrayString[min]= arrayString[i];
			arrayString[i] = temp;
		}

		return "No";

	}
















	/**public method Bubble Sort 
	 * int array
	 * **/
	public static void bubbleSort(int array[]){
		int size = array.length;
		int j=1;
		int i=0;
		while (i<size-1){
			while (j<size-1){
				if (array[i]>array[j]){
					swap(array,i,j);
				}j++;
			}i++;

		}
		System.out.println("The Bubble array is: " );
		for (int g = 0;g<size;g++ )
		{
			System.out.print( array[g]+", ");
		}
	}
	/**public method Bubble Sort 
	 * double array
	 * **/
	public static void bubbleSort(double array[]){
		int size = array.length;
		int j=0;
		int i=j-1;
		while (i<size-1){
			while (j<size-1){
				if (array[i]>array[j]){
					swap(array,i,j);
				}j++;
			}i++;
		}System.out.println("The Bubble array is: " + array);

	}


	/**public method Bubble Sort 
	 *String array
	 * **/
	public static void bubbleSort(String array[]){
		int size = array.length;
		for(int i=-1; i<size-1; i++){
			for (int j=0; i<size-1; j++){
				if (array[i].compareTo(array[j])== 1){
					swap(array,i,j);					
				}
			}
		}System.out.println("The Bubble array is: " + array);

	}





	/**public Merge Sort methods are usually to divide array in to half and take left then go to right 
Then sends them to mage method when they are in the base case
	 * **/
	/**public method Merge Sort 
	 *int array
	 * **/
	public static void mergeSort(int array[]){
		if (array.length == 0){
			return;
		}

		int a = (array.length/2);
		int leftHalf[] = new int [a+1];
		for(int p = 0; p<a; p++){
			leftHalf[p]= array[p];
			mergeSort(leftHalf);}


		int b = array.length-a+1;
		int rightHalf[] = new int [b];
		for(int p = a; p<b; p++){
			rightHalf[p]= array[a+p+1];
			mergeSort(rightHalf);
		}
		merge(leftHalf, rightHalf);

	}





	/**public method Merge Sort 
	 *double array
	 * **/
	/**public method Merge Sort 
	 *String array
	 * **/
	/**private Merge method  
	 *compares numbers and merge them together to sort them
	 * **/

	private static void merge(int array[], int leftA[], int rightA[]) {
		int []finArray= new int[10];int i=0; 
		while(i< array.length){
			for(int j=0; j< i; j++){
				if(leftA[j]<rightA[i]){
					finArray[j]=leftA[i];
					i++;
				}
				else if(leftA[j]>rightA[i]){
					finArray[i]=rightA[j];
				}
			}
		}

	}













	/**public Quicksort method  
	 *provides from the main the int array
	 * **/
	public static void quick(int array[]){
		quickSort(array,0,array.length-1);//calls quick sort: sets the start of the array and the end
		System.out.println("");
		System.out.println("Quick sorted:");
		for(int i=0; i<array.length-1; i++){
			System.out.print(array[i]+",  ");// prints out all the values of the array already in order
		}
	}

	private static void quickSort(int array[], int l, int r){
		if(l == r){//if both begging of the array and ending are the same spot then return
			return;
		}
		int index = partition(array,l,r);// partition 

		if(l<index-1)
			quickSort(array, l, index-1);//do left side of array
		if (index<r)
			quickSort(array,index+1,r);//do right side of array


	}
	private static int partition(int array[], int l, int r){ 
		int pivot = r;//set pivot to our last spot on the array list
		int i = l-1;//i is one less than j
		int j = l;//j starts from the beggining of the array

		while(j<pivot){// while j is less than the pivot
			if(array[j] <= array[pivot]){
				i++;//increase i and swap 
				swap(array, i, j);// swap i and j
			}
			j++;// if greater continue increasing j
		}
		i++;
		swap(array,i,pivot);//swap i with pivot to check until the end of the list

		return i;// i becomes the pivot therefore we return i
	}











	/**public Quicksort method  
	 *provides from the main the double array
	 * **/
	public static void quick(double array[]){
		quickSort(array,0,array.length-1);//calls quick sort: sets the start of the array and the end
		System.out.println("");
		System.out.println("Quick sorted:");
		for(int i=0; i<array.length-1; i++){
			System.out.print(array[i]+", ");// prints out all the values of the array already in order
		}
	}

	private static void quickSort(double array[], int l, int r){
		if(l == r){//if both begging of the array and ending are the same spot then return
			return;
		}
		int index = partition(array,l,r);// partition 

		if(l<index-1)
			quickSort(array, l, index-1);//do left side of array
		if (index<r)
			quickSort(array,index+1,r);//do right side of array


	}
	private static int partition(double array[], int l, int r){ 
		int pivot = r;//set pivot to our last spot on the array list
		int i = l-1;//i is one less than j
		int j = l;//j starts from the beggining of the array

		while(j<pivot){// while j is less than the pivot
			if(array[j] <= array[pivot]){
				i++;//increase i and swap 
				swap(array, i, j);// swap i and j
			}
			j++;// if greater continue increasing j
		}
		i++;
		swap(array,i,pivot);//swap i with pivot to check until the end of the list

		return i;// i becomes the pivot therefore we return i
	}





	/**public Quicksort method  
	 *provides from the main the String array
	 * **/
	public static void quick(String array[]){
		quickSort(array,0,array.length-1);//calls quick sort: sets the start of the array and the end
		System.out.println("");
		System.out.println("Quick sorted:");
		for(int i=0; i<array.length-1; i++){
			System.out.print(array[i]+", ");// prints out all the values of the array already in order
		}
	}

	private static void quickSort(String array[], int l, int r){
		if(l == r){//if both begging of the array and ending are the same spot then return
			return;
		}
		int index = partition(array,l,r);// partition 

		if(l<index-1)
			quickSort(array, l, index-1);//do left side of array
		if (index<r)
			quickSort(array,index+1,r);//do right side of array


	}
	private static int partition(String array[], int l, int r){ 
		int pivot = r;//set pivot to our last spot on the array list
		int i = l-1;//i is one less than j
		int j = l;//j starts from the beggining of the array

		while(j<pivot){// while j is less than the pivot
			if(array[j].compareTo(array[pivot])== -1){
				i++;//increase i and swap 
				swap(array, i, j);// swap i and j
			}
			j++;// if greater continue increasing j
		}
		i++;
		swap(array,i,pivot);//swap i with pivot to check until the end of the list

		return i;// i becomes the pivot therefore we return i
	}

















	/**private swaping methods: int double and string for sorts**/
	private static void swap(int[]array, int i, int j){
		int temp = array [j];//inputing value j into variable
		array[j]= array[i];// inputing value i into spot j
		array[i]=temp;//inputing value j into spot i
	}
	private static void swap(double[]array, int i, int j){
		double temp = array [j];//inputing value j into variable
		array[j]= array[i];// inputing value i into spot j
		array[i]=temp;//inputing value j into spot i
	}
	private static void swap(String[]array, int i, int j){
		String temp = array [j];//inputing value j into variable
		array[j]= array[i];// inputing value i into spot j
		array[i]=temp;//inputing value j into spot i
	}
}



