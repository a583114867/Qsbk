package com.zzq.qsbk.bean;

/**
 * Created by 朱志强 on 2017/4/21.
 * 糗事百科段子
 */

public class StatusItem {

    /**
     * format : image
     * image : app118915887.jpg
     * high_loc : //pic.qiushibaike.com/system/pictures/11891/118915887/medium/app118915887.jpg
     * published_at : 1492748401
     * tag :
     * user : {"avatar_updated_at":1489409732,"medium":"//pic.qiushibaike.com/system/avtnew/3353/33535869/medium/2017031320553196.JPEG","thumb":"//pic.qiushibaike.com/system/avtnew/3353/33535869/thumb/2017031320553196.JPEG","last_visited_at":0,"created_at":1489409731,"updated_at":1489409731,"state":"active","role":"n","login":"左右眠","last_device":"","id":33535869,"icon":"2017031320553196.JPEG"}
     * image_size : {"s":[220,145,6285],"m":[640,421,77379]}
     * id : 118915887
     * low_loc : //pic.qiushibaike.com/system/pictures/11891/118915887/small/app118915887.jpg
     * votes : {"down":-10,"up":81}
     * created_at : 1492699340
     * content : 这是在我们网吧看到的，哈哈
     * state : publish
     * comments_count : 0
     * allow_comment : true
     * share_count : 0
     * type : fresh
     */

    private String format;
    private String image;
    private String high_loc;
    private int published_at;
    private String tag;
    private User user;
    private ImageSize image_size;
    private int id;
    private String low_loc;
    private Votes votes;
    private int created_at;
    private String content;
    private String state;
    private int comments_count;
    private boolean allow_comment;
    private int share_count;
    private String type;

    public void setFormat(String format) {
        this.format = format;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setHigh_loc(String high_loc) {
        this.high_loc = high_loc;
    }

    public void setPublished_at(int published_at) {
        this.published_at = published_at;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setImage_size(ImageSize image_size) {
        this.image_size = image_size;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLow_loc(String low_loc) {
        this.low_loc = low_loc;
    }

    public void setVotes(Votes votes) {
        this.votes = votes;
    }

    public void setCreated_at(int created_at) {
        this.created_at = created_at;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public void setAllow_comment(boolean allow_comment) {
        this.allow_comment = allow_comment;
    }

    public void setShare_count(int share_count) {
        this.share_count = share_count;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public String getImage() {
        return image;
    }

    public String getHigh_loc() {
        return high_loc;
    }

    public int getPublished_at() {
        return published_at;
    }

    public String getTag() {
        return tag;
    }

    public User getUser() {
        return user;
    }

    public ImageSize getImage_size() {
        return image_size;
    }

    public int getId() {
        return id;
    }

    public String getLow_loc() {
        return low_loc;
    }

    public Votes getVotes() {
        return votes;
    }

    public int getCreated_at() {
        return created_at;
    }

    public String getContent() {
        return content;
    }

    public String getState() {
        return state;
    }

    public int getComments_count() {
        return comments_count;
    }

    public boolean getAllow_comment() {
        return allow_comment;
    }

    public int getShare_count() {
        return share_count;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "StatusItem{" +
                "format='" + format + '\'' +
                ", image='" + image + '\'' +
                ", high_loc='" + high_loc + '\'' +
                ", published_at=" + published_at +
                ", tag='" + tag + '\'' +
                ", user=" + user +
                ", image_size=" + image_size +
                ", id=" + id +
                ", low_loc='" + low_loc + '\'' +
                ", votes=" + votes +
                ", created_at=" + created_at +
                ", content='" + content + '\'' +
                ", state='" + state + '\'' +
                ", comments_count=" + comments_count +
                ", allow_comment=" + allow_comment +
                ", share_count=" + share_count +
                ", type='" + type + '\'' +
                '}';
    }
}
