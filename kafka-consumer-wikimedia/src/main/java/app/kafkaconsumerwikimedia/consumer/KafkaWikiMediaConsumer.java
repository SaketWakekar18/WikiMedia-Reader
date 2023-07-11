package app.kafkaconsumerwikimedia.consumer;

import app.kafkaconsumerwikimedia.Entity.WikiMediaData;
import app.kafkaconsumerwikimedia.Repository.WikimediaDataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaWikiMediaConsumer {
    @Autowired
    private WikimediaDataRepository wikimediaDataRepository;

    @KafkaListener(topics = "Wikimedia-recent-change", groupId = "myGroup")
    public void consumer(String message) {
        log.info(String.format("Message recieved: %s",message));
        WikiMediaData wikiMediaData = new WikiMediaData();
        wikiMediaData.setEventData(message);
        wikimediaDataRepository.save(wikiMediaData);
    }
}
