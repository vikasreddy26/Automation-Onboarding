package DesignPatterns.StrategyPattern;

public class BasicCameraApp implements PhoneCameraApp {
    private Share share;

    @Override
    public void takePhoto() {
        System.out.println("Click Photo");
    }

    @Override
    public void editPhoto() {
        System.out.println("Basic Editor");
    }

    @Override
    public void savePhoto() {
        System.out.println("Save Photo");
    }

    public void setShare(Share share) {
        this.share = share;
    }

    public void sharePhoto() {
        share.share();
    }
}
