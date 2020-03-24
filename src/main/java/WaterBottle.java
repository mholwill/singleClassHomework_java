public class WaterBottle {

    private int volume;

//    public WaterBottle(int volume){
//        this.volume = volume;
//    }
//
//    public int getVolume() {
//        return this.volume;
//    }
//
//    public int takeDrink() {
//        int drinkVolume = 10;
//        return this.volume -= drinkVolume;
//    }
//
//
//    public void makeEmpty() {
//        this.volume = 0;
//    }
//
//    public int fillBottle() {
//        int waterToAdd = 100 - this.volume;
//        int i = waterToAdd + this.volume;
//        return i;
//    }

        public WaterBottle() {
            this.volume = 100;
        }

        public void takeDrink(){
            this.volume -= 10;
        }

        public void makeEmpty(){
            this.volume = 0;
        }

        public void fillBottle(){
            this.volume = 100;
        }

        public int getVolume() {
            return volume;
        }
}
