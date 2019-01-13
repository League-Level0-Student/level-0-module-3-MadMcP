void setup() {
size(500, 500);  
}
  
void draw() {
int b = 250;
for(int i = 1; i < 10; i++){
if (i%2==0){
  fill(#F50707);
}
 if (i%2!=0){
  fill(#FFFFFF);
 }
  ellipse(250, 250, b, b);
b = b - 25;
}
}