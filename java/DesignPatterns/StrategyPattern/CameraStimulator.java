package DesignPatterns.StrategyPattern;

public class CameraStimulator {
    public static void main(String[] args) {
        System.out.println("************* CameraPlus App *************");
        CameraPlusApp cameraPlusApp = new CameraPlusApp();
        cameraPlusApp.editPhoto();
        cameraPlusApp.savePhoto();
        cameraPlusApp.setShare(new ShareByText());
        cameraPlusApp.sharePhoto();
        System.out.println("*********** Basic Camera App ***************");
        BasicCameraApp basicCameraApp = new BasicCameraApp();
        basicCameraApp.editPhoto();
        basicCameraApp.takePhoto();
        basicCameraApp.setShare(new ShareByEmail());
        basicCameraApp.sharePhoto();
    }
}
