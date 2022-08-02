class Solution {
//     public int kthSmallest(int[][] matrix, int k) {
        
//         int r = matrix.length;
//         int c = matrix[0].length;
//         int startVal = matrix[0][0];
//         int endVal = matrix[r-1][c-1];
//         int midVal;
        
//         while(startVal <=endVal)
//         {
         
//             midVal =(startVal + endVal)/2;
// //             Row-wise traversing the matrix
    
//             int ans =0;
//             for(int i=0; i<=r;i++)
//             {
// //                 Applying binary search on each row
                
//                 int low = 0 , high = c-1, m;
//                 while(low<=high)
//                 {
//                     m = low + (high - low)/2;
//                     if(matrix[i][m]<=midVal) low = m +1;
//                     else high = m -1;
//                 }
//                 ans += low;
//             }
//             if(ans<k) startVal = midVal + 1;
//             else endVal = midVal - 1;
//         }
//         return startVal;
        
    

            public int kthSmallest(int[][]matrix,int k){
                int r =matrix.length;
                int c =matrix[0].length;
                int startVal = matrix[0][0];
                int endVal= matrix[r-1][c-1];
                int midVal;
                
                while(startVal<=endVal)
            
                {
                    midVal=(startVal+endVal)/2;
                       // Row-wise traversing the matrix
                    int ans=0;
                    for (int i = 0 ; i<r;i++)
                    {
                           // Applying binary search on each row
                        int lo =0, hi=c-1,m;
                        while(lo<=hi)
                        {
                            m=lo+(hi-lo)/2;
                            if(matrix[i][m]<=midVal)lo=m+1;
                            else hi=m-1;
                        }
                        ans+=lo;
                    }
                    if(ans<k)startVal=midVal+1;
                    else endVal= midVal-1;
                }
                return startVal;
    }
}