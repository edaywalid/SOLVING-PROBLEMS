#include <iostream>
#include <vector>
#include <unordered_map> 
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int> &nums, int target) { 
        unordered_map<int, int> hash; 
        vector<int> result;
        for (int i = 0; i < nums.size(); i++) {
            int numberToFind = target - nums[i];
            if (hash.find(numberToFind) != hash.end()) {
                result.push_back(hash[numberToFind]);
                result.push_back(i);
                return result;
            }
            hash[nums[i]] = i;
        }
        return {};
    }
};

int main() {
    Solution solution;
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;
    vector<int> result = solution.twoSum(nums, target);
    
    for (int num : result) {
        cout << num << " ";
    }
    
    return 0;
}
