package Array_2;
//https://codingbat.com/prob/p168357
public class Has77 {
    public boolean has77(int[]nums){
        for (int i=1;i<nums.length-1;i++){
            if(nums[i-1]==7 && nums[i]==7)
                return true;
            if (nums[i]==7 && nums[i+1]==7)
                return true;
            if (nums[i-1]==7 &&nums[i+1]==7)
                return true;
        }
        return false;
    }
}
