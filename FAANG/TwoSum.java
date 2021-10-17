import java.lang.module.FindException;




public class TwoSum {
    

    //Problem: given an array of integers , find the indices of two numbers, sum of which results into target number provided as input 
    // Non optimized solution : use two for loop recursively , capture the indexes if numbers are found and return
    // OPTIMIZED solution : use hashmap to store the number of find which is hte difference of current number ad target, iterate through the list\array, store the NumberToFind(Target-current)
    // into hashmap,move on to next number and see if number to find exist in hashmap, if not , move on to next number, if found ,return the value of hashmap(which in this case is index) & current index

    public static int[] findNumber(int[] arr, int targetVar){

        int[] output = {0,0};
            for (int i=0;i< arr.length;i++){
                int numberToFind = targetVar-arr[i];
                for (int j=i+1; j< arr.length;j++){
                    
                    if (arr[j] == numberToFind){
                      
                        output[0] = i;
                        output[1]= j;
                    }
                }

            }

        return output;
    }


public static void main(String[] args) {
    int targetVar = 10;
    int arr[] = {1,3,7,9,2};
    
    int prt[] = TwoSum.findNumber(arr, targetVar);
    System.out.print("two indices are found and their value is : " + prt[0] + " & "  + prt[1] );
}
}