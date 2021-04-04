public class binaryImage {

    public int[][] pixels=null;

    public void createBinary(int width,int height,int[][][] pixelsRezerv){
        pixels = new int[width][height];
        for( int col=0 ; col<width; col++){
            for( int row=0 ; row<height ; row++ ){
                int rez=(pixelsRezerv[col][row][0]+pixelsRezerv[col][row][1]+pixelsRezerv[col][row][2])/3;

                if (rez<127){
                    pixels[col][row]=0;
                }
                else {
                    pixels[col][row]=255;
                }
            }
        }

    }
}
