package es.ulpgc.dacd.scraper.scraping;

public class Hotels {
    public String name;
    public String html;

    public Hotels() {
    }

    public void setName(String name, String html) {
        this.name = name;
        this.html = html;
    }

    public String getName() {
        return name;
    }

    public String getHtml() {
        return html;
    }
}
