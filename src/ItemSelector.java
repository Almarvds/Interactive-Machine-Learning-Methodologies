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

    //couches

    public Item couch_bnb;
    public Item couch_bnm;

    public Item couch_brnb;
    public Item couch_brnc;

    public Item couch_yenb;
    public Item couch_yenm;

    public Item couch_gnb;
    public Item couch_gnm;

    public Item couch_grnm;

    public Item couch_pinb;
    public Item couch_pinc;

    public Item couch_punb;

    public Item couch_rnb;
    public Item couch_rnm;


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

    //couches

    PImage couch_Bnb;
    PImage couch_Bnm;

    PImage couch_Brnb;
    PImage couch_Brnc;

    PImage couch_Yenb;
    PImage couch_Yenm;

    PImage couch_Gnb;
    PImage couch_Gnm;

    PImage couch_Grnm;

    PImage couch_Pinb;
    PImage couch_Pinc;

    PImage couch_Punb;

    PImage couch_Rnb;
    PImage couch_Rnm;

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

        //couches

        couch_bnb = new Item(couch_Bnb, bluedrop, null, functionCouch, Basic);
        couch_bnm = new Item(couch_Bnm, bluedrop, null, functionCouch, Modern);

        couch_brnb = new Item(couch_Brnb, browndrop, null, functionCouch, Basic);
        couch_brnc = new Item(couch_Brnc, browndrop, null, functionCouch, Classic);

        couch_yenb = new Item(couch_Yenb, yellowdrop, null, functionCouch, Basic);
        couch_yenm = new Item(couch_Yenm, yellowdrop, null, functionCouch, Modern);

        couch_gnb = new Item(couch_Gnb, greendrop, null, functionCouch, Basic);
        couch_gnm = new Item(couch_Gnm, greendrop, null, functionCouch, Modern);

        couch_grnm = new Item(couch_Grnm, greydrop, null, functionCouch, Modern);

        couch_pinb = new Item(couch_Pinb, pinkdrop, null, functionCouch, Basic);
        couch_pinc = new Item(couch_Pinc, pinkdrop, null, functionCouch, Classic);

        couch_punb = new Item(couch_Punb, purpledrop, null, functionCouch, Basic);

        couch_rnb = new Item(couch_Rnb, reddrop, null, functionCouch, Basic);
        couch_rnm = new Item(couch_Rnm, reddrop, null, functionCouch, Modern);

    }

    Item returnLikedItem(Item item, boolean[] enabled){
        System.out.println("LIKED ITEM!");
        return item;
    }

    Item DislikedColor(Item item){
       return item;
    }

    Item DislikedColornType(Item item){
        return item;
    }

    Item DislikedColornStyle(Item item){
        return item;
    }

    Item DislikedColornTypenStyle(Item item){
        return item;
    }

    Item DislikedType(Item item){
        return item;
    }

    Item DislikedTypenStyle(Item item){
        return item;
    }

    Item DislikedStyle(Item item){
        return item;
    }

    Item returnDislikedItem(Item item, boolean[] enabled){
        System.out.println("DISLIKED ITEM!");
        if(enabled[0] == true){
            if(enabled[2]==true){
                if (enabled [3] == true){
                    return DislikedColornTypenStyle(item);
                }
                return DislikedColornType(item);
            }
            if(enabled [3] == true){
                return DislikedColornStyle(item);
            }
            return DislikedColor(item);
        }
        if(enabled[2] == true){
            if(enabled [3] == true){
                return DislikedTypenStyle(item);
            }
            return DislikedType(item);
        }
        if(enabled[3] == true){
            DislikedStyle(item);
        }
        return chair_brnm;
    }
}
