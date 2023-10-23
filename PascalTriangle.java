class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        result.add(List.of(1));
        numRows -- ;

        while (numRows > 0) {

            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            List<Integer> lastList = result.get(result.size() - 1);
            int pointer = 0;
            while (pointer < lastList.size() - 1) {
                temp.add(lastList.get(pointer) + lastList.get(pointer + 1));
                pointer++;
            }

            temp.add(1);
            result.add(temp);
            numRows--;


        }

        return result;
    }

}

