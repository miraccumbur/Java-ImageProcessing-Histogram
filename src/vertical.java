public class vertical {

    public int[] verticalCount;

    public void calculateVertical(int width,int height,int[][]pixels){
        verticalCount = new int[width];
        int counter=0;
        for(int col=0;col<width;col++){
            for(int row=0;row<height;row++){
                if(pixels[col][row]==0){
                    counter++;
                }
            }
            //System.out.println(counter);
            verticalCount[col]=counter;
            counter=0;

        }
    }
}
