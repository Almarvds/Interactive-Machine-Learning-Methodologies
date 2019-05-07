import processing.core.PImage;
import processing.core.PApplet;

/**
 * Created by s159536 on 4-5-2019.
 */
public class ItemSelector extends PApplet{

    public PImage reddrop;
    public PImage greendrop;
    public PImage yellowdrop;
    public PImage greydrop;
    public PImage blackdrop;
    public PImage bluedrop;
    public PImage pinkdrop;
    public PImage purpledrop;
    public PImage browndrop;

    public PImage Chair;
    public PImage Classic;
    public PImage Basic;
    public PImage Modern;

    public PImage functionChair;
    public PImage functionAccesory;
    public PImage functionCloset;
    public PImage functionCouch;


    public Item Chair_brnm;
    public Item Chair_brnr;
    public Item Chair_grbrc;
    public Item Chair_grnm;

    PImage chair_Brnm;
    PImage chair_Brnr;
    PImage chair_Grbrc;
    PImage chair_Grnm;

    ItemSelector(){

    }

    void AssignChairs(){
        Chair_brnm = new Item(chair_Brnm, greydrop, null, functionChair, Modern);
        Chair_brnr = new Item(chair_Brnr, browndrop, null, functionChair, Basic);
        Chair_grbrc = new Item(chair_Grbrc, browndrop, null, functionChair, Classic);
        Chair_grnm = new Item(chair_Grnm, browndrop, null, functionChair, Modern);
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
