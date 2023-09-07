public class SnakeandLadder {
     public static void main(String[] args) {
        
    int n = 4;
    int [] board = new int[n*n];
    int [] start = new int[]{2, 4, 6, 10};
    int [] end = new int[]{5, 12, 2, 7};
    int dice = 10;
    for(int i = 0; i< board.length; i++)
    {
        board[i] = i+1;
    } 
    int pos = board[0];
    int count = 0;
    while(pos<board[n-1])
    {  pos = pos + dice;
       count ++;
        for(int i = 0; i < start.length; i++)
        {
               if(pos == start[i] )
                {   pos = end[i];
                    

                }
        }
        
    }
    int laddercount = 0;
    int snakecount = 0;
    for (int i = 0; i<start.length;i++)
    {
        if(start[i]>end[i])
        snakecount++;
        else if (end[i]>start[i])
        laddercount++;
    }
    System.out.println("the number of snakes and ladders are "+snakecount+"and "+laddercount+" respectively");
    System.out.println("Minimuim number of throws"+count);
    }
}
