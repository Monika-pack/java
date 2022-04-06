package test;

public class Test {
	public static void main(String[] args) {

    int[] arr1={7,5,6,1,4,2};
   
    System.out.println("missing num arr1: "+Test(arr1));
    int[] arr2={5,3,1,2};
    System.out.println("Missing num arr2: "+Test(arr2));

}

public static int Test(int[] arr)
{
    int n=arr.length+1;
    int sum=n*(n+1)/2;
    int restSum=0;
    for (int i = 0; i < arr.length; i++) {
        restSum+=arr[i];
    }
    int missingNumber=sum-restSum;
    return missingNumber;
}
}
