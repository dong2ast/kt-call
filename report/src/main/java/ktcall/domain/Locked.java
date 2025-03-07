package ktcall.domain;

import java.time.LocalDate;
import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Locked extends AbstractEvent {

    private Long id;
    private String name;
    private String phoneNumber;
    private String reason;
    private String usim;
    private String imei;

    public Locked(Report aggregate) {
        super(aggregate);
    }

    public Locked() {
        super();
    }
}
//>>> DDD / Domain Event
