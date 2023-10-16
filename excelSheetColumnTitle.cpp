class Solution {
public:
    string convertToTitle(int columnNumber) {
        if (columnNumber <= 0)
            return "";

        columnNumber--; 

        int remainder = columnNumber % 26;
        char lastChar = 'A' + remainder;

        string prev = convertToTitle(columnNumber / 26);

        return prev + lastChar;
    }
};

