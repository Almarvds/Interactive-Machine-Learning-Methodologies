
import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;

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

    //code elements
    boolean[] enabled = new boolean[0];

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

        sizeofBlocks = (width-largeBlockSize)/4;
        largeBlockX = ((width-largeBlockSize)/4)*3;
        largeBlockY = (height-largeBlockSize)/2;
        blocksX = sizeofBlocks;
        blocksY = largeBlockY;
        distanceBetweenBlocks = (largeBlockSize - (numberofBlocks*sizeofBlocks))/(numberofBlocks-1) ;

        noStroke();
        fill(240,240,240);
        rect(largeBlockX,largeBlockY,largeBlockSize,largeBlockSize,10);

        enabled = new boolean[numberofBlocks];
    }

    public void draw(){
        for(int i=0;i<numberofBlocks;i++){
            drawCategory(blocksX,blocksY+((sizeofBlocks+distanceBetweenBlocks)*i));
            if(enabled[i] == true){
                drawX(i);
            }
        }
        drawLikeandDislike();

        //check mouse for hovering categories
        if(mouseX>sizeofBlocks && mouseX<sizeofBlocks*2) {
            for (int i = 0; i < numberofBlocks; i++) {
                if (mouseY > blocksY + ((sizeofBlocks + distanceBetweenBlocks) * i) && mouseY < blocksY + sizeofBlocks +
                        ((sizeofBlocks + distanceBetweenBlocks) * i)) {
                    hoverCategory(i);
                }
            }
        }

        //check mouse for hovering the like and dislike
        if(mouseY>(largeBlockY+largeBlockSize+20)/2 && mouseY < (largeBlockY+largeBlockSize+20)/2+40){
            fill(200);
            if(mouseX>largeBlockX+20 && mouseX < largeBlockX + 60){
                rect(largeBlockX+20,(largeBlockY+largeBlockSize+20)/2,40,40);
            }
            if(mouseX>largeBlockX+largeBlockSize-60 && mouseX < largeBlockX+largeBlockSize-20){
                rect(largeBlockX+largeBlockSize-60,(largeBlockY+largeBlockSize+20)/2,40,40);
            }
        }
    }

    public void mousePressed(){
        if(mouseX>sizeofBlocks && mouseX<sizeofBlocks*2){
            for(int i=0;i<numberofBlocks;i++){
                if(mouseY>blocksY+((sizeofBlocks+distanceBetweenBlocks)*i) && mouseY<blocksY+ sizeofBlocks +
                        ((sizeofBlocks+distanceBetweenBlocks)*i)){
                    clickedCategory(i);
                }
            }
        }
    }

    //draws categories
    void drawCategory(float a, float b){
        noStroke();
        fill(240,240,240);
        rect(a,b,sizeofBlocks,sizeofBlocks,10);
    }

    //draws hover effects
    void hoverCategory(int i){
        fill(255,255,255,200);
        rect(blocksX,blocksY+((sizeofBlocks+distanceBetweenBlocks)*i),sizeofBlocks,sizeofBlocks,10);
    }

    void drawX(int i){
        PImage redX = loadImage("C:\\Users\\s159536\\IdeaProjects\\Furnishing_App\\Assets\\images\\buttons\\redX.png");
        image(redX,blocksX+10,blocksY+((sizeofBlocks+distanceBetweenBlocks)*i)+10,sizeofBlocks-20,sizeofBlocks-20);
    }

    //disables or enables categories when clicked
    void clickedCategory(int i){
        enabled[i] =! enabled[i];
    }

    void drawLikeandDislike(){
        fill(0);
        rect(largeBlockX+20,(largeBlockY+largeBlockSize+20)/2,40,40);
        rect(largeBlockX+largeBlockSize-60,(largeBlockY+largeBlockSize+20)/2,40,40);
    }

    void likeButtonPressed(){

    }

    void dislikeButtonPressed(){

    }

}
