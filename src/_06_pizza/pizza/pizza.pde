import ddf.minim.*;
Minim minim;
AudioPlayer sound; 
void setup() {
  size(500, 500);
  fill(#DBD482);
  ellipse(250, 250, 300, 250);
  fill(#FF0000);
  ellipse(250, 250, 275, 225);
  fill(#FFF700);
  ellipse(250, 250, 250, 200);
  minim = new Minim(this); 
  sound = minim.loadFile("ding.wav"); 
}
void draw() {
  PImage crack = loadImage("download.png");
  crack.resize(50, 50);
  //image(crack, 290, 200);

  PImage pet = loadImage("petzel.png");
  pet.resize(50, 50);
  //  image(pet, 180, 200);

  if (mousePressed) {


    if (mouseButton == LEFT) {
      image(pet, mouseX, mouseY);
    } else
    {
      image(crack, mouseX, mouseY);
    }
  }
  
}
