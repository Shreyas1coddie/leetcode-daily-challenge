class Solution 
{
    public int maxArea(int[] arr) 
    {
        int left = 0,right = arr.length-1;
        int max = 0;

        while(left < right)
        {
            int height  = Math.min(arr[left],arr[right]);
            int breadth = right-left;
            int area = height * breadth;
            max = Math.max(max,area);

            if(arr[left] < arr[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
        
    }
}
