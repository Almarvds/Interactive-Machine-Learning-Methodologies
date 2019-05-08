import processing.core.PImage;
import processing.core.PApplet;

/**
 * Created by s159536 on 4-5-2019.
 */
public class ItemSelector extends PApplet{


    //<editor-fold desc="categories inventory">
    public PImage reddrop;
    public PImage greendrop;
    public PImage yellowdrop;
    public PImage greydrop;
    public PImage blackdrop;
    public PImage bluedrop;
    public PImage pinkdrop;
    public PImage purpledrop;
    public PImage browndrop;

    public PImage Classic;
    public PImage Basic;
    public PImage Modern;

    public PImage functionChair;
    public PImage functionAccesory;
    public PImage functionCloset;
    public PImage functionCouch;
    //</editor-fold>

    //<editor-fold desc="public Items inventory">
    public Item chair_bnb;
    public Item chair_bnm;

    public Item chair_brnb;
    public Item chair_brnm;
    public Item chair_brnc;

    public Item chair_gnb;
    public Item chair_gnc;
    public Item chair_gnm;

    public Item chair_grbrc;
    public Item chair_grnm;

    public Item chair_pinb;
    public Item chair_pinc;
    public Item chair_pinm;

    public Item chair_punb;
    public Item chair_punc;

    public Item chair_yenb;
    public Item chair_yenc;
    public Item chair_yenm;

    public Item chair_rnm;
    public Item chair_rbb;

    //</editor-fold>

    //<editor-fold desc="PImages Inventory">
    PImage chair_Bnb;
    PImage chair_Bnm;

    PImage chair_Brnb;
    PImage chair_Brnm;
    PImage chair_Brnc;

    PImage chair_Gnb;
    PImage chair_Gnc;
    PImage chair_Gnm;

    PImage chair_Grbrc;
    PImage chair_Grnm;

    PImage chair_Pinb;
    PImage chair_Pinc;
    PImage chair_Pinm;

    PImage chair_Punb;
    PImage chair_Punc;

    PImage chair_Yenb;
    PImage chair_Yenc;
    PImage chair_Yenm;

    PImage chair_Rnm;
    PImage chair_Rbb;

    //</editor-fold>

    ItemSelector(){

    }

    void AssignChairs(){

        chair_bnb = new Item(chair_Bnb, bluedrop, null, functionChair, Basic);
        chair_bnm = new Item(chair_Bnm, bluedrop, null, functionChair, Modern);

        chair_brnb = new Item(chair_Brnb, browndrop, null, functionChair, Basic);
        chair_brnm = new Item(chair_Brnm, browndrop, null, functionChair, Modern);
        chair_brnc = new Item(chair_Brnc, browndrop, null, functionChair, Classic);

        chair_gnb = new Item(chair_Gnb, greendrop, null, functionChair, Basic);
        chair_gnc = new Item(chair_Gnc, greendrop, null, functionChair, Classic);
        chair_gnm = new Item(chair_Gnm, greendrop, null, functionChair, Modern);

        chair_grbrc = new Item(chair_Grbrc, greydrop, browndrop, functionChair, Classic);
        chair_grnm = new Item(chair_Grnm, greydrop, null, functionChair, Modern);

        chair_pinb = new Item(chair_Pinb,pinkdrop, null, functionChair, Basic);
        chair_pinc = new Item(chair_Pinc, pinkdrop, null, functionChair, Classic);
        chair_pinm = new Item(chair_Pinm, pinkdrop, null, functionChair, Modern);

        chair_punb = new Item(chair_Punb, browndrop, null, functionChair, Basic);
        chair_punc = new Item(chair_Punc, browndrop, null, functionChair, Classic);

        chair_yenb = new Item(chair_Yenb, yellowdrop, null, functionChair, Basic);
        chair_yenc = new Item(chair_Yenc, yellowdrop, null, functionChair, Classic);
        chair_yenm = new Item(chair_Yenm, yellowdrop, null, functionChair, Modern);

        chair_rnm = new Item(chair_Rnm, reddrop, null, functionChair, Modern);
        chair_rbb = new Item(chair_Rbb, reddrop, browndrop, functionChair, Basic);
    }

    Item returnLikedItem(Item item, boolean[] disabled){
        System.out.println("LIKED ITEM!");
        return chair_grnm;
    }

    Item returnDislikedItem(Item item){
        System.out.println("DISLIKED ITEM!");
        return chair_brnm;
    }
}
