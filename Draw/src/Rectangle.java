public class Rectangle implements Drawable{
    public int score;
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score=score;
    }
    public void draw(){
        System.out.println("Draw a rectangle with four lines");
    }
    public void pick(){
        System.out.println("You chose a square");
    }
    public void color(){
        System.out.println("You chose blue");
    }

    @Override
    public int score(int score) {
        return score;
    }

}
