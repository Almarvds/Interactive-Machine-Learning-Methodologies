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

        chair_bnb = new Item(chair_Bnb,"chair_gnm",  "chair_gnb", "chair_grbrc");
        chair_bnm = new Item(chair_Bnm,"chair_bnb","couch_bnm", "chair yenb");

        chair_brnb = new Item(chair_Brnb,"chair_brnm", "chair_rbb", "chair_brnc");
        chair_brnm = new Item(chair_Brnm,"chair_brnc", "chair_rnm", "chair_punb");
        chair_brnc = new Item(chair_Brnc,"couch_brnb", "chair_punb", "chair_punc");

        chair_gnb = new Item(chair_Gnb,"chair yenb", "chair_pinc", "chair_gnc");
        chair_gnc = new Item(chair_Gnc,"chair_bnm", "chair_bnb", "chair_punb");
        chair_gnm = new Item(chair_Gnm,"chair yenb", "chair_pinc", "chair_gnc");

        chair_grbrc = new Item(chair_Grbrc,"chair pinb", "couch_grnm", "chair yenc");
        chair_grnm = new Item(chair_Grnm,"chair_bnm", "chair_bnb", "chair_bnb");

        chair_pinb = new Item(chair_Pinb,"chair_pinc", "chair_pinm", "chair_punb");
        chair_pinc = new Item(chair_Pinc,"couch_pinc", "chair_punc", "chair_rbb");
        chair_pinm = new Item(chair_Pinm,"chair_punc", "couch_pinb", "chair_rnm");

        chair_punb = new Item(chair_Punb,"chair_rbb", "chair_punc", "couch_punb");
        chair_punc = new Item(chair_Punc,"chair_rbb", "chair_rnm", "couch_punc");

        chair_yenb = new Item(chair_Yenb,"chair yenc", "chair yenm", "chair pinb");
        chair_yenc = new Item(chair_Yenc,"chair_bnm", "chair_bnb", "chair_bnb");
        chair_yenm = new Item(chair_Yenm,"chair_bnm", "chair_bnb", "chair_bnb");

        chair_rnm = new Item(chair_Rnm,"couch yenb", "couch yenm", "chair yenb");
        chair_rbb = new Item(chair_Rbb,"couch yenm", "couch yenb", "chair yenm");

        //couches

        couch_bnb = new Item(couch_Bnb,"chair_gnm", "chair yenb", "couch_gnm");
        couch_bnm = new Item(couch_Bnm,"chair_bnm", "couch_bnb", "couch yenb");

        couch_brnb = new Item(couch_Brnb,"couch_brnc", "couch_punb", "chair_brnb");
        couch_brnc = new Item(couch_Brnc,"chair_brnm", "couch_punb", "chair_brnc");

        couch_yenb = new Item(couch_Yenb,"chair_bnm", "chair_bnb", "chair_bnb");
        couch_yenm = new Item(couch_Yenm,"chair_bnm", "chair_bnb", "chair_bnb");

        couch_gnb = new Item(couch_Gnb,"couch_gnm", "couch_bnb", "chair_gnb");
        couch_gnm = new Item(couch_Gnm,"couch_bnm", "chair_bnb", "couch yenm");

        couch_grnm = new Item(couch_Grnm,"chair_bnm", "chair_bnb", "chair_bnb");

        couch_pinb = new Item(couch_Pinb,"chair_rbb", "chair rnm", "couch_rnm");
        couch_pinc = new Item(couch_Pinc,"chair_punc", "chair_punb", "couch_punb");

        couch_punb = new Item(couch_Punb,"chair_punb", "couch_punc", "chair_punc");
        couch_punc = new Item(couch_Punc,"couch_rnb", "chair_pinc", "couch_rnm");

        couch_rnb = new Item(couch_Rnb,"couch yenb", "chair_rbb", "couch_rnm");
        couch_rnm = new Item(couch_Rnm,"couch_rnb", "chair_rnm", "chair_rbb");

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
        if (name == "couch_punc"){ return couch_punc;}
        if (name == "couch_rnb"){ return couch_rnb;}
         if (name == "couch_rnm"){ return couch_rnm;}

        return null;
    }

    Item[] ItemChosen(Item item){
        Item[] items= new Item[3];
        items[0] = StringConverter(item.Scenario1);
        items[1] = StringConverter(item.Scenario2);
        items[2] = StringConverter(item.Scenario3);
        System.out.println("PICKED ITEM!");
        return items;
    }
}
