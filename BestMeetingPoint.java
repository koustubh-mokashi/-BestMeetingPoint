class Solution {
    public int minTotalDistance(int[][] grid) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j] == 1) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
       
        Collections.sort(rows);
        Collections.sort(cols);
        int rowMid = rows.get(rows.size()/2);
        int colMid = cols.get(cols.size()/2);
        
        int sum = 0;
        for(int l=0;l<rows.size();l++) {
            sum+=Math.abs(rows.get(l)-rowMid);
            sum+=Math.abs(cols.get(l)-colMid);
        }
        return sum;
    }
}
