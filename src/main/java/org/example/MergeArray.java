package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArray {
    public void merge(int[] nums1,int m, int[] nums2,int n) {

        int i;
        for(i = 0;i < nums1.length - 1;i++){
            if(nums1[i] == 0){
                break;
            }
        }
        nums1 = Arrays.copyOfRange(nums1,0,i);

        int [] mergearr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergearr, 0, nums1.length);
        System.arraycopy(nums2, 0, mergearr, nums1.length, nums2.length);
        Arrays.sort(mergearr);
        System.out.println(Arrays.toString(mergearr));

    }
}
