int e = 200;
void setup(){
  size(200,200);
 for (int i = 0; i < 5; i++) {
 fill(#FF0000);
 ellipse(100,100,e,e);
 e = e - 20;
 fill(0,0,0);
 ellipse(100,100,e,e);
 e = e - 20;
 }
}
