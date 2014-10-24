int getMatrix(vector<vector<char> > &matrix, int i, int j){
        int m = matrix.size();
        int n = matrix[0].size();
        int res = 0;
        for(int row = i; row<m; i++){
            int width = 0;
            while((width+j)<n && matrix[row][width+j]=='1')
                width++;
            int rec = (i-row+1)*width;
            if(rec>res)
                res = rec;
        }
        return res;
    }
    int maximalRectangle(vector<vector<char> > &matrix) {
        int m = matrix.size();
        if(m==0)    
            return 0;
        int res = 0;
        int n = matrix[0].size();
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j]=='1'){
                    int tmp = getMatrix(matrix,i,j);
                    if(tmp>res)
                        res = tmp;
                }
            }
        }
        return res;
    }
