package Constructor;

public class Cube {

	int length,height,bredth;
	
	//this is where we create Constructor
	//C should have the same name as Class
	//C shoul not have any return value
	
	
	//now we define default Constructor
	Cube(){
		this.length=10;
		height=20;
		bredth=30;
	}
	Cube(int l,int h,int b){
		this.length=l;
		this.height=h;
		this.bredth=b;
	}
	public int getCubeVolume() {//no need to assign argument
		return (length*height*bredth);
	}
}
