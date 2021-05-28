package codes.recursive.aq;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.jms.annotations.JMSListener;
import io.micronaut.jms.annotations.Queue;
import io.micronaut.messaging.annotation.MessageBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@JMSListener("aqConnectionFactory")
public class AqConsumer {
    private static final Logger LOG = LoggerFactory.getLogger(AqConsumer.class);

    @Queue(value = "AQDEMOADMIN.EVENT_QUEUE", concurrency = "1-5")
    public void receive(@MessageBody String body) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        DemoType test = mapper.readValue(body, DemoType.class);
        LOG.info(body);
    }
}