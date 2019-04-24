/**
 * Created by s159536 on 16-4-2019.
 */

import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;

public class Color1 extends PApplet {

    public PImage SetColor1(String color){

        PImage image = loadImage("");;
        PImage bah= loadImage("");
        String colorCase="";

        switch (colorCase) {
            case "red":  color = "red";
            image = loadImage("");
                break;
            case "blue":  color = "blue";
                image = loadImage("");
                break;
            case "green":  color = "green";
                image = loadImage("");
                break;
            case "grey":  color = "grey";
                image = loadImage("");
                break;
            default: color = "blue";
                break;
        }

        return image;
    }
}
