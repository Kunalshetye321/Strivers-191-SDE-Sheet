//Logical Approach
// arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
//https://www.youtube.com/watch?v=Q1lj9B33Euc&ab_channel=CodewithAlisha
class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li = new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows; i++) {
            List<Integer> li1 = new ArrayList<Integer>();
            for (int x = 0; x < i+1; x++) {
                li1.add(1);
            }
            for(int j = 1; j < i; j++) {
                Integer p = li.get(i-1).get(j) + li.get(i-1).get(j-1);
                li1.set(j,p);
            }

            li.add(li1);
        }

        return li;
    }
}

