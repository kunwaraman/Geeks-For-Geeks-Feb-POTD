import java.util.*;
/*
time o(nlogk)
space o(k)
 */
public class KClosestPointTOOrigin {
    public int[][] kClosest(int[][] points, int k) {
        // Your code here
        if(points==null){
            return null;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] p1,int[] p2){
                return (p2[0]*p2[0]+p2[1]*p2[1])-(p1[0]*p1[0]+p1[1]*p1[1]);
            }
        });

        for(int i=0;i<points.length;i++){
            pq.add(points[i]);
            if(pq.size()>k){
                pq.remove();
            }
        }
        int res[][] = new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
            res[i]=pq.remove();
            i++;
        }
        return res;

    }
}
