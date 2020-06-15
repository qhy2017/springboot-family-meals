package qhy.example.web.util.sf;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SF {

    public static void main(String[] args) {

//      System.out.println(lengthOfSubstring("abcdabklpoiuytr"));

//        long l = System.currentTimeMillis();
//        int[] nums = new int[]{1,8,6,2,5,4,8,3,7,12,2,2,2,3,4,5,6,7,8,98,0,12,34,34,55,55,66,77,88,99,55,44,33,222,11,33,45,123,12,1,8,6,2,5,4,8,3,7,12,2,2,2,3,4,5,6,7,8,98,0,12,34,34,55,55,66,77,88,99,55,44,33,222,11,33,45,123,12,1,8,6,2,5,4,8,3,7,12,2,2,2,3,4,5,6,7,8,98,0,12,34,34,55,55,66,77,88,99,55,44,33,222,11,33,45,123,12,123,12,56,7,8,8,8,9,0,2,45,67,44,7,5,3,2,2,2,2,2,2,2,2,2,2,2,2,2,8,8,9,9,9,0,12,3,4,5,6,7,8,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,1,8,6,2,5,4,8,3,7,12,2,2,2,3,4,5,6,7,8,98,0,12,34,34,55,55,66,77,88,99,55,44,33,222,11,33,45,123,12,1,8,6,2,5,4,8,3,7,12,2,2,2,3,4,5,6,7,8,98,0,12,34,34,55,55,66,77,88,99,55,44,33,222,11,33,45,123,12,1,8,6,2,5,4,8,3,7,12,2,2,2,3,4,5,6,7,8,98,0,12,34,34,55,55,66,77,88,99,55,44,33,222,11,33,45,123,12,123,12,56,7,8,8,8,9,0,2,45,67,44,7,5,3,2,2,2,2,2,2,2,2,2,2,2,2,2,8,8,9,9,9,0,12,3,4,5,6,7,8,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6};
//        //时间最短
//        int i = maxCapacity(nums);
//        System.out.println(i);
//        System.out.println(System.currentTimeMillis() - l);
//        l = System.currentTimeMillis();
//        //消耗时间
//        int i2 = blMax(nums);
//        System.out.println(i2);
//        System.out.println(System.currentTimeMillis() - l);
//
//        int i = 9;
//        int a = i;
//        a--;
//        System.out.println(i);
//        System.out.println(a);

//        int[] arr = {10,7,2,4,7,62};
//        quickSort(arr, 0, arr.length-1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        Arrays.sort(arr);
        int reverse = reverse(0);
        System.out.println(reverse);

        System.out.println(120 % 10);

    }

    /**
     *
     * @param x int整型
     * @return int整型
     */
    public static int reverse (int x) {
        // write code here
        int flag =x>0? 1:-1;
        int rev = 0;
        x=x>0?x:-x;
        while(x!=0){
            if(rev!=(rev*10)/10){
                return 0;
            }
            rev = (rev*10)+x%10;
            x=x/10;
        }
        return flag*rev;
    }

    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        temp = arr[low];
        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
               int z = arr[i];
               int  y = arr[j];
                arr[i] = y;
                arr[j] = z;
            }

        }
//        #或 arr[low] = arr[j];
        arr[low] = arr[i];
//        #或 arr[j] = temp;
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }

    public static int blMax(int[] nums){
        int max= -1;
        int width = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = 1;j < nums.length; j++){
               if(nums[i] <= nums[j]){
                  max = Math.max(max,(j-i) * nums[i]);
               } else {
                   max = Math.max(max,(j-i) * nums[j]);
               }
            }
        }
        return max;
    }

    /**
     * 长度高度
     * 长度一次递减，找高度 舍去短板
     * @param hight
     * @return
     */
    public static int  maxCapacity (int[] hight){
        int max = (-1);
        int left = 0;
        int right = hight.length -1;
        while (left < right) {
            if(hight[left] <= hight[right]){
                max = Math.max(max,(right - left) * hight[left]);
                left++;
            } else {
                max = Math.max(max,(right -left) * hight[right]);
                right--;
            }
        }
        return  max;

    }

    /**
     * 统计最长子字符串长度
     */
    static int strMaxLength(String s) {
        //最大值
        int max = 0;
        //初始位置指针
        int i = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                //如果存在把当前指针往左移
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            map.put(s.charAt(j), j);
            max = Math.max(max, j - i + 1);
        }
        return max;
    }

    static int lengthOfSubstring(String s) {
        int i = 0;
        int flag = 0;
        int length = 0;
        int result = 0;
        while (i < s.length()) {
            int pos = s.indexOf(s.charAt(i), flag);
            //重复逻辑
            if (pos < i) {
                if (length > result) {
                    result = length;
                }
                if (result >= s.length() - pos - 1) {
                    return result;
                }
                length = i - pos - 1;
                flag = pos + 1;
            }
            length++;
            i++;
        }
        return length;
    }
}
