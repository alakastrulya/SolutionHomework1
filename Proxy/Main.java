package Proxy;

public class Main {
    public static void main(String[] args) {
        // Create proxy for a regular user (not authenticated)
        ImageAccess guestImage = new ImageAccess("selfie.jpg", false);
        System.out.println("Guest browsing:");
        System.out.println();
        guestImage.showPreview();
        guestImage.showPreview();
        guestImage.showHighRes();
        guestImage.showHighRes();
        // Create proxy for an authenticated agent
        ImageAccess agentImage = new ImageAccess("house.jpg", true);
        System.out.println();
        // Agent managing images
        System.out.println("Agent managing:");
        agentImage.showPreview();
        //  updates image
        agentImage.replaceImage("house_new.jpg");
        // loads new  image
        agentImage.showHighRes();

        System.out.println();
        // Guest try to replace image
        System.out.println("Guest attempting to replace image:");
        guestImage.replaceImage("house1.jpg");  // Denied
    }
}
