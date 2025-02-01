/*
pst:https://practice.geeksforgeeks.org/problems/word-search/1
this is the classical backtracking problem
time complexity : O(4^n)
space complexity : O(n)
 */

public class WordSearch {
    static int n;
    static int m;
    static int[][] direct = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        n=mat.length;
        m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==word.charAt(0) && recur(mat,i,j,0,word)==true){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean recur(char[][] mat,int i,int j,int idx,String word){


        if(idx==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=n || j>=m|| mat[i][j]=='#'){
            return false;
        }
        if(mat[i][j]!=word.charAt(idx)){
            return false;
        }
        char temp = mat[i][j];
        mat[i][j]='#';
//        if(recur(mat,i-1,j,idx+1,word)||recur(mat,i+1,j,idx+1,word) || recur(mat,i,j+1,idx+1,word)
//                ||recur(mat,i,j-1,idx+1,word)){
//            return true;
//        }
        // instead of this we can use direction array preinitialized
        for(int dir[]:direct){
            int newi = i+dir[0];
            int newj = j+dir[1];
            if(recur(mat,newi,newj,idx+1,word)==true){
                return true;
            }
        }
        mat[i][j]=temp;
        return false;
    }
}
