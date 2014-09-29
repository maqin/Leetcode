public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = board[0].length;
        int col = board.length;
        //check row
        for(int i = 0; i<col; i++){
            int[] number = new int[row+1];
            for(int j = 0; j<row; j++){
                if(board[i][j]=='.')
                    continue;
                int index = board[i][j]-'0';
                if(index>row || index<=0 || number[index]!=0)
                    return false;
                else
                    number[index]++;
            }
        }
        
        //check column
        
        for(int i = 0; i<row; i++){
            int[] number = new int[row+1];
            for(int j = 0; j<col; j++){
                if(board[j][i] =='.')
                    continue;
                int index = board[j][i]-'0';
                if(index>row || index<=0 || number[index]!=0)
                    return false;
                else
                    number[index]++;
            }
        }
        //check square
        int step = (int) Math.sqrt(row);
        for(int i = 0; i<step; i++){
            for(int j = 0; j<step; j++){
                int[] number = new int[row+1];
                for(int start=i*step; start<(i+1)*step; start++)
                    for(int end = j*step; end<(j+1)*step; end++){
                        if(board[start][end]=='.')
                            continue;
                        int index = board[start][end]-'0';
                        if(index>row || index<=0 || number[index]!=0)
                            return false;
                        else
                        number[index]++;
                    }
            }
        }
        return true;
    }
}
