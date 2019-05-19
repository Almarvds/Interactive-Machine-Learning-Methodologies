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
    public Item couch_punc;

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
    PImage couch_Punc;

    PImage couch_Rnb;
    PImage couch_Rnm;

    //</editor-fold>

    ItemSelector(){

    }                                         

    void AssignChairs(){

        chair_bnb = new Item(chair_Bnb, bluedrop, null, functionChair, Basic, "couch_gnm", "couch_gnb");
        chair_bnm = new Item(chair_Bnm, bluedrop, null, functionChair, Modern, "couch_gnm", "couch_gnb");

        chair_brnb = new Item(chair_Brnb, browndrop, null, functionChair, Basic, "couch_gnm", "couch_gnb");
        chair_brnm = new Item(chair_Brnm, browndrop, null, functionChair, Modern, "chair pinb", "chair_grnm");
        chair_brnc = new Item(chair_Brnc, browndrop, null, functionChair, Classic, "chair pinb", "chair_grnm");

        chair_gnb = new Item(chair_Gnb, greendrop, null, functionChair, Basic, "chair_gnc", "couch_pinc");
        chair_gnc = new Item(chair_Gnc, greendrop, null, functionChair, Classic, "chair_gnm", "chair_pinc");
        chair_gnm = new Item(chair_Gnm, greendrop, null, functionChair, Modern, "couch_gnm", "couch_gnb");

        chair_grbrc = new Item(chair_Grbrc, greydrop, browndrop, functionChair, Classic, "couch_gnm", "couch_gnb");
        chair_grnm = new Item(chair_Grnm, greydrop, null, functionChair, Modern, "chair_grbrc", "chair_punc");

        chair_pinb = new Item(chair_Pinb,pinkdrop, null, functionChair, Basic, "chair_pinc", "chair_punc");
        chair_pinc = new Item(chair_Pinc, pinkdrop, null, functionChair, Classic, "chair_rnm", "chair_rbb");
        chair_pinm = new Item(chair_Pinm, pinkdrop, null, functionChair, Modern, "couch_rnm", "couch_gnb");

        chair_punb = new Item(chair_Punb, purpledrop, null, functionChair, Basic, "chair pinb", "chair_brnm");
        chair_punc = new Item(chair_Punc, purpledrop, null, functionChair, Classic, "chair_rnm", "chair_rbb");

        chair_yenb = new Item(chair_Yenb, yellowdrop, null, functionChair, Basic, "couch_gnm", "couch_gnb");
        chair_yenc = new Item(chair_Yenc, yellowdrop, null, functionChair, Classic, "couch_gnm", "couch_gnb");
        chair_yenm = new Item(chair_Yenm, yellowdrop, null, functionChair, Modern, "couch_gnm", "couch_gnb");

        chair_rnm = new Item(chair_Rnm, reddrop, null, functionChair, Modern, "couch_gnm", "couch_gnb");
        chair_rbb = new Item(chair_Rbb, reddrop, browndrop, functionChair, Basic, "couch_gnm", "couch_gnb");
        //couches

        couch_bnb = new Item(couch_Bnb, bluedrop, null, functionCouch, Basic, "couch_bnm", "couch yenm");
        couch_bnm = new Item(couch_Bnm, bluedrop, null, functionCouch, Modern, "couch_gnm", "couch yenb");

        couch_brnb = new Item(couch_Brnb, browndrop, null, functionCouch, Basic, "couch_gnm", "couch_gnb");
        couch_brnc = new Item(couch_Brnc, browndrop, null, functionCouch, Classic, "couch_gnm", "couch_gnb");

        couch_yenb = new Item(couch_Yenb, yellowdrop, null, functionCouch, Basic, "couch yenm", "couch_gnb");
        couch_yenm = new Item(couch_Yenm, yellowdrop, null, functionCouch, Modern, "couch_gnm", "chair_punb");

        couch_gnb = new Item(couch_Gnb, greendrop, null, functionCouch, Basic, "couch_gnm", "chair_punb");
        couch_gnm = new Item(couch_Gnm, greendrop, null, functionCouch, Modern, "couch_gnb", "chair_brnc");

        couch_grnm = new Item(couch_Grnm, greydrop, null, functionCouch, Modern, "couch_gnm", "couch_gnb");

        couch_pinb = new Item(couch_Pinb, pinkdrop, null, functionCouch, Basic, "couch_gnm", "couch_gnb");
        couch_pinc = new Item(couch_Pinc, pinkdrop, null, functionCouch, Classic, "chair_pinc", "couch_brnb");

        couch_punb = new Item(couch_Punb, purpledrop, null, functionCouch, Basic, "couch_gnm", "couch_gnb");
        couch_punc = new Item(couch_Punc, purpledrop, null, functionCouch, Classic, "couch_gnm", "couch_gnb");

        couch_rnb = new Item(couch_Rnb, reddrop, null, functionCouch, Basic, "couch_gnm", "couch_gnb");
        couch_rnm = new Item(couch_Rnm, reddrop, null, functionCouch, Modern, "couch_gnm", "couch_gnb");
    }

    Item returnLikedItem(Item item){
        System.out.println("LIKED ITEM!");
        return StringConverter(item.Like);
    }

    Item StringConverter(String name){
        if (name == "chair_bnb"){ return  chair_bnb;}
        if (name == "chair_bnm"){ return  chair_bnm;}
        if (name == "chair_brnb"){ return chair_brnb;}
        if (name == "chair_brnm"){ return chair_brnm;}
        if (name == "chair_brnc"){ return chair_brnc;}
        if (name == "chair_gnb"){ return  chair_gnb;}
        if (name == "chair_gnc"){ return  chair_gnc;}
        if (name == "chair_gnm"){ return  chair_gnm;}
        if (name == "chair_grbrc"){ return chair_grbrc;}
        if (name == "chair_grnm"){ return chair_grnm;}
        if (name == "chair pinb"){ return chair_pinb;}
        if (name == "chair_pinc"){ return chair_pinc;}
        if (name == "chair_pinm"){ return chair_pinm;}
        if (name == "chair_punb"){ return chair_punb;}
        if (name == "chair_punc"){ return chair_punc;}
         if (name == "chair yenb"){ return chair_yenb;}
         if (name == "chair yenc"){ return chair_yenc;}
         if (name == "chair yenm"){ return chair_yenm;}
         if (name == "chair_rnm"){ return chair_rnm;}
         if (name == "chair_rbb"){ return chair_rbb;}

         if (name == "couch_bnb"){ return couch_bnb;}
         if (name == "couch_bnm"){ return couch_bnm;}
         if (name == "couch_brnb"){ return couch_brnb;}
         if (name == "couch_brnc"){ return couch_brnc;}
         if (name == "couch yenb"){ return couch_yenb;}
         if (name == "couch yenm"){ return couch_yenm;}
         if (name == "couch_gnb"){ return  couch_gnb;}
         if (name == "couch_gnm"){ return  couch_gnm;}
         if (name == "couch_grnm"){ return couch_grnm;}
         if (name == "couch_pinb"){ return couch_pinb;}
         if (name == "couch_pinc"){ return couch_pinc;}
         if (name == "couch_punb"){ return couch_punb;}
         if (name == "couch_rnb"){ return couch_rnb;}
         if (name == "couch_rnm"){ return couch_rnm;}

        return null;
    }

    Item returnDislikedItem(Item item){
        System.out.println("DISLIKED ITEM!");
        return StringConverter(item.Dislike);
    }
}
