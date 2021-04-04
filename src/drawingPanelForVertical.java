import javax.swing.*;
import java.awt.*;

public class drawingPanelForVertical extends JPanel {
    int width,height;
    int[]pixels;
    public drawingPanelForVertical(int width,int height,int[]pixel){

        this.width = width;
        this.height = height;
        this.pixels = pixel;

    }

    public void paintComponent(Graphics g){

            for(int col = 0;col<width;col++){
                int size = pixels[col];
                //g.setColor(new Color(255,0,0));
                g.drawLine(col,height,col,height-size);




            }

        }
    }

