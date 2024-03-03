package OOP;

public class Npy {
    private int recievedGifts = 0;
    private int favorability = 0;

    public void giveAGift() {
        this.recievedGifts++;
        this.favorability++;

        System.out.println("好感度: " + this.favorability);
    }

    public void getRecievedGifts() {
        System.out.println("收到的礼物: " + this.recievedGifts);
    }

    public static void main(String[] args) {
        Npy npy = new Npy();
        npy.giveAGift();
    }
}