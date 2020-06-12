
public class Rabbit {
	private String Direction;
	private float Energy=100;
	private int PositionX;
	private int PositionY;
	private float Speed;
	Draw drawRabbit = new Draw();
	// reflectoring (sinav konusu).
	Rabbit(){
		
	}
	public int[] getPosition(){
		
		int position[]= new int  [2]; //We can send two values with position.
		position[0]= PositionX;
		position[1]= PositionY;
		
		return position;
	}
	public String getDirection(){
		
		return Direction;
	}
	public float getEnergy(){
		
		return Energy;
	}
	public float getSpeed(){
		
		return Speed;
	}
	public Draw getDrawer(){
		return drawRabbit;
	}
	public void Move(){ 
		String where_to = "Default";
		double directionRandom;
		while(Energy != 0){
			directionRandom = Math.random();
			if(directionRandom > 0 && directionRandom <= 0.25){
				where_to = "North";
			}
			else if (directionRandom > 0.25 && directionRandom <= 0.50){
				where_to = "East";
			}
			else if ( directionRandom > 0.50 && directionRandom < 0.75){
				where_to = "West";
			}
			else{
				where_to = "South";
			}
			drawRabbit.sendData(PositionX, PositionY, "Rabbit");
		switch(where_to){
			case "North":
				if((PositionY - (int)Speed)< 0){
					PositionY = 0;
				}
				else{
					PositionY-=5;
				}
				break;
			case "South":
				if((PositionY + (int)Speed)> 800){
					PositionY = 800;
				}
				else{
					PositionY+=5;
				}
				break;
			case "West":
				if((PositionX - (int)Speed)< 0){
					PositionX = 0;
				}
				else{
					PositionX-=5;
				}	
				break;
			case "East":
				if((PositionX + (int)Speed)> 1000){
					PositionX = 1000;
				}
				else{
					PositionX+=5;
				}
				break;
			case "NorthWest":
				if((PositionY - (int)Speed)< 0 && (PositionX - (int)Speed) < 0){
					PositionY = 0;
					PositionX=0;
				}
				else if((PositionY - (int)Speed)< 0 && (PositionX - (int)Speed) >= 0){
					PositionY = 0;
					PositionX-=5;
				}
				else if((PositionY - (int)Speed) >= 0 && (PositionX - (int)Speed) < 0){
					PositionY-=5;
					PositionX = 0;
				}
				else{
					PositionY-=5;
					PositionX-=5;
				}
				break;
			case "NorthEast":
				if((PositionY - (int)Speed)< 0 && (PositionX + (int)Speed) > 1000){
					PositionY = 0;
					PositionX=1000;
				}
				else if((PositionY - (int)Speed)< 0 && (PositionX + (int)Speed) >= 1000){
					PositionY = 0;
					PositionX+=5;
				}
				else if((PositionY - (int)Speed) >= 0 && (PositionX + (int)Speed) > 1000){
					PositionY-=5;
					PositionX =1000;
				}
				else{
					PositionY-=5;
					PositionX+=5;
				}
				break;
			case "SouthWest":
				if((PositionY + (int)Speed)> 800 && (PositionX - (int)Speed) < 0){
					PositionY = 800;
					PositionX=0;
				}
				else if((PositionY + (int)Speed)> 800 && (PositionX - (int)Speed) >= 0){
					PositionY = 0;
					PositionX-=5;
				}
				else if((PositionY + (int)Speed) <= 800 && (PositionX - (int)Speed) < 0){
					PositionY+=5;
					PositionX = 0;
				}
				else{
					PositionY+=5;
					PositionX-=5;
				}
				break;
			case "SouthEast":
				if((PositionY + (int)Speed)> 800 && (PositionX + (int)Speed) > 1000){
					PositionY = 800;
					PositionX = 1000;
				}
				else if((PositionY + (int)Speed)> 800 && (PositionX + (int)Speed) <= 1000){
					PositionY = 800;
					PositionX+=5;
				}
				else if((PositionY + (int)Speed) <= 800 && (PositionX + (int)Speed) > 1000){
					PositionY+=5;
					PositionX = 1000;
				}
				else{
					PositionY+=5;
					PositionX+=5;
				}
				break;
			}
			Energy -= 10*Speed;
		}
	}
	public void setPosition(int posX, int posY){
		PositionX = posX;
		PositionY = posY;
	}
	public void setDirection(String where_to){
		Direction = where_to;
	}
	public void setEnergy(float parenergy){
		Energy = parenergy;
	}
	public void setSpeed(float parspeed){
		Speed = parspeed;
	}

}