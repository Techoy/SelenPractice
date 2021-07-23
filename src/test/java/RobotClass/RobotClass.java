package RobotClass;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RobotClass {

    public static void main(String [] args) throws AWTException, IOException {
        Robot robot=new Robot();

        Rectangle rectangle=new Rectangle(500,500);
        BufferedImage image=robot.createScreenCapture(rectangle);
        ImageIO.write(image, "jpg", new File("src/test/resources/ScreenShotsFromRobot/robot"+System.currentTimeMillis()+"png"));

        Rectangle rectangleWindowSize=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage image1=robot.createScreenCapture(rectangle);
        ImageIO.write(image,"jpg", new File("src/test/resources/screenshot"+System.currentTimeMillis()+"png"));

    }

}
