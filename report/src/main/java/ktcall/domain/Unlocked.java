package ktcall.domain;

import java.time.LocalDate;
import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Unlocked extends AbstractEvent {

    private Long id;
    private String phoneNumber;

    public Unlocked(Report aggregate) {
        super(aggregate);
    }

    public Unlocked() {
        super();
    }
}
//>>> DDD / Domain Event
