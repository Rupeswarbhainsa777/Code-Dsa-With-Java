package JavaDaily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Feb_13 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("out put");
//        lonBalance(arr);

        String str = "aabcc";
        System.out.println(lonBalance(str));
//        isBalance(str);
    }

    public static  void lonBalance(int arr[]){
        int n = arr.length;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                for(int k=j;k<i+j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }



    public static int lonBalance(String s){
        int max =0;
        int n = s.length();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){

                for(int k=j;k<i+j;k++){
                   isBalance(s.substring(j,k));
                   int ma = s.substring(j,k).length();
                   max = Math.max(max,ma);
                }

            }
        }
        return max;
    }

    public static boolean  isBalance(String s){
        Map<Character,Integer> map = new HashMap<>();
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<Character> li1 = new ArrayList<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> ent : map.entrySet()){
            li.add(ent.getValue());
            li1.add(ent.getKey());
        }
        int count=0;

        for(int i : li){
           if(i == i++){
               count++;
           }
        }
        if(count==li1.size()){
            return true;
        }
        return false;
    }
}
