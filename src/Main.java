import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter a txt name:");
        String fileName= scan.nextLine();

        scanTxtFile scanTxtFile=new scanTxtFile();
        scanTxtFile.scanFile("./originalImageTXT/"+fileName+".txt");

        int width=scanTxtFile.width;
        int height=scanTxtFile.height;

        int[][][] pixelsForOriginal=scanTxtFile.pixels;

        grayscaleImage grayscaleImage = new grayscaleImage();
        grayscaleImage.createGrayScale(width,height,pixelsForOriginal);
        int[][] pixelsForGrayscale=grayscaleImage.pixels;

        binaryImage binaryImage = new binaryImage();
        binaryImage.createBinary(width,height,pixelsForOriginal);
        int[][] pixelsForBinary=binaryImage.pixels;

        vertical vertical = new vertical();
        vertical.calculateVertical(width,height,pixelsForBinary);
        int[] pixelsForVertical=vertical.verticalCount;

        horizontal horizontal = new horizontal();
        horizontal.calculateHorizontal(width,height,pixelsForBinary);
        int[] pixelsForHorizantal=horizontal.horizontalCount;

        border border = new border(width,height,pixelsForBinary);
        int[][] pixelsForBorder = border.pixelsWithBorder;

        final JFrame frame = new JFrame("Mirac Cumbur");
        frame.setSize(1920,1080);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(1,1));

        JTabbedPane tabbedpane = new JTabbedPane(JTabbedPane.TOP);

        drawingPanelFor3Byte drawingTab1 = new drawingPanelFor3Byte(width,height,pixelsForOriginal);
        drawingPanelFor2Byte drawingTab2 = new drawingPanelFor2Byte(width,height,pixelsForGrayscale);
        drawingPanelFor2Byte drawingTab3 = new drawingPanelFor2Byte(width,height,pixelsForBinary);
        drawingPanelForVertical drawingTab4 = new drawingPanelForVertical(width,height,pixelsForVertical);
        drawingPanelForHorizontal drawingTab5 = new drawingPanelForHorizontal(width,height,pixelsForHorizantal);
        drawingPanelForBorder drawingTab6 = new drawingPanelForBorder(width,height,pixelsForBorder,pixelsForOriginal);

        tabbedpane.addTab("Tab1",drawingTab1);
        tabbedpane.addTab("Tab2",drawingTab2);
        tabbedpane.addTab("Tab3",drawingTab3);
        tabbedpane.addTab("Tab4",drawingTab4);
        tabbedpane.addTab("Tab5",drawingTab5);
        tabbedpane.addTab("Tab6",drawingTab6);

        frame.getContentPane().add(tabbedpane);
    }
}
