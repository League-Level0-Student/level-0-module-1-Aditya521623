
void setup() {
  size(400, 400);
PImage face = loadImage("face.jpeg");
face.resize(width, height);
image(face, 0, 0);
}
void draw() {
fill(mouseX-mouseY, mouseY-mouseX, mouseY);
  ellipse(149, 172, 30, 30);
  fill(mouseX, mouseY, mouseX + mouseY);
  ellipse(255, 174, 30, 30);
  fill(0,0,0);
  ellipse(149,172,10,10);
  fill(0,0,0);
  ellipse(255,174,10,10);
}
