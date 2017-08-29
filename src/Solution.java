import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author : hechucai
 * @Description :
 * @Date : Created in ${time} ${date}
 * @Modified By :
 */

public class Solution {
    public int[] twoSum(int[] nums, int target){
//        for(int i=0;i< nums.length-1;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[j]==target-nums[i]){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return null;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(nums[0],0);
        for (int i=1;i< nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],0);
        }
        return null;
    }

    public int removeDuplicates(int[] nums) {
        int i=0;
        for (int j=0;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        while(head.next!=null){
            head.next=pre;
            pre=head;
            head=head.next;
        }
        return head;
    }

    public void quickSort(int[] s,int l,int r){
        if (l < r)
        {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j)
            {
                while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if(i < j)
                    s[i++] = s[j];

                while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if(i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quickSort(s, l, i - 1); // 递归调用
            quickSort(s, i + 1, r);
        }
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int or=nums.length;
        int oc=nums[0].length;
        int sum=or*oc;
        if(sum==r*c){
            int[][] result=new int[r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    int place=i*c+j;
                    int nr=place/oc;
                    int nc=place%oc;
                    result[i][j]=nums[nr][nc];
                }
            }
            return result;
        }else{
            return nums;
        }
    }


}
