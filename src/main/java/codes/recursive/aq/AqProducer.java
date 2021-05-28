package codes.recursive.aq;

import io.micronaut.jms.annotations.JMSProducer;
import io.micronaut.jms.annotations.Queue;
import io.micronaut.messaging.annotation.MessageBody;

@JMSProducer("aqConnectionFactory")
public interface AqProducer {
    @Queue("AQDEMOADMIN.EVENT_QUEUE")
    void send(@MessageBody String body);
}