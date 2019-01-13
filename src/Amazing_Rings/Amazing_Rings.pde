void setup(){
 size(500, 500); 
   
}

void draw(){
  int r = 25;
  for(int m = 250; m < 500; m++){
  for(int i = 0; i < 10; i++){
    noFill();
   ellipse(m, 250, r, r);
   r = r + 25;
  }
  r = 25;
  }
  for(int m = 250; m > 0; m--){
  for(int i = 0; i < 10; i++){
    noFill();
   ellipse(m, 250, r, r);
   r = r + 25;
  }
  r = 25;
  }
}