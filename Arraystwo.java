public class Arraystwo {
    public static void spiral_matrix(int [][] array,int m, int n)
    {  
        int sr = 0;
        int er = m;
        int sc = 0;
        int ec = n;
        while (sr<er && sc<ec)
        {
            for (int j = sc; j<ec; j++)
            {
                System.out.print(array[sr][j]);
            }
            for(int i = sr+1; i<er; i++)
            {      if(sr == er) {break;}
                System.out.print(array[i][ec-1]);
            }
         

            for (int j = ec-2; j>sc; j--)
            {
                System.out.print(array[er-1][j]);
            }
            for(int i = er-1; i>sr; i--)
            {   if (sc == ec){break;}        
                System.out.print(array[i][sc]);
            }

              sr ++;
              sc ++;
              er --;
              ec --;

        }
        System.out.println();       

    }
    public static void staircasesearch(int[][] array,int n, int ele)
    {
        int row = 0,col = n-1;
        while (row<=col && col>=0)
        {
            if(array[row][col] == ele)
            {
                 System.out.println("Found key at" +"("+row+","+col+")");
                 return;
            }
            else if (ele <array[row][col])
            {col --;}
            else {row ++;}
        }
       System.out.println("Not found");
       return;

    }




   public static void main(String[] args) {
        int[][] array = new int[5][5];
        int value = 1;
        for (int i = 0; i< array.length;i++)
        {
            for(int j = 0; j<array.length;j++)
            {
               array[i][j] = value++;
            }
        }
        for (int i = 0; i< array.length;i++)
        {
            for(int j = 0; j<array.length;j++)
            {
              System.out.print(array[i][j]);
            }
            System.out.println();
        }
        spiral_matrix(array, 5, 5);
        staircasesearch(array, 5, 9);


    }
}
