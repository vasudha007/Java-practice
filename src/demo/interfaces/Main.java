package demo.interfaces;

public class Main{
    public static void main(String[] args) {
        SocialMedia facebook = new Facebook();
        facebook.deleteUser();
        facebook.getPostCount();
        facebook.showNewsFeed();

        SocialMedia instagram = new Instagram();
        instagram.deleteUser();
        instagram.showNewsFeed();
        instagram.getPostCount();

        SocialMedia snapchat = new Snapchat();
        snapchat.deleteUser();
        snapchat.showNewsFeed();
        snapchat.getPostCount();

    }
}
