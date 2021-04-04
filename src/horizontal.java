public class horizontal {

    int[] horizontalCount;

    public void calculateHorizontal(int width,int height,int[][]pixels){
        horizontalCount = new int[height];
        int counter=0;
        for(int row=0;row<height;row++){
            for(int col=0;col<width;col++){
                if(pixels[col][row]==0) {
                    counter++;
                }
            }
            //System.out.println(counter);
            horizontalCount[row]=counter;
            counter=0;

        }
    }
}
