import processing.core.PImage;
import processing.core.PApplet;

/**
 * Created by s159536 on 3-5-2019.
 */
public class Item extends PApplet{

    public PImage itemImage;
    public PImage variable;
    public String typeOfVariable;
    public String likeItem;
    public String dislikeItem;
    public String likeVariable;
    public String dislikeVariable;

    Item(PImage currentItemImage, String tOV_, PImage variable_, String likeItemDislikeVariable, String dislikeItemLikeVariable,
         String likeItemLikeVariable, String dislikeItemDislikeVariable){
        itemImage = currentItemImage;
        variable = variable_;
        typeOfVariable = tOV_;
        likeItem = likeItemLikeVariable;
        dislikeItem = dislikeItemDislikeVariable;
        likeVariable = dislikeItemLikeVariable;
        dislikeVariable = likeItemDislikeVariable;
    }
}
