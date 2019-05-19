import processing.core.PImage;
import processing.core.PApplet;

/**
 * Created by s159536 on 3-5-2019.
 */
public class Item extends PApplet{

    public PImage itemImage;
    public String Scenario1;
    public String Scenario2;
    public String Scenario3;


    Item(PImage currentItemImage,  String scenario1,
         String scenario2, String scenario3){
        itemImage = currentItemImage;
        Scenario1 = scenario1;
        Scenario2 = scenario2;
        Scenario3 = scenario3;
    }
}
