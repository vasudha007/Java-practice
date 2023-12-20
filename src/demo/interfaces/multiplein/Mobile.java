package demo.interfaces.multiplein;

public class Mobile implements Calculator, Camera, Computer, Torch{


    @Override
    public void calculations() {
        System.out.println("Calculating ");
    }

    @Override
    public void clickPictures() {
        System.out.println("Mobile can take pictures");
    }

    @Override
    public void makeVideos() {
        System.out.println("You can make videos in mobile");
    }

    @Override
    public void surfInternet() {
        System.out.println("You can also surf internet on mobile");
    }

    @Override
    public void giveLight() {
        System.out.println("There is a torch on mobile.");
    }
}
