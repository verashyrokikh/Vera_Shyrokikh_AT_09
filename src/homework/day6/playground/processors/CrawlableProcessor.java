package homework.day6.playground.processors;

import homework.day6.playground.essense.creatures.Crawlable;
import homework.day6.playground.utils.DirectionGenerator;
import homework.day6.playground.utils.DistanceGenerator;

public class CrawlableProcessor {
    public void runCrawlable(Crawlable crawlable){
        crawlable.crawl(DirectionGenerator.generateDirection(), DistanceGenerator.generateDistance());
    }
    public void runCrawlable(Crawlable crawlable, String direction){
        crawlable.crawl(direction, DistanceGenerator.generateDistance());
    }

    public void runCrawlable(Crawlable crawlable, String direction, int distance){
        crawlable.crawl(direction, distance);
    }
}
