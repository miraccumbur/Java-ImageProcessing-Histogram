public class border {

    public int[][] pixelsWithBorder;
    public int width,height;
    public int [][]pixels;

    public border(int width,int height,int[][]pixel){
        this.width=width;
        this.height=height;
        this.pixels=pixel;
        this.pixelsWithBorder = new int[width][height];

        createHorizontalBorder();
        createVerticalBorder();
    }

    public void createHorizontalBorder(){

        for(int row=0;row<height;row++){
            for(int col=0;col<width;col++){
                if(pixels[col][row]==0) {
                    if(col==0){
                        if(pixels[col+1][row]==255){
                            //25500 for red like 255,0,0
                            pixelsWithBorder[col+1][row]=25500;
                        }
                    }
                    else if(col==width-1){
                        if(pixels[col-1][row]==255){
                            //25500 for red like 255,0,0
                            pixelsWithBorder[col-1][row]=25500;
                        }
                    }
                    else{
                        if(pixels[col+1][row]==255){
                            //25500 for red like 255,0,0
                            pixelsWithBorder[col+1][row]=25500;
                        }
                        if(pixels[col-1][row]==255){
                            //25500 for red like 255,0,0
                            pixelsWithBorder[col-1][row]=25500;
                        }
                    }

                }

            }

        }
    }

    public void createVerticalBorder(){
        for(int col=0;col<width;col++){
            for(int row=0;row<height;row++){
                if(pixels[col][row]==0) {
                    if (row == 0) {
                        if (pixels[col][row + 1] == 255) {
                            //25500 for red like 255,0,0
                            pixelsWithBorder[col][row + 1] = 25500;
                        }
                    } else if (row == height - 1) {
                        if (pixels[col][row - 1] == 255) {
                            //25500 for red like 255,0,0
                            pixelsWithBorder[col][row - 1] = 25500;
                        }
                    } else {
                        if (pixels[col][row + 1] == 255) {
                            //25500 for red like 255,0,0
                            pixelsWithBorder[col][row + 1] = 25500;
                        }
                        if (pixels[col][row - 1] == 255) {
                            //25500 for red like 255,0,0
                            pixelsWithBorder[col][row - 1] = 25500;
                        }
                    }
                }



            }

        }

    }


}
