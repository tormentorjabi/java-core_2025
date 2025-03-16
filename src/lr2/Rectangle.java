package lr2;

public class Rectangle {

    private int height;
    private int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return  height;
    }

    public int getWidth(){
        return  width;
    }

    public int Area(){
        return height*width;
    }

    public int Perimeter(){
        return 2*(height+width);
    }
}
