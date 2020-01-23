void setup(){
 size(1000,1000); 
 
}
int x = 200;
int y = 500;
int x2 = 800;
int s = 400;
void draw(){
  background(#C1C1C1);
  noFill();
  for (int i = 0; i < 100; i++) {
    ellipse(x,y,s,s);
    s = s - 4;
  }
  s = 400;
  for (int i = 0; i < 100; i++) {
    ellipse(x2,y,s,s);
    s = s - 4;
  }
  x = x + 1;
  x2 = x2 - 1;
  s = 400;
  
}
