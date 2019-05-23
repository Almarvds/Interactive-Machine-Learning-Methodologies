
import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;
import java.util.Set;

public class test_class extends PApplet
{

    //core measurements
    int largeBlockSize;
    int numberofBlocks;

    //secondary measurements
    int sizeofBlocks;
    int largeBlockX;
    int largeBlockY;
    int blocksX;
    int blocksY;
    int distanceBetweenBlocks;

    Item item = new Item(null,null,null, null,null,null,null);
    ItemSelector itemSelector;


    //code elements
    boolean[] disabled = new boolean[0];
    boolean loadedImages;
    boolean finished;
    private boolean textItem;
    String likeDislike;

    public static void main(String[]args){
        PApplet.main("test_class",args);
    }

    public void settings(){
        size(1152,864);
    }


    public void setup(){

        largeBlockSize = 650;
        numberofBlocks = 4;

        PImage backgroundRoom = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\rooms\\Room1.jpg");
        background(backgroundRoom);
        noStroke();
        fill(0,0,0,180);
        rect(0,0,width,height);
        fill(30,30,30);
        rect(0,0,width,60);

        sizeofBlocks = (width-largeBlockSize)/4;
        largeBlockX = ((width-largeBlockSize)/2);
        largeBlockY = (height-largeBlockSize)/2;
        blocksX = sizeofBlocks;
        blocksY = largeBlockY;
        distanceBetweenBlocks = (largeBlockSize - (numberofBlocks*sizeofBlocks))/(numberofBlocks-1) ;

        fill(240,240,240,200);
        strokeWeight(5);
        stroke(0);
        rect(largeBlockX,largeBlockY,largeBlockSize,largeBlockSize,10);

        disabled = new boolean[numberofBlocks];
        setUserProfile();
        System.out.println("finished setup");
    }

    public void setUserProfile(){
        itemSelector = new ItemSelector();
        loadChairs();
        System.out.println("loaded chair images");
        loadCouches();
        System.out.println("loaded couch images");
        itemSelector.AssignChairs();
        System.out.println("Assigned chair values");
        setItem(itemSelector.couch_bnb);
    }

    public void loadChairs(){

        itemSelector.chair_Bnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\\\chair bnb.jpg");
        itemSelector.chair_Bnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair bnm.jpg");

        itemSelector.chair_Brnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair brbrb.jpg");
        itemSelector.chair_Brnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair brnm.jpg");
        itemSelector.chair_Brnc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair brnc.jpg");

        itemSelector.chair_Gnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair gnb.jpg");
        itemSelector.chair_Gnc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair gnc.jpg");
        itemSelector.chair_Gnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair gnm.jpg");

        itemSelector.chair_Grbrc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair grbrc.jpg");
        itemSelector.chair_Grnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair grnm.jpg");

        itemSelector.chair_Pinb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair pinb.jpg");
        itemSelector.chair_Pinc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair_pinc.jpg");
        itemSelector.chair_Pinm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair_pinm.jpg");

        itemSelector.chair_Punb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair_punb.jpg");
        itemSelector.chair_Punc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair_punc.jpg");

        itemSelector.chair_Yenb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair yenb.jpg");
        itemSelector.chair_Yenc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair yenc.jpg");
        itemSelector.chair_Yenm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair yenm.jpg");

        itemSelector.chair_Rnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair rnm.jpg");
        itemSelector.chair_Rbb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\chairs\\chair rbb.jpg");

    }

    public void loadCouches(){
        itemSelector.couch_Bnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_bnb.jpg");
        itemSelector.couch_Bnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch brnc.jpg");

        itemSelector.couch_Brnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch brnb.jpg");
        itemSelector.couch_Brnc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch brnc.jpg");

        itemSelector.couch_Yenb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch yenb.jpg");
        itemSelector.couch_Yenm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch yenm.jpg");

        itemSelector.couch_Gnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_gnb.jpg");
        itemSelector.couch_Gnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_gnm.jpg");

        itemSelector.couch_Grnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_grnm.jpg");

        itemSelector.couch_Pinb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_pinb.jpg");
        itemSelector.couch_Pinc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_pinc.jpg");

        itemSelector.couch_Punb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_punb.jpg");
        itemSelector.couch_Punc = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_punc.jpg");

        itemSelector.couch_Rnb = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_rnb.png");
        itemSelector.couch_Rnm = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\furnishing\\couches\\couch_rnm.jpg");
    }


