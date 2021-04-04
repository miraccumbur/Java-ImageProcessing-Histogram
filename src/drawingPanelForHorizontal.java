import javax.swing.*;
import java.awt.*;

public class drawingPanelForHorizontal extends JPanel {
    int width,height;
    int[]pixels;
    public drawingPanelForHorizontal(int width,int height,int[]pixel){

        this.width = width;
        this.height = height;
        this.pixels = pixel;

    }

    public void paintComponent(Graphics g){

        for(int row = 0;row<height;row++){
            int size = pixels[row];
            g.drawLine(0,row,size,row);
        }
    }
}

