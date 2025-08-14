public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 9};
        System.out.println(maxArea(height));
    }
    static public int maxArea(int[] heights) {
        int res=0;
        int max=0;
        int l=0;
        int r=heights.length-1;
        while(l<r){
            if(heights[l]<heights[r]){
                res=(r-l)*Math.min(heights[l], heights[r]);
                max=Math.max(max, res);
                l++;
            }
            else{
                res=(r-l)*Math.min(heights[l], heights[r]);
                max=Math.max(max, res);
                r--;
            }
        }
        return max;
    }
}
