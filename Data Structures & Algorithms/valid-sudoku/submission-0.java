class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows  = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];

        for(int i=0; i<9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i]= new HashSet<>();
        }
        for(int i=0; i<rows.length; i++){
            for(int j=0; j< cols.length; j++){
                char num = board[i][j];
                if(num == '.') continue;
                int boxIndex = (i/3)*3 + (j/3);
                if(rows[i].contains(num) || cols[j].contains(num) || box[boxIndex].contains(num)) return false;
                rows[i].add(num);
                cols[j].add(num);
                box[boxIndex].add(num);
                
            }
        }
        return true;
        
    }
}
