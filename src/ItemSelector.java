import processing.core.PImage;
import processing.core.PApplet;

/**
 * Created by s159536 on 4-5-2019.
 */
public class ItemSelector extends PApplet{

    public PImage dislikeChair;
    public PImage likeChair;
    public PImage itemImage;
    public PImage itemColor1;
    public PImage itemColor2;
    public PImage reddrop;
    public PImage bluedrop;
    public PImage Chair;
    public PImage styling;
    public PImage func;

    public PImage greydrop;
    public PImage browndrop;

    public Item Chair_brnm;
    public Item Chair_brnr;
    public Item Chair_grbrt;
    public Item Chair_grnm;

    ItemSelector(){

    }

    void AssignChairs(){
        Chair_brnm = new Item(likeChair, greydrop, itemColor2, func, styling);
        Chair_brnr = new Item(dislikeChair, browndrop, itemColor2, func, styling);
        Chair_grbrt = new Item(dislikeChair, browndrop, itemColor2, func, styling);
        Chair_grnm = new Item(dislikeChair, browndrop, itemColor2, func, styling);
    }

    Item returnLikedItem(Item item){
        System.out.println("LIKED ITEM!");
        return Chair_grnm;
    }

    Item returnDislikedItem(Item item){
        System.out.println("DISLIKED ITEM!");
        return Chair_brnm;
    }
}
