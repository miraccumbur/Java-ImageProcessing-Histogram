import javax.swing.*;
import java.awt.*;

public class drawingPanelForBorder extends JPanel {
    int width,height;
    int[][]pixelsBorder;
    int[][][]pixels;
    public drawingPanelForBorder(int width,int height,int[][]pixelBorder,int[][][]pixel){

        this.width = width;
        this.height = height;
        this.pixelsBorder = pixelBorder;
        this.pixels = pixel;

    }

    public void paintComponent(Graphics g){

        for(int row = 0; row < height; row++)
            for(int col = 0; col < width; col++){

                if(pixelsBorder[col][row]==25500){
                        g.setColor(new Color(255, 0, 0));
                        g.fillRect(col, row, 3, 3);
                }else{
                    g.setColor(new Color(pixels[col][row][0], pixels[col][row][1], pixels[col][row][2]));
                    g.fillRect(col, row, 1, 1);
                }




            }
    }
}
