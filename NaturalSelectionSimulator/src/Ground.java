

public class Ground {
	private String Surface[][] = new String[1000][800]; // array liste de olabilir.
	// singleton
	
	
	Ground(){
		
		
	}
	public void fill_surface(String whichOne, int x, int y){
		int posX = x;
		int posY = y;
		switch(whichOne){
		case "Rabbit":
			while(Surface[posX][posY] != "null"){
				posX += 5;
				posY += 5;
			}
			Surface[x][y] = "Rabbit";
			break;
		case "Grass":
			Surface[x][y] = "Grass";
			break;
		}
		
		
	}
	public boolean IsItFull(int posX, int posY){
		
		return true;
	}
	public void clearSurface(){
		for(int i=0; i<1000; i++){
			for(int j=0; j<800; j++){
				Surface[i][j] = "null";
			}
		}
	}
}