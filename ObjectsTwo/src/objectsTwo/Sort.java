package objectsTwo;

public class Sort {



	// friendly method Insertion Sort for int, String and String arrays.
	public static void insertionSort(int arrayToSort[]){
		insertionSort(arrayToSort, 0, arrayToSort.length-1);
		System.out.println("");
		System.out.println("Insertion sorted: " );
		for (int g = 0;g<arrayToSort.length;g++ )
		{
			System.out.print( arrayToSort[g]+", ");
		}
	}
	public static void insertionSort(double array2Sort[]){
		insertionSort(array2Sort,0, array2Sort.length-1);
		System.out.println("");
		System.out.println("Insertion sorted: " );
		for (int g = 0;g<array2Sort.length;g++ )
		{
			System.out.print( array2Sort[g]+", ");
		}
	}
	public static void insertionSort(String array3[]){
		insertionSort(array3,0, array3.length-1);
		System.out.println("");
		System.out.println("Insertion sorted: " );
		for (int g = 0;g<array3.length;g++ )
		{
			System.out.print( array3[g]+", ");
		}
	}
	/**private method Insertion Sort 
	 * int array
	 * **/
	private static void insertionSort(int array[], int startIndex, int endIndex){
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
	}
	/**private method Insertion Sort 
	 * double array
	 * **/
	private static void insertionSort(double array2[], int startIndex, int endIndex){
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
	}
	/**private method Insertion Sort 
	 * String array
	 * **/
	private static void insertionSort(String arrayString[],int startIndex, int endIndex){
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
	}




	// friendly method Selection Sort for int, String and String arrays.
	public static void selectionSort(int arrayToSort[]){
		selectionSort(arrayToSort, 0, arrayToSort.length-1);
		System.out.println("");
		System.out.println("Selection sorted: " );
		for (int g = 0;g<arrayToSort.length;g++ )
		{
			System.out.print( arrayToSort[g]+", ");
		}
	}
	public static void selectionSort(double array2Sort[]){
		selectionSort(array2Sort,0, array2Sort.length-1);
		System.out.println("");
		System.out.println("Selection sorted: " );
		for (int g = 0;g<array2Sort.length;g++ )
		{
			System.out.print( array2Sort[g]+", ");
		}
	}
	public static void selectionSort(String array3[]){
		selectionSort(array3,0, array3.length-1);
		System.out.println("");
		System.out.println("Selection sorted: " );
		for (int g = 0;g<array3.length;g++ )
		{
			System.out.print( array3[g]+", ");
		}
	}
	/**public method Selection Sort 
	 * Int array
	 * **/
	static void selectionSort(int array[], int startIndex, int endIndex){
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

	}
	/**public method Selection Sort 
	 * double array
	 * **/
	private static void selectionSort(double array2[], int startIndex, int endIndex){
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
	}
	/**public method Selection Sort 
	 * String array
	 * **/
	public static void selectionSort(String arrayString[],int startIndex, int endIndex){
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
		System.out.println("");
		System.out.println("Bubble sorted: " );
		for (int g = 0;g<size;g++ )
		{
			System.out.print( array[g]+", ");
		}
	}
	/**public method Bubble Sort 
	 * double array
	 * **/
	public static double[] bubbleSort(double  [ ]a )
	{
		int j;



		for(int c = 0; c < a.length - 1; c++)
		{
			// keeps looping until end is true

			for( j=0;  j < a.length -1;  j++ )
			{
				// creates a loop for index's of array a
				int i= j+1;

				if ( a[ j ] > a[i] )  
				{

					swap(a, i, j);

					//while the value of a at index j is greater then the value of a at index i 
					//the values of a at index i and a at index j swap.

				} 
			} 
		}
		return a;
		// returns the sorted array a.
	} 
/**public method Bubble Sort 
	 *String array
	 * **/
	public static String[] bubbleSort( String [ ]a )
	{
		int j;



		for(int c = 0; c < a.length - 1; c++)
		{
			// keeps looping until end is true

			for( j=0;  j < a.length -1;  j++ )
			{
				// creates a loop for index's of array a
				int i= j+1;

				if ( a[ j ].compareTo( a[i])>0)  
				{

					swap(a, i, j);

					//while the value of a at index j is greater then the value of a at index i 
					//the values of a at index i and a at index j swap.

				} 
			} 
		}
		return a;
		// returns the sorted array a.
	} 
//	public static void bubbleSort(double array[]){
//		int size = array.length;
//		int j=0;
//		int i=j-1;
//		while (i<size-1){
//			while (j<size-1){
//				if (array[i]>array[j]){
//					swap(array,i,j);
//				}j++;
//			}i++;
//		}
//		System.out.println("");
//		System.out.println("Bubble sorted: " );
//		for (int g = 0;g<size;g++ )
//		{
//			System.out.print( array[g]+", ");
//		}
//
//	}


	
//	public static void bubbleSort(String array[]){
//		int size = array.length;
//		for(int i=-1; i<size-1; i++){
//			for (int j=0; i<size-1; j++){
//				if (array[i].compareTo(array[j])== 1){
//					swap(array,i,j); 
//				}
//			}
//		}
//		System.out.println("");
//		System.out.println("Bubble sorted: " );
//		for (int g = 0;g<size;g++ )
//		{
//			System.out.print( array[g]+", ");
//		}
//
//	}





