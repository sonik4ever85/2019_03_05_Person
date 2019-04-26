package telran.person.data;


public class ArrayTools {

	public static void fillArray(int arr[],int min, int max) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]=min+(int)(Math.random()*(max-min+1));
			
		}
	}
	
	public static void printArray(Person arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
	}
	
	public static void sumArray(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of Array is:" + sum);
		}	


	public static void average (int arr[]) {
    	int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println(sum);
        System.out.println("Array average is: "+ sum/arr.length);

    }
	
	public static void search(int arr[],int num) {
		int i;
		for(i=0; i<arr.length; i++) {
			if(arr[i]==num){
				System.out.println("index is:" + i);
				break;
				
		}
			
		}
	}	
	
	public static void bubbleSort(int arr[]){
		int i,j;
		for(i=0;i<arr.length-1;i++){
			for(j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static int binarySearch(int arr[], int num){
	int l,r,mid;
	    for(l=0 , r=arr.length-1; l<=r;){
	        mid=(l+r)/2;
	        if(arr[mid]==num){
	        	return mid;
	        }
	        if(arr[mid]>num){
	            r=mid-1;
	        }
	        if(arr[mid]<num){
	            l=mid+1;
	        }
	    }
	    return -1;
}
	
}

  

