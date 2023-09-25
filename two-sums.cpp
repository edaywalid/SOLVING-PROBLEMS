#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class solution
{
public:
    vector<int> Solution(vector<int> &nums, int target)
    {
        vector<int> result;
        for (int i = 0; i < nums.size()-1; i++)
        {
            for (int j = i+1; j < nums.size(); j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    result.push_back(i);
                    result.push_back(j);
                    return result;
                }
            }
            
        }
        return {};
    }
};

int main()
{
    return 0;
}