package com.gfg.array;

import java.util.PriorityQueue;
import java.util.Queue;

public class Result {
    public static void main(String[] args) {
        String str = "bbbaa";

        System.out.println(Result.longestDiverseString(1,1,2));
    }


    public static String longestDiverseString(int a, int b, int c) {
        Queue<int[]> pq = new PriorityQueue<>((x, y) -> y[1] - x[1]);
        if (a > 0) {
            pq.offer(new int[] {'a', a});
        }
        if (b > 0) {
            pq.offer(new int[] {'b', b});
        }
        if (c > 0) {
            pq.offer(new int[] {'c', c});
        }

        StringBuilder sb = new StringBuilder();
        while (pq.size() > 0) {
            int[] cur = pq.poll();
            int n = sb.length();
            if (n >= 2 && sb.codePointAt(n - 1) == cur[0] && sb.codePointAt(n - 2) == cur[0]) {
                if (pq.size() == 0) {
                    break;
                }
                int[] next = pq.poll();
                sb.append((char) next[0]);
                if (next[1] > 1) {
                    next[1]--;
                    pq.offer(next);
                }
                pq.offer(cur);
            } else {
                sb.append((char) cur[0]);
                if (cur[1] > 1) {
                    cur[1]--;
                    pq.offer(cur);
                }
            }
        }
        return sb.toString();
    }
}

/* second qn Longest Diverse string
    public static String longestDiverseString(int a, int b, int c) {

        Queue<int[]> pq = new PriorityQueue<>((x,y) -> y[1] - x[1]);

        if(a > 0){
            pq.offer(new int[] {'a',a});
        }
        if(b > 0){
            pq.offer(new int[] {'b',b});
        }
        if(c > 0){
            pq.offer(new int[] {'c',c});
        }

        StringBuilder sb = new StringBuilder();

        while(pq.size() > 0){
            int[] cur = pq.poll();
            int n =sb.length();
            if(n >= 2 && sb.codePointAt(n-1) == cur[0] && sb.codePointAt(n-2) == cur[0]){
                if(pq.size() ==0){
                    break;
                }
                int [] next = pq.poll();
                sb.append((char) next[0]);
                if(next[1] > 1){
                    next[1]--;
                    pq.offer(next);
                }
                pq.offer(cur);
            }else{
                sb.append((char) cur[0]);
                if(cur[1] > 1){
                    cur[1]--;
                    pq.offer(cur);
                }
            }
        }
        return sb.toString();
    }

}

*/

/* 1st
 No Two Adjacent charcters
public static String reorganizeString(String s) {

        int n = s.length();
        int[] cnt = new int[26];
        int mx = 0;
        for(char c : s.toCharArray()){
            int t = c -'a';
            ++cnt[t];
            mx = Math.max(mx,cnt[t]);
        }

        if(mx > (n+1) /2){
            return "";
        }

        int k =0;
        for(int v : cnt){
            if( v > 0){
                ++k;
            }
        }

        int [][] m = new int[k][2];
        k=0;
        for(int i=0;i<26;i++){
            if(cnt[i] > 0){
                m[k++] = new int[] {cnt[i],i};
            }
        }
            Arrays.sort(m, (a,b) -> b[0] - a[0]);
            k=0;
            Stringbuilder ans = new Stringbuilder(s);
            for(int[] e: m){
                int v = e[0], i=e[1];
                while(v-- > 0){
                    ans.setcharAt(k, (char) ('a' + i));
                    k += 2;
                    if( k>= n){
                        k=1;
                    }
                }
            }
            return ans.toString();
        }


 */






