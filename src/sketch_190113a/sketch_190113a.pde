void setup(){
 for(int i = 99; i > -1; i--){
   int a = i - 1;
  print(i+ " bottles of beer on the wall, " +i+ " bottles of beer. ");
  if(i==0){
  print("Go to the store, buy some more, 99 bottles of beer on the wall. ");  
  }
  else{
  print("Take one down and pass it around, " +a+ " bottles of beer on the wall. ");
  }
 }
}