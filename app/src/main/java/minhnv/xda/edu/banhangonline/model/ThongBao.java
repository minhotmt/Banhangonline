package minhnv.xda.edu.banhangonline.model;

/**
 * Created by MinhNguyen on 12/27/2017.
 */

public class ThongBao {
    String title;
    String content;

    public ThongBao() {
    }

    public ThongBao(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ThongBao{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
