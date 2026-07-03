class Solution {
    public int trap(int[] height) {
        if(height==null || height.length== 0){
            return 0;
        }

        int res=0;
        int l=0; int r= height.length-1;

        int leftMax= height[l]; int rightMax= height[r];

        while(l<r){
            leftMax=Math.max(leftMax, height[l]);
            rightMax= Math.max(rightMax, height[r]);
            
            if(leftMax<rightMax){
                res= res+ (leftMax-height[l]);
                l++;
            }
            else{ 
                res= res + (rightMax - height[r]);
                r--;
            }
        
        }
        return res;
    }
}
