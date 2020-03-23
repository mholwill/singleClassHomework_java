public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int takeDrink() {
        int drinkVolume = 10;
        return this.volume -= drinkVolume;
    }


    public int makeEmpty() {
//        return 0;
        return this.volume - this.volume;
    }

    public int fillBottle() {
        int waterToAdd = 100 - this.volume;
        int i = waterToAdd + this.volume;
        return i;
    }
}
