package ktcall.domain;

import java.time.LocalDate;
import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Reported extends AbstractEvent {

    private Long id;
    private String name;
    private String phoneNumber;
    private String reason;

    public Reported(Report aggregate) {
        super(aggregate);
    }

    public Reported() {
        super();
    }
}
//>>> DDD / Domain Event
