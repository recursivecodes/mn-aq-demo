package codes.recursive.aq;

import io.micronaut.context.annotation.Factory;
import io.micronaut.jms.annotations.JMSConnectionFactory;
import oracle.jms.AQjmsFactory;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.sql.DataSource;

@Factory
public class AqJmsConfig {

    private final DataSource dataSource;

    public AqJmsConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @JMSConnectionFactory("aqConnectionFactory")
    public ConnectionFactory connectionFactory() throws JMSException {
        return AQjmsFactory.getConnectionFactory(dataSource);
    }
}