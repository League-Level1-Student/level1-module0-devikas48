int x=50;
int y=50;
int score= 0;

void setup () {
size(400,400);


}




void draw (){
background (#7600FF);
fill(#00CEFF);
stroke(#00CEFF);
y++;
ellipse(x,y, 50, 50);
fill(#000000);
stroke(#000000);
rect(100, 329, 70, 70);
if(y>=height) {
  y=0;
  x = (int) random(width);
}
void checkCatch(x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
  
  
  
  
  
}
