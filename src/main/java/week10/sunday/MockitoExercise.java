package week10.sunday;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.net.URL;

public class MockitoExercise {

    public Integer sumUp() {
        return 5 + 9 + 5 + 4 + 4567 + 879;
    }

    public String readRss(String url) {
        StringBuilder sb = new StringBuilder();
        try {
            XmlReader xmlReader = new XmlReader(new URL(url));
            SyndFeed syndFeed = new SyndFeedInput().build(xmlReader);

            for (SyndEntry syndEntry : syndFeed.getEntries()){
                sb.append(syndEntry.getTitle());
                sb.append("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        MockitoExercise mockitoExercise = new MockitoExercise();
        String result = mockitoExercise.readRss("http://feeds.bbci.co.uk/news/world/rss.xml");
        System.out.println(result);
    }
}
