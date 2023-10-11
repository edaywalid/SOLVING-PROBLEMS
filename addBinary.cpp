#include <iostream>
#include <algorithm>
using namespace std;

class solution
{
public:
    string binarySum(string a, string b)
    {
        
        int i = a.size() - 1;
        int y = b.size() - 1;

        string result;
        int carry = 0;
        while (i >= 0 || y >= 0)
        {
            int sum = carry;
            if (i >= 0)
                sum += a[i--] - '0';
            if (y >= 0)
                sum += b[y--] - '0';

            carry = sum > 1;

            result.append(to_string(sum % 2));
        }
        

        if(carry) result.append("1");

        reverse(result.begin() , result.end());


        return result ;
    }
};

int main()
{
    solution sol;
    string a = "11";
    string b = "10";

    cout << sol.binarySum(a, b) << endl;
    return 0;
}