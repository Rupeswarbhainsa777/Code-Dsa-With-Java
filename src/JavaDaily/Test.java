package JavaDaily;


import java.util.*;


class Test {


    public static void main(String[] args) {
        String str = "Sky          is          blue";


        System.out.println(reverseWords(str));

    }
    public static String reverseWords(String s){
        String str1[] = s.trim().split("\\s+");


        StringBuffer st = new StringBuffer();
        for(int i=str1.length-1;i>=0;i--){
            st.append(str1[i]);
            if(i!=0){
                st.append(" ");
            }

        }


        return st.toString();


    }




}






























//
//
//
//  for(int i=0;i<nums.length-1;i++){
//
//int first=nums[i];
//            if(nums[i]+1==nums[i+1]){
//        continue;
//        }
//        else {
//        li.add(nums[i]+"->"+nums[i++]);
//            }
//
//                    }
//                    return li;