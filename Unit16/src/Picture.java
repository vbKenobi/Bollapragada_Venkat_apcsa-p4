import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 *
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments
     */
    public Picture() {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();
    }

    /**
     * Constructor that takes a file name and creates the picture
     *
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName) {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     *
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width) {
        // let the parent class handle this width and height
        super(width, height);
    }

    /**
     * Constructor that takes the width, height, and a color
     *
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     * @param c the color of the desired picture
     */
    public Picture(int height, int width, Color c) {
        this(height, width);

        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] row : pixels) {
            for (Pixel elem : row) {
                elem.setColor(c);
            }
        }
    }

    /**
     * Constructor that takes a picture and creates a copy of that picture
     *
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture) {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     *
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image) {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////
    /**
     * Method to return a string with information about this picture.
     *
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    @Override
    public String toString() {
        String output = "Picture, filename " + getFileName()
                + " height " + getHeight()
                + " width " + getWidth();
        return output;
    }

    /**
     * Method to set the blue to 0
     */
    public void zeroBlue() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel pixelObj : rowArray) {
                pixelObj.setBlue(0);
            }
        }
    }

    /**
     * Method to set the red to 0
     */
    public void zeroRed() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel pixelObj : rowArray) {
                pixelObj.setRed(0);
            }
        }
    }

    /**
     * Method to set the green to 0
     */
    public void zeroGreen() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel pixelObj : rowArray) {
                pixelObj.setGreen(0);
            }
        }
    }

    /**
     * Method to keep only the blue (set red and green to 0)
     */
    public void keepOnlyBlue() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] row : pixels) {
            for (Pixel elem : row) {
                elem.setRed(0);
                elem.setGreen(0);
            }
        }
    }

    /**
     * Method to keep only the red (set blue and green to 0)
     */
    public void keepOnlyRed() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] row : pixels) {
            for (Pixel elem : row) {
                elem.setBlue(0);
                elem.setGreen(0);
            }
        }
    }

    /**
     * Method to keep only the green (set red and blue to 0)
     */
    public void keepOnlyGreen() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] row : pixels) {
            for (Pixel elem : row) {
                elem.setRed(0);
                elem.setBlue(0);
            }
        }
    }

    /**
     * Method to negate all the colors (each color = 255 - previous value)
     */
    public void negate() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] row : pixels) {
            for (Pixel elem : row) {
                elem.setRed(255 - elem.getRed());
                elem.setGreen(255 - elem.getGreen());
                elem.setBlue(255 - elem.getBlue());
            }
        }
    }

    /**
     * Method to set a picture to grayscale by setting the RG&B for a pixel to
     * the average of the previous RG&B values
     */
    public void grayscale() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] row : pixels) {
            for (Pixel elem : row) {
                int average = (int) ((elem.getRed() + elem.getGreen()
                        + elem.getBlue()) / 3.0);
                elem.setRed(average);
                elem.setGreen(average);
                elem.setBlue(average);
            }
        }
    }

    public void fixUnderwater() {
        Pixel[][] pixels = this.getPixels2D();
        int redAvg = 0, greenAvg = 0, blueAvg = 0, totalPixels = 0;

        int maxRed = 0, minRed = 255, maxGreen = 0, minGreen = 255,
                maxBlue = 0, minBlue = 255;

        for (int row = 26; row < 36; row++) {
            for (int col = 178; col < 198; col++) {
                totalPixels++;

                Pixel pixel = pixels[row][col];
                redAvg += pixel.getRed();
                greenAvg += pixel.getGreen();
                blueAvg += pixel.getBlue();

                maxRed = pixel.getRed() > maxRed ? pixel.getRed() : maxRed;
                minRed = pixel.getRed() < minRed ? pixel.getRed() : minRed;
                maxGreen = pixel.getGreen() > maxGreen ? pixel.getGreen() : maxGreen;
                minGreen = pixel.getGreen() < maxGreen ? pixel.getGreen() : maxGreen;
                maxBlue = pixel.getBlue() > maxBlue ? pixel.getBlue() : maxRed;
                minBlue = pixel.getBlue() < maxBlue ? pixel.getBlue() : minRed;
            }
        }

        redAvg = redAvg / totalPixels;
        greenAvg = greenAvg / totalPixels;
        blueAvg = blueAvg / totalPixels;

        Color averageColor = new Color(redAvg, greenAvg, blueAvg);

        int redDistance = maxRed - minRed;
        int greenDistance = maxGreen - minGreen;
        int blueDistance = maxBlue - minBlue;

        double maxDistance = Math.sqrt(redDistance * redDistance
                + greenDistance * greenDistance
                + blueDistance * blueDistance);

        for (Pixel[] row : pixels) {
            for (Pixel elem : row) {
                if (elem.colorDistance(averageColor) < maxDistance * 1.7) {
                   
                    elem.setBlue(elem.getBlue() + 50);
                } else {
                    elem.setBlue(elem.getBlue() - 50);
                }
            }
        }
    }

    /**
     * Colorizes a grayscale picture based on the given base color
     *
     * @param base the color to 'filter' the picture with
     */
    public void colorize(Color base) {
        int redPercent = base.getRed() / 255;
        int greenPercent = base.getGreen() / 255;
        int bluePercent = base.getBlue() / 255;

        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] row : pixels) {
            for (Pixel elem : row) {
                elem.setRed(elem.getRed() * redPercent);
                elem.setGreen(elem.getGreen() * greenPercent);
                elem.setBlue(elem.getBlue() * bluePercent);
            }
        }
    }

    /**
     * Method that mirrors the picture around a vertical mirror in the center of
     * the picture from left to right
     */
    public void mirrorVertical() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < width / 2; col++) {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }

    /**
     * Method that mirrors the picture around a vertical mirror in the center of
     * the picture from right to left
     */
    public void mirrorVerticalRightToLeft() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel rightPixel = null;
        Pixel leftPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = width / 2; col < width; col++) {
                rightPixel = pixels[row][col];
                leftPixel = pixels[row][width - 1 - col];
                leftPixel.setColor(rightPixel.getColor());
            }
        }
    }

    /**
     * Method that mirrors the picture around a horizontal mirror in the center
     * of the picture from top to bottom
     */
    public void mirrorHorizontal() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel botPixel = null;
        int height = pixels.length;
        for (int row = 0; row < height / 2; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                topPixel = pixels[row][col];
                botPixel = pixels[height - 1 - row][col];
                botPixel.setColor(topPixel.getColor());
            }
        }
    }

    /**
     * Method that mirrors the picture around a horizontal mirror in the center
     * of the picture from bottom to top
     */
    public void mirrorHorizontalBotToTop() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel botPixel = null;
        int height = pixels.length;
        for (int row = height / 2; row < height; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                topPixel = pixels[row][col];
                botPixel = pixels[height - 1 - row][col];
                botPixel.setColor(topPixel.getColor());
            }
        }
    }

    /**
     * Method that mirrors the picture around a diagonal mirror through the
     * center of the picture from bottom left to top right
     */
    public void mirrorDiagonal() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel diagPixel = null;
        Pixel copyPixel = null;

        int height, width;
        height = width = (pixels.length > pixels[0].length) 
                ? pixels[0].length
                : 
                pixels.length; 

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                diagPixel = pixels[col][row]; 
                copyPixel = pixels[row][col]; 
                copyPixel.setColor(diagPixel.getColor());
            }
        }

        Picture pix = new Picture(height, width);

