package Lesson6.Forum;

import java.util.Date;

public class forumPosts {
    private long ID;
    private ForumSubcategories forumSubcategory;
    private Users user;
    private forumPosts forumPost;
    private String title;
    private StringBuilder content;
    private Boolean isPoll;
    private Date PostDate;
    private String ip;

    public forumPosts(long ID, ForumSubcategories forumSubcategory, Users user, forumPosts forumPost, String title,
                      StringBuilder content, Boolean isPoll, Date postDate, String ip) {
        this.ID = ID;
        this.forumSubcategory = forumSubcategory;
        this.user = user;
        this.forumPost = forumPost;
        this.title = title;
        this.content = content;
        this.isPoll = isPoll;
        PostDate = postDate;
        this.ip = ip;
    }

    public long getID() {
        return ID;
    }

    public ForumSubcategories getForumSubcategory() {
        return forumSubcategory;
    }

    public Users getUser() {
        return user;
    }

    public forumPosts getForumPost() {
        return forumPost;
    }

    public String getTitle() {
        return title;
    }

    public StringBuilder getContent() {
        return content;
    }

    public Boolean getPoll() {
        return isPoll;
    }

    public Date getPostDate() {
        return PostDate;
    }

    public String getIp() {
        return ip;
    }
}
