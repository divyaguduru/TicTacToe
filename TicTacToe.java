class TicTacToe{

    TicTacToe(){
	 initializeGame();
	 drawBoard();
	}
	
	void initializeGame(){
	char[][] table=new char[2][2];
	for(int i=0;i<=2;i++)
	{
		for(int j=0; j<=2; j++)
		{
			table[i][j]=" ";
		}
	}
	}
	
	void drawBoard(){
	 System.out.println(table[0][0]+"|"+table[0][1]+"|"+table[0][2]);
	 System.out.println("_|_|_");
	 System.out.println(table[0][0]+"|"+table[0][1]+"|"+table[0][2]);
	 System.out.println("_|_|_");
	 System.out.println(table[0][0]+"|"+table[0][1]+"|"+table[0][2]);
     System.out.println("_|_|_");	
	}
	
	void startGame(){
	char player,currentPlayer;
	Scanner reader=new Scanner(System.in);
	
	while(!isGameDone){
	 currentPlayer=choosePlayer(player);
	 System.out.println("choose position x and y");
	 int positionX=reader.nextInt();
	 int positionY=reader.nextInt(); 
	 table[positionX][positionY]=currentPlayer;
	 }
	}
	
	boolean isGameDone(){
	
	}
	char choosePlayer(char player){
	if(player==null){
	player='x';
	}
	else player=='x'?o:x;
	}
	
	public static void main(String[] args){
	TicTacToe t=new TicTacToe();
	t.startGame();
	}
}
