package leetcode;

public class task11 {
    public int majorityElement(int[] arr) {
        int count=1;
        int ele=arr[0];
        for(int i=0;i<arr.length;i++){

            if(arr[i]==ele){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ele=arr[i];
                count=1;
            }
        }
        return ele;
    }
}