    public void draw(){

        if(!textItem) {
            drawItem();
        } else {
            drawTextItem();
        }
        drawLikeandDislike();

        //check mouse for hovering the like and dislike
        if(mouseY>(largeBlockY+largeBlockSize+30)/2 && mouseY < (largeBlockY+largeBlockSize+30)/2+60){
            if(mouseX>largeBlockX +((((largeBlockSize-350)/2)-60)/2) && mouseX < largeBlockX +((((largeBlockSize-350)/2)-60)/2)+60){
                fill(240,240,240);
                circle(largeBlockX +((((largeBlockSize-350)/2)-60)/2)+30,(largeBlockY+largeBlockSize+30)/2+26,80);
                PImage like = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\buttons\\like-01.png");
                image(like, largeBlockX +((((largeBlockSize-350)/2)-60)/2),(largeBlockY+largeBlockSize+30)/2,60,60);
            }
            if(mouseX>largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)-60 && mouseX < largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)){
                fill(240,240,240);
                circle(largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)-31,(largeBlockY+largeBlockSize+30)/2+30,80);
                PImage dislike = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\buttons\\dislike-01.png");
                image(dislike, largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)-60,(largeBlockY+largeBlockSize+30)/2,60,60);
            }
        }
    }

    private void drawItem() {
        strokeWeight(5);
        stroke(0);
        int imageSize = 350;
        rect(largeBlockX -2 + (largeBlockSize-imageSize)/2 ,largeBlockY - 2 + (largeBlockSize-imageSize)/2 ,
                imageSize +4 ,imageSize + 4,2);
        image(item.itemImage,largeBlockX +(largeBlockSize-imageSize)/2,largeBlockY+(largeBlockSize-imageSize)/2,
                imageSize,imageSize);
    }

    public void mousePressed(){
        //check if either the like or dislike button is clicked whenever the mouse clicks
        if(mouseY>(largeBlockY+largeBlockSize+30)/2 && mouseY < (largeBlockY+largeBlockSize+30)/2+60){
            if(mouseX>largeBlockX +((((largeBlockSize-350)/2)-60)/2) && mouseX < largeBlockX +((((largeBlockSize-350)/2)-60)/2)+60){
                likeButtonPressed();
            }
            if(mouseX>largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)-60 && mouseX < largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)){
                dislikeButtonPressed();
            }
        }
    }

    //draw congratulations
    void drawCongratulations(){
        textAlign(CENTER);
        textSize(20);
        fill(0);
        text("Congratulations, you found the red chair!",largeBlockX + largeBlockSize/2,largeBlockY+ largeBlockSize - ((largeBlockSize-350)/4));
    }

    void drawLikeandDislike(){
    PImage like = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\buttons\\likes-02.png");
        PImage dislike = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\buttons\\dislikes-02.png");
        noStroke();
        fill(220,220,220);
        circle(largeBlockX +((((largeBlockSize-350)/2)-60)/2)+30,(largeBlockY+largeBlockSize+30)/2+26,80);
        circle(largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)-31,(largeBlockY+largeBlockSize+30)/2+30,80);
        image(like, largeBlockX +((((largeBlockSize-350)/2)-60)/2),(largeBlockY+largeBlockSize+30)/2,60,60);
        image(dislike, largeBlockX+largeBlockSize-((((largeBlockSize-350)/2)-60)/2)-60,(largeBlockY+largeBlockSize+30)/2,60,60);
    }

    void likeButtonPressed() {
        System.out.println("liked");
        System.out.println(item.variable);
        if(textItem) {
            textItem = false;
            newItem(true);
        }
        choseItem("like");
    }

    void dislikeButtonPressed(){
        System.out.println("disliked");
        System.out.println(item.variable);
        if(textItem) {
            textItem = false;
            newItem(false);
        }
        choseItem("Dislike");
        if(!finished)
            setItem(itemSelector.returnDislikedItem(item));
    }

    void choseItem(String likeOrDislike){
        textItem = true;
        if(likeOrDislike == "like"){
            likeDislike = "like";
        } else{
            likeDislike = "dislike";
        }
    }

    void drawTextItem(){
        String TextLine = "did you " + likeDislike + " it because it has this " + item.typeOfVariable + "?";
        System.out.println(TextLine);
        strokeWeight(5);
        stroke(0);
        int imageSize = 350;
        rect(largeBlockX -2 + (largeBlockSize-imageSize)/2 ,largeBlockY - 2 + (largeBlockSize-imageSize)/2 ,
                imageSize +4 ,imageSize + 4,2);
        fill(0);
        textSize(15);
        image(item.variable,largeBlockX +((largeBlockSize-imageSize)/2),largeBlockY+(largeBlockSize/2),
                imageSize,imageSize);
        textAlign(CENTER);
        text(TextLine,largeBlockX +((largeBlockSize-imageSize)/2), largeBlockY+imageSize+(largeBlockSize-imageSize)/4,imageSize,100);
    }

    void newItem(boolean likeOrDislike){
        if((item == itemSelector.chair_rbb || item == itemSelector.chair_rnm) && !finished) {
            finished = true;
            drawCongratulations();
        }
        if(!finished && likeOrDislike) {
            setItem(itemSelector.returnLikedItem(item));
        }
        if(!finished && !likeOrDislike) {
            setItem(itemSelector.returnDislikedItem(item));
        }
    }

    void setItem(Item SetItem){
        System.out.println(SetItem);
        System.out.println("setting new item");
        item = SetItem;
        System.out.println("new item set");
    }

}