	/**public Merge Sort methods are usually to divide array in to half and take left then go to right 
Then sends them to mage method when they are in the base case
	 * **/
	/**public method Merge Sort 
	 *int array
	 * **/

	private static void doMerge(int[] numbers, int left, int mid, int right){

		int[] array= new int[numbers.length];
		int i;
		int left_end; 
		int num_elements; 
		int tmp_pos;

		left_end= mid-1;
		tmp_pos=left;
		num_elements = (right-left+1);

		while (left <=left_end &&(mid<= right)){

			if (numbers[left]<=numbers[mid]){
				array[tmp_pos++]=numbers[left++];
			}
			else{
				array[tmp_pos++]=numbers[mid++];
			}
			while (mid<= left_end)
				array[tmp_pos++] = numbers[mid++];

			for (i=0; i< num_elements; i ++){
				numbers[right] = array[right];
				right--;
			}
		}
	}


	private static void mergeRecursive(int [] numbers, int left, int right)
	{
		int mid;

		if (right>left){
			mid = (left + right)/2;
			mergeRecursive(numbers, left, mid);
			mergeRecursive (numbers, (mid+1), right);
			doMerge(numbers, left, (mid+1), right);
		}
	}


	/**Public frienly MergeSort method
	 * int array
	 * **/
	public static void mergeSort(int [] arrayToSort)
	{
		System.out.println("");
		System.out.println("MergeSort By Recursive Method");

		mergeRecursive(arrayToSort, 0, arrayToSort.length - 1);
		for (int i = 0; i < 9; i++)
			System.out.print(arrayToSort[i]+", ");

	}

	/**public Merge Sort methods are usually to divide array in to half and take left then go to right 
Then sends them to mage method when they are in the base case
	 * **/
	/**public method Merge Sort 
	 *double array
	 * **/

	private static void doMerge(double []numbers, int left, int mid, int right){

		double[] array= new double[numbers.length];
		double i;
		double left_end; 
		double num_elements; 
		int tmp_pos;

		left_end= mid-1;
		tmp_pos=left;
		num_elements = (right-left+1);

		while (left <=left_end &&(mid<= right)){

			if (numbers[left]<=numbers[mid]){
				array[tmp_pos++]=numbers[left++];
			}
			else{
				array[tmp_pos++]=numbers[mid++];
			}
			while (mid<= left_end)
				array[tmp_pos++] = numbers[mid++];

			for (i=0; i< num_elements; i ++){
				numbers[right] = array[right];
				right--;
			}
		}
	}


	private static void mergeRecursive(double [] numbers, int left, int right)
	{
		int mid;

		if (right>left){
			mid = (left + right)/2;
			mergeRecursive(numbers, left, mid);
			mergeRecursive (numbers, (mid+1), right);
			doMerge(numbers, left, (mid+1), right);
		}
	}


	/**Public frienly MergeSort method
	 * int array
	 * **/
	public static void mergeSort(double [] arrayToSort)
	{
		System.out.println("");
		System.out.println("MergeSort By Recursive Method");

		mergeRecursive(arrayToSort, 0, arrayToSort.length - 1);
		for (int i = 0; i < 9; i++)
			System.out.print(arrayToSort[i]+", ");

	}


	/**public Merge Sort methods are usually to divide array in to half and take left then go to right 
Then sends them to mage method when they are in the base case
	 * **/
	/**public method Merge Sort 
	 *String array
	 * **/

	private static void doMerge(String []numbers, int left, int mid, int right){

		String[] array= new String[numbers.length];
		int i;
		int left_end; 
		int num_elements; 
		int tmp_pos;

		left_end= mid-1;
		tmp_pos=left;
		num_elements = (right-left+1);

		while (left <=left_end &&(mid<= right)){

			if (numbers[left].compareTo(numbers[mid])==-1){
				array[tmp_pos++]=numbers[left++];
			}
			else{
				array[tmp_pos++].compareTo(numbers[mid++]);
			}
			while (mid<= left_end)
				array[tmp_pos++]=(numbers[mid++]);

			for (i=0; i< num_elements; i ++){
				numbers[right] = array[right];
				right--;
			}
		}
	}


	private static void mergeRecursive(String [] numbers, int left, int right)
	{
		int mid;
		mid = (left + right)/2;
		if (right>left){
			
			mergeRecursive(numbers, left, mid);
			mergeRecursive (numbers, (mid+1), right);
			doMerge(numbers, left, (mid+1), right);
		}
	}


	/**Public frienly MergeSort method
	 * int array
	 * **/
	public static void mergeSort(String [] array3)
	{
		System.out.println("");
		System.out.println("MergeSort By Recursive Method");

		mergeRecursive(array3, 0, array3.length - 1);
		for (int i = 0; i < 9; i++)
			System.out.print(array3[i]+", ");

	}













	/**public Quicksort method  
	 *provides from the main the int array
	 * **/
	public static void quick(int array[]){
		quickSort(array,0,array.length-1);//calls quick sort: sets the start of the array and the end
		System.out.println("");
		System.out.println("Quick sorted:");
		for(int i=0; i<array.length; i++){
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
		for(int i=0; i<array.length; i++){
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
		for(int i=0; i<array.length; i++){
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



