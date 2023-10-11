#include <iostream>

using namespace std;

class Solution
{
public:
    int mysqrt(int x)
    {
        if (x <= 0)
            return 0;
        int start = 1;
        int end = x / 2;

        int mid;
        while (start <= end)
        {
            mid = start + (end - start) / 2;
            if(mid == x/mid) return mid;
            if(mid < x/mid) start = mid + 1;
            else end = mid - 1;
        }

        return end;
    }
};

int main()
{
    return 0;
}