public class Block {
    private int width;
    private int length;
    private int height;
    private int volume;
    private int surfaceArea;

    public Block(int[] dimensions){
        width = dimensions[0];
        length = dimensions[1];
        height = dimensions[2];
        volume = width * length * height;
        surfaceArea = 2 * (height * width + height * length + width * length);
    }

    public int getWidth(){
        return width;
    }


    public int getLength(){
        return length;
    }

    public int getHeight(){
        return height;
    }

    public int getVolume(){
        return volume;
    }

    public int getSurfaceArea(){
        return surfaceArea;
    }
}
