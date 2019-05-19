import processing.core.PImage;
import processing.core.PApplet;

/**
 * Created by s159536 on 3-5-2019.
 */
public class Item extends PApplet{

    public PImage itemImage;
    public String Like;
    public String Dislike;

    Item(PImage currentItemImage, String scenario1, String scenario2){
        itemImage = currentItemImage;
        Like = scenario1;
        Dislike = scenario2;
    }
}
