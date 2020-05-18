import java.awt.Color;
import java.awt.Point;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {

    /**
     * Method to test zeroBlue
     */
    public static void testZeroBlue() {
        Picture beach = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    /**
     * Method to test keepOnlyBlue
     */
    public static void testKeepOnlyBlue() {
        Picture beach = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
        beach.explore();
        beach.keepOnlyBlue();
        beach.explore();
    }

    /**
     * Method to test keepOnlyRed
     */
    public static void testKeepOnlyRed() {
        Picture beach = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
        beach.explore();
        beach.keepOnlyRed();
        beach.explore();
    }

    /**
     * Method to test keepOnlyGreen
     */
    public static void testKeepOnlyGreen() {
        Picture beach = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
        beach.explore();
        beach.keepOnlyGreen();
        beach.explore();
    }

    /**
     * Method to test negate
     */
    public static void testNegate() {
        Picture beach = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
        beach.explore();
        beach.negate();
        beach.explore();
    }

    /**
     * Method to test grayscale
     */
    public static void testGrayscale() {
        Picture beach = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
        beach.explore();
        beach.grayscale();
        beach.explore();
    }

    /**
     * Method to test fixUnderwater
     */
    public static void testFixUnderwater() {
        Picture water = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\water.jpg");
        water.explore();
        water.fixUnderwater();
        water.explore();
    }

    /**
     * Method to test colorize
     *
     * @param base the color to 'filter' the picture with
     */
    public static void testColorize(Color base) {
        Picture koala = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\koala.jpg");
        koala.explore();
        koala.grayscale();
        koala.explore();
        koala.colorize(base);
        koala.explore();
    }

    /**
     * Method to test mirrorVertical
     */
    public static void testMirrorVertical() {
        Picture caterpillar = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    /**
     * Method to test mirrorVerticalRightToLeft
     */
    public static void testMirrorVerticalRightToLeft() {
        Picture caterpillar = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVerticalRightToLeft();
        caterpillar.explore();
    }

    /**
     * Method to test mirrorHorizontal
     */
    public static void testMirrorHorizontal() {
        Picture caterpillar = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontal();
        caterpillar.explore();
    }

    /**
     * Method to test mirrorHorizontalBotToTop
     */
    public static void testMirrorHorizontalBotToTop() {
        Picture caterpillar = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontalBotToTop();
        caterpillar.explore();
    }

    /**
     * Method to test mirrorDiagonal
     */
    public static void testMirrorDiagonal() {
        Picture beach = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\beach.jpg");
        beach.explore();
        beach.mirrorDiagonal();
        beach.explore();
    }

    /**
     * Method to test mirrorTemple
     */
    public static void testMirrorTemple() {
        Picture temple = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /**
     * Method to test mirrorArms
     */
    public static void testMirrorArms() {
        Picture snowman = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\snowman.jpg");
        snowman.explore();
        snowman.mirrorArms();
        snowman.explore();
    }

    /**
     * Method to test mirrorGull
     */
    public static void testMirrorGull() {
        Picture gull = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\seagull.jpg");
        gull.explore();
        gull.mirrorGull();
        gull.explore();
    }

    /**
     * Method to test clonePicturePart
     */
    public static void testClonePicturePart() {
        Picture flower = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\flower1.jpg");
        flower.explore();
        flower.clonePicturePart(new Point(0, 26), new Point(43, 68),
                new Point(29, 55));
        flower.explore();
    }

    /**
     * Method to test copy(int, int, int, int, int, int)
     */
    public static void testCopy() {
        Picture flower = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\flower1.jpg");
        flower.explore();
        flower.copy(0, 43, 26, 68, 29, 55);
        flower.explore();
    }

    /**
     * Method to test the collage method
     */
    public static void testCollage() {
        Picture canvas = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /**
     * Method to test myCollage
     */
    public static void testMyCollage() {
        Picture canvas = new Picture(225 * 4, 224 * 4);
        canvas.createCollage();
        canvas.explore();
    }

    /**
     * Method to test edgeDetection
     */
    public static void testEdgeDetection() {
        Picture swan = new Picture("\\Users\\Home\\Desktop\\AP CSA\\Unit16\\Unit16-Assignments-pixLab\\images\\swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /**
     * Main method for testing. Every class can have a main method in Java
     */
    public static void main(String[] args) {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
    	   	//testZeroBlue();
    	    //testKeepOnlyBlue();
    	    //testKeepOnlyRed();
    	    //testKeepOnlyGreen();
    	    //testNegate();
    	    //testGrayscale();
    	    //testFixUnderwater();
    	    //testMirrorVertical();
    	    //testMirrorTemple();
    	    //testMirrorArms();
    	    //testMirrorGull();
    	    //testMirrorDiagonal();
    	    //testCollage();
    	    //testCopy();
    	    //testEdgeDetection();
    	    //testEdgeDetection2();
    	    //testChromakey();
    	    //testEncodeAndDecode();
    	    //testGetCountRedOverValue(250);
    	    //testSetRedToHalfValueInTopHalf();
    	    //testClearBlueOverValue(200);
    	    //testGetAverageForColumn(0);
    }
}