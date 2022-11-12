public class Dice {
    int count;
    Dice(int count){
        this.count=count;
    }
    int roll(){
        int roll =0;
        for(int i=0;i<count;i++){
            roll+= (int) (Math.random() * 6);
        }
        return roll;
    }
}