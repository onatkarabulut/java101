public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int round=0;
    int whoHits=0;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                f1.damage = (int)(Math.random()*f1.maxDamage);
                f2.damage=(int)(Math.random()*f1.maxDamage);

                //int currentDamage2 = Math.random()*f2.damage;

                double whoStarts = Math.random() * 100;  //0.0 to 99.9
                System.out.println("======== YENİ ROUND ("+this.round+") =========== ");


                if (whoStarts > 50 && round == 0) { //ilk round ise ve 50 ustundeyse f2 , 50 altindaysa f1 baslasin
                    f2.health = f1.hit(f2);
                    whoHits = 1;
                    if (isWin()) {
                        break;
                    }
                } else {
                    f1.health = f2.hit(f1);
                    whoHits = 2;
                    if (isWin()) {
                        break;
                    }

                }

                if(whoHits==1){
                    f1.health = f2.hit(f1);
                    whoHits=2;
                    if (isWin()){
                        break;
                    }
                }else{
                    f2.health = f1.hit(f2);
                    whoHits=1;
                    if (isWin()){
                        break;
                    }
                }





                round++;

                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            printScore();
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f1.name);
            printScore();
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");

        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
