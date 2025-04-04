package Proxy;

import java.awt.*;

public class HighImage implements EstateImage {
    private String path;

    public HighImage(String path) {
        this.path = path;
        fetchHighResFromStorage();
    }

    private void fetchHighResFromStorage() {
        System.out.println("Loading high-res image " + path + " from storage...");
    }

    @Override
    public void showPreview() {
        System.out.println("Displaying preview for " + path);
    }

    @Override
    public void showHighRes() {
        System.out.println("Displaying full image " + path );
    }
}
