

public class Rectangle {
	private int length, width;
	private boolean lengthValid=false, widthValid=false;
	
	public void drawRect(String ch){
		if(!checkValidRect()){
			System.out.println("Rectangle dimensions not properly set!");
			return;
		}
		
		for(int i=0;i<width;i++){
			for(int j=0;j<length;j++)
				System.out.print(ch);
			System.out.println();
		}
	}
	
	public int getArea(){
		if(!checkValidRect()){
			System.out.println("Rectangle dimensions not properly set!");
			return -1;
		}
		return width*length;
	}
	
	public int getPerimeter(){
		if(!checkValidRect()){
			System.out.println("Rectangle dimensions not properly set!");
			return -1;
		}
		return 2*(width+length);
	}
	
	private boolean checkValidRect(){
		return lengthValid && widthValid;
	}
	
	public int getWidth() {
		if(widthValid){
			return width;
		}
		else{
			System.out.println("Width not set!");
			return -1;
		}
	}

	public void setWidth(int width) {
		if(width>=1 && width<=30){
			this.width = width;
			widthValid=true;
		}
		else{
			System.out.println("Invalid rectangle width: "+width);
		}
	}

	public int getLength() {
		if(lengthValid){
			return length;
		}
		else{
			System.out.println("Height not set!");
			return -1;
		}
	}

	public void setLength(int height) {
		if(height>=1 && height<=30){
			this.length = height;
			lengthValid=true;
		}
		else{
			System.out.println("Invalid rectangle height: "+height);
		}
	}
}
