package demo.interfaces;

public class Instagram implements SocialMedia{
    @Override
    public void getPostCount() {
        System.out.println("Post count = 200");
    }

    @Override
    public void showNewsFeed() {
        System.out.println("newfeeds are max");
    }

    @Override
    public void deleteUser() {
        System.out.println("we can easily del user");

    }
}