//        pix.explore();
        pix.copy(this, 0, 0);
        pix.explore();
    }

    /**
     * Mirror just part of a picture of a temple
     */
    public void mirrorTemple() {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

 
        for (int row = 27; row < 97; row++) {

            for (int col = 13; col < mirrorPoint; col++) {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * Mirror the arms in a picture of a snowman
     */
    public void mirrorArms() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel botPixel = null;
        Point start, end;

        start = new Point(155, 100);
        end = new Point(191, 169);

        for (int row = start.x; row <= end.x; row++) {
            for (int col = start.y; col <= end.y; col++) {
                topPixel = pixels[row][col];
                botPixel = pixels[end.x - row + end.x][col];
                botPixel.setColor(topPixel.getColor());
            }
        }

        start = new Point(170, 239);
        end = new Point(197, 294);

        for (int row = start.x; row <= end.x; row++) {
            for (int col = start.y; col <= end.y; col++) {
                topPixel = pixels[row][col];
                botPixel = pixels[end.x - row + end.x][col];
                botPixel.setColor(topPixel.getColor());
            }
        }
    }

    /**
     * Mirrors the seagull in a picture of a seagull on a beach
     */
    public void mirrorGull() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Point start, end;


        start = new Point(234, 236);
        end = new Point(320, 344);

        for (int row = start.x; row <= end.x; row++) {
            for (int col = start.y; col <= end.y; col++) {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row + 15][end.y - col + end.y + 15];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }

    /**
     * Copies a portion of a picture to another location on the picture
     *
     * @param start the top left corner of the area to copy
     * @param end the bottom right corner of the area to copy
     * @param insert the top left corner of the area to paste to
     */
    public void clonePicturePart(Point start, Point end, Point insert) {
        Pixel[][] pixels = this.getPixels2D();

 
        Picture toCopy = new Picture(end.x - start.x, end.y - start.y);
        Pixel[][] toCopyPixels = toCopy.getPixels2D();
        for (int row = 0; row < end.x - start.x; row++) {
            for (int col = 0; col < end.y - start.y; col++) {
                toCopyPixels[row][col].setColor(
                        pixels[row + start.x][col + start.y].getColor());
            }
        }

        for (int row = 0; row < end.x - start.x; row++) {
            for (int col = 0; col < end.y - start.y; col++) {
                if (row + insert.x >= this.getWidth()
                        || col + insert.y >= this.getHeight()) {
                    break;
                }
                pixels[row + insert.x][col + insert.y].setColor(
                        toCopyPixels[row][col].getColor());
            }
        }
    }

    /**
     * copy from the passed fromPic to the specified startRow and startCol in
     * the current picture
     *
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic,
            int startRow, int startCol) {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow;
                fromRow < fromPixels.length
                && toRow < toPixels.length;
                fromRow++, toRow++) {
            for (int fromCol = 0, toCol = startCol;
                    fromCol < fromPixels[0].length
                    && toCol < toPixels[0].length;
                    fromCol++, toCol++) {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }
    }

    /**
     * Copies a portion of the picture between (startRow, startCol) and (endRow,
     * endCol) to (insertRow, insertCol)
     *
     * @param startRow the row of the top left corner of the area to copy
     * @param endRow the row of the bottom right corner of the area to copy
     * @param startCol the column of the top left corner of the area to copy
     * @param endCol the column of the bottom right corner of the area to copy
     * @param insertRow the row of the top left corner of the area to paste to
     * @param insertCol the column of the top left corner of the area to paste
     * to
     */
    public void copy(int startRow, int endRow, int startCol, int endCol,
            int insertRow, int insertCol) {
        clonePicturePart(new Point(startRow, startCol),
                new Point(endRow, endCol), new Point(insertRow, insertCol));
    }

    /**
     * Method to create a collage of several pictures
     */
    public void createCollage() {
        Picture flower1 = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\flower1.jpg");
        Picture flower2 = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\flower2.jpg");
        this.copy(flower1, 0, 0);
        this.copy(flower2, 100, 0);
        this.copy(flower1, 200, 0);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue, 300, 0);
        this.copy(flower1, 400, 0);
        this.copy(flower2, 500, 0);
        this.mirrorVertical();
        this.write("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\collage.jpg");
    }


    public void myCollage() {
        Picture paintingrey = new Picture("myCollage painting rey.jpg");
        Picture ren = new Picture("myCollage ren.jpg");
        Picture flower = new Picture("myCollage flower.png");

        Picture temp = new Picture(paintingrey);
        this.copy(temp.scale(4, 4), 0, 0);

        temp = new Picture(this);
        temp.keepOnlyGreen();
        this.copy(temp.scale(0.205, 0.205), 342, 530);

        temp = new Picture(this);
        temp.keepOnlyRed();
        this.copy(temp.scale(0.041, 0.041), 414, 640);

        temp = new Picture(ren);
        temp.zeroBlue();
        temp.negate();
        Picture.replaceColor(temp, new Color(17, 13, 255), new Color(203, 251, 255));
        this.copy(temp.scale(0.5, 0.5), 50, 640);


        temp = new Picture(flower);
        temp.zeroRed();
        Picture.replaceColor(temp, new Color(0, 0, 0), new Color(79, 129, 1));
        this.copy(temp.scale(0.15, 0.15), 335, 279);


        temp = new Picture(ren);
        temp.grayscale();
        Picture.replaceColor(temp, new Color(244, 244, 244), new Color(0, 251, 0));
        this.copy(temp.scale(0.15, 0.15), 345, 625);


        this.mirrorHorizontal();


        temp = new Picture(ren);
        temp.zeroBlue();
        Picture.replaceColor(temp, new Color(238, 242, 0), new Color(203, 251, 255));
        this.copy(temp.scale(0.5, 0.5), 50, 640);


        temp = new Picture(flower);
        temp.zeroGreen();
        Picture.replaceColor(temp, new Color(0, 0, 0), new Color(79, 128, 1));
        this.copy(temp.scale(0.15, 0.15), 335, 279);


        temp = new Picture(ren.getWidth(), ren.getHeight(), new Color(0, 251, 0));
        this.copy(temp.scale(0.15, 0.15), 345, 625);


        temp = new Picture(flower);
        Picture.replaceColor(temp, new Color(0, 0, 0), new Color(90, 141, 63));
        temp.zeroBlue();
        this.copy(temp.scale(0.05, 0.05), 225, 773);

        this.write("myCollage.jpg");
    }

    /**
     * Method to replace a particular color with another color
     *
     * @param p the picture to replace colors in
     * @param toReplace the color to scan for and replace
     * @param replacement the color to replace with
     */
    public static void replaceColor(Picture p, Color toReplace, Color replacement) {
        Pixel[][] pixels = p.getPixels2D();

        for (Pixel[] row : pixels) {
            for (Pixel elem : row) {
                if (elem.getColor().equals(toReplace)) {
                    elem.setColor(replacement);
                }
            }
        }
    }

    /**
     * Method to show large changes in color
     *
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist) {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0;
                    col < pixels[0].length - 1; col++) {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col + 1];
                rightColor = rightPixel.getColor();
                if (leftPixel.colorDistance(rightColor) > edgeDist) {
                    leftPixel.setColor(Color.BLACK);
                } else {
                    leftPixel.setColor(Color.WHITE);
                }
            }
        }
    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }
}