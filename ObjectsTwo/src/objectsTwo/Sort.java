
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
	public static int bubbleSort(int array[]){
		int temp;
		int size = array.length;
		for(int i=0; i<size-1; i++){
			for (int j=0; i<size-1; j++){
				if (array[j]>array[j+1]){
					temp = array [j];
					array[j]= array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return 0;
	}
	/**public method Bubble Sort 
	 * double array
	 * **/
	public static int bubbleSort(double array[]){
		double temp;
		int size = array.length;
		for(int i=0; i<size-1; i++){
			for (int j=0; i<size-1; j++){
				if (array[j]>array[j+1]){
					temp = array [j];
					array[j]= array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return 0;
	}
	/**public method Bubble Sort 
	 *String array
	 * **/
	public static String bubbleSort(String array[]){
		String temp;
		int size = array.length;
		for(int i=0; i<size-1; i++){
			for (int j=0; i<size-1; j++){
				if (array[j].compareTo(array[j+1])== 1){

					temp = array [j];
					array[j]= array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return "array[]";
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

	private static void merge(int leftA[], int rightA[]) {
		int []finArray= new int[2];

		if(leftA[0]<rightA[0]){
			finArray[0]=leftA[0];
		}
		else if(leftA[0]>rightA[0]){
			finArray[0]=rightA[0];
		}


	}
	public static void quick(int array[]){
		quickSort(array,0,array.length-1);
		for(int i=0; i<array.length-1; i++){
			System.out.print(array[i]+"");
		}
	}

	private static void quickSort(int array[], int l, int r){
		int index = partition(array,l,r);
		if(l<index-1)
			quickSort(array, l, index-1);
		if (index<r)
			quickSort(array,index,r);


	}
	private static int partition(int array[], int l, int r){ 
		int pivot= array[((r+l))/2];
		while(l<r){
			while (l<pivot)l++;
			while(l>pivot)r--;
			if (l<=r){
				int left = array[l];
				array[l]= array[r];
				array[r]= left;
				l++;
				r++;
			} 
		}
		return l;
	}
}
// if j is less than the pivot keep increasing i 


