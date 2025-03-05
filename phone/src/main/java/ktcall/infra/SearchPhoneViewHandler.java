package ktcall.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import ktcall.config.kafka.KafkaProcessor;
import ktcall.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class SearchPhoneViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private SearchPhoneRepository searchPhoneRepository;
    //>>> DDD / CQRS
}
