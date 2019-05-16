import processing.core.PImage;
import processing.core.PApplet;

/**
 * Created by s159536 on 3-5-2019.
 */
public class Item extends PApplet{

    public PImage itemImage;
    public PImage itemColor1;
    public PImage itemColor2;
    public PImage functionality;
    public PImage styling;
    public String Scenario1;
    public String Scenario2;
    public String Scenario3;
    public String Scenario4;
    public String Scenario5;
    public String Scenario6;
    public String Scenario7;

    Item(PImage currentItemImage, PImage color1, PImage color2, PImage function, PImage style, String scenario1,
         String scenario2, String scenario3, String scenario4, String scenario5, String scenario6, String scenario7){
        itemImage = currentItemImage;
        itemColor1 = color1;
        itemColor2 = color2;
        functionality = function;
        styling = style;
        Scenario1 = scenario1;
        Scenario2 = scenario2;
        Scenario3 = scenario3;
        Scenario4 = scenario4;
        Scenario5 = scenario5;
        Scenario6 = scenario6;
        Scenario7 = scenario7;
    }
}
