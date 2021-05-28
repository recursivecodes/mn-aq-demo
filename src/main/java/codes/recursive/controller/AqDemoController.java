package codes.recursive.controller;

import codes.recursive.aq.AqProducer;
import codes.recursive.aq.DemoType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

@Controller("/aqDemo")
public class AqDemoController {

    private final AqProducer aqProducer;

    public AqDemoController(AqProducer aqProducer) {
        this.aqProducer = aqProducer;
    }

    @Post(value = "/", produces = MediaType.APPLICATION_JSON)
    public HttpResponse send(@Body DemoType message) throws JsonProcessingException {
        aqProducer.send(new ObjectMapper().writeValueAsString(message));
        return HttpResponse.ok();
    }
}