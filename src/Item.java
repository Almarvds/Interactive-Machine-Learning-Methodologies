import processing.core.PImage;
import processing.core.PApplet;

/**
 * Created by s159536 on 3-5-2019.
 */
public class Item extends PApplet{

    public PImage itemImage;
    public PImage variable;
    public String typeOfVariable;
    public String Like;
    public String Dislike;
    public String likeVariable;
    public String dislikeVariable;

    Item(PImage currentItemImage, String tOV_, PImage variable_, String likeDislike, String DislikeLike, String likeLike, String dislikeDislike){
        itemImage = currentItemImage;
        variable = variable_;
        typeOfVariable = tOV_;
        Like = likeLike;
        Dislike = dislikeDislike;
        likeVariable = likeLike;
        dislikeVariable = dislikeDislike;
    }
}
