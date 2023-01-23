public static void setZeros(int matrix[][]) {
        // Write your code here..
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        
        //getting the index of 0 elments
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    x.add(i);
                    y.add(j);
                }
            }
        }

        int xs = x.size();
        int ys = y.size();

        //setting the zeros by row
        for(int i = 0; i < xs; i++){
            int index = x.get(i);
            for(int j = 0; j < n; j++){
                matrix[index][j] = 0;
            }
        }

        //setting the zeros by col
        for(int i = 0; i < ys; i++){
            int index = y.get(i);
            for(int j = 0; j < m; j++){
                matrix[j][index] = 0;
            }
        }
    }
