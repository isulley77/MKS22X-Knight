public class KnightBoard{
    
    
    private int[][] board;
    
    
    public KnightBoard(int rows, int columns){
    
        board = new int[rows][columns];
    
    }
    
    public String toString(){
        
        String sboard = "";
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
            
            
            
                if(board[i][j] == 0){
                    
                    sboard += " _ ";
                }
            
                else if(board.length * board[0].length < 10){
                    
                    sboard += board[i][j] + " ";
                }
                
                else{
                    
                    sboard += " " + board[i][j] + " ";
                }
            
            }
            
            sboard += "\n";
        }
        
        
        return sboard;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args){
    
    
    }
    
}
