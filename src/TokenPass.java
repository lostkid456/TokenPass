public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount){
        this.board=new int[playerCount];
        for(int i=0;i<this.board.length;i++){
            int x=(int)(Math.random()*10);
            board[i]=x;
        }
        this.currentPlayer=(int)(Math.random()*playerCount);
    }

    public void printBoard(){
        for(int i=0;i<board.length;i++){
            System.out.print(board[i]);
        }
    }

    public void distributeCurrentPlayerTokens(){
        int x=currentPlayer;
        int distribute=board[currentPlayer];
        currentPlayer=0;
        for(int i=distribute;i>0;i--){
            x=(x+1)%board.length;
            board[x]++;
        }
    }
    public void nextPlayer(){
        currentPlayer=(currentPlayer+1)%board.length;
    }

    public int gameOver(){
        int result=-1;
        for(int i=0;i<board.length-1;){
            if(board[i%4]==0);
            result=1;
            return result;
        }
        return result;
    }
}