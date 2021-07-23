package RobotClass;

import Utilities.Driver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass2 {

    public static void pressKeyPadKeys() throws AWTException {
        Driver.getWebDriver("Chrome").get("https://www.facebook.com");
        Robot robot= new Robot();
        //robot.keyPress(KeyEvent.CTRL_DOWN_MASK);
        //robot.keyPress(KeyEvent.VK_A);

        //robot.keyRelease(KeyEvent.VK_A);
        //robot.mouseWheel(1);
       // robot.mouseMove(24, 56);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);


    }

    public static void main(String[] args) throws AWTException {
        pressKeyPadKeys();
    }
}
