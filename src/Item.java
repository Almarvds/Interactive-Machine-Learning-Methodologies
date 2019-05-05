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

    Item(PImage currentItemImage, PImage color1, PImage color2, PImage function, PImage style ){
        itemImage = currentItemImage;
        itemColor1 = color1;
        itemColor2 = color2;
        functionality = function;
        styling = style;
    }

}
