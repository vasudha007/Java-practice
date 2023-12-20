package demo.interfaces;

public class Facebook implements SocialMedia{
    @Override
    public void getPostCount() {
        System.out.println("post count = 100");
    }

    @Override
    public void showNewsFeed() {
        System.out.println("news feed on the home page ");
    }

    @Override
    public void deleteUser() {
        System.out.println("Use can be deleted ");
    }
}
