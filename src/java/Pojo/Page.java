package Pojo;

/**
 * 存储页面信息实体类
 */
public class Page {
    //id
    private int id;
    //电影链接
    private String url;
    //评论数
    private String commentcount;
    //电影名称
    private String title;
    //电影介绍
    private String jieshao;
    //电影评分
    private String fenshu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(String commentcount) {
        this.commentcount = commentcount;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJieshao() {
        return jieshao;
    }

    public void setJieshao(String jieshao) {
        this.jieshao = jieshao;
    }

    public String getFenshu() {
        return fenshu;
    }

    public void setFenshu(String fenshu) {
        this.fenshu = fenshu;
    }
}
