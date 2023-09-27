class Solution {
public:
    int min(int x, int y){
      return x<y ? x : y;
    }
    int maxArea(vector<int>& height) {
        int start = 0 ;
        int last = height.size()-1;
        int maxarea = 0;
        while (start < last){
          int currentArea = min(height[start] , height[last])* (last - start);
          if(currentArea>maxarea) maxarea = currentArea;
          if(height[start] < height[last]){
            start ++ ;
          }else {
            last --;
          }

        }

        return maxarea;
    }
};
