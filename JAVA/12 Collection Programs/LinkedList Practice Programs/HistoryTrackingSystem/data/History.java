package HistoryTrackingSystem.data;
import java.util.*;

public class History {
    int pageId;
    String url;
    String title;
    Date visitDate;

    public History(int pageId, String url, String title, Date visitDate) {
        this.pageId = pageId;
        this.url = url;
        this.title = title;
        this.visitDate = visitDate;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    @Override
    public String toString() {
        return "History{" +
                "pageId=" + pageId +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", visitDate=" + visitDate +
                '}';
    }
}
