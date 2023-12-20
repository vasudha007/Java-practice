package demo.interfaces;

public class Snapchat implements SocialMedia{
    @Override
    public void getPostCount() {
        System.out.println("postcount are less");
    }

    @Override
    public void showNewsFeed() {
        System.out.println("less newsfeed");

    }

    @Override
    public void deleteUser() {
        System.out.println("user deleted");

    }
}
