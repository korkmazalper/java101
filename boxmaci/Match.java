package boxmaci;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Fighter starter;
    Fighter seconder;
    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public void run(){
        if(isWeightCheck()){
            if((int)(Math.random()*100)%2==0){
                starter=f1;
                seconder=f2;
            } else{
                starter=f2;
                seconder=f1;
            }
            while(this.f1.health>0 && this.f2.health>0){

                this.seconder.health=this.starter.hit(this.seconder);
                System.out.println(this.seconder.name + " Health: " + this.seconder.health );
                if(isWinner()){
                    break;
                }
                this.starter.health=this.seconder.hit(this.starter);
                System.out.println(this.starter.name + " Health: " + this.starter.health );
                if(isWinner()){
                    break;
                }
            }
        }else{
            System.out.println("Siklet uyumsuzlugu.");
        }
    }

    private boolean isWeightCheck() {
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight && this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }
    boolean isWinner(){
        if(this.f1.health==0){
            System.out.println(this.f2.name+" kazandi");
            return true;
        }else if(this.f2.health==0){
            System.out.println(this.f1.name +" kazandi");
            return true;
        }
        return false;
    }
}
