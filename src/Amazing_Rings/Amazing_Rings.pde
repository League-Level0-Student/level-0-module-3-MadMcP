int ring1 = 0;
int ring2 = 500;
void setup(){
 size(500, 500); 
}

void draw(){
    int r = 25;
    background(255);
  for(int i = 0; i < 10; i++){
    noFill();
   ellipse(ring1, 250, r, r);
   r = r + 25;
  }
  r = 25;
  for(int i = 0; i < 10; i++){
    noFill();
   ellipse(ring2, 250, r, r);
   r = r + 25;
  }
  r = 25;
ring1 = ring1 + 1;
ring2 = ring2 - 1;
}