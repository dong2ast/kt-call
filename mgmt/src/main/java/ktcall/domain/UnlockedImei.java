package ktcall.domain;

import java.time.LocalDate;
import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class UnlockedImei extends AbstractEvent {

    private Long id;
    private String phoneNumber;

    public UnlockedImei(Mgmt aggregate) {
        super(aggregate);
    }

    public UnlockedImei() {
        super();
    }
}
//>>> DDD / Domain Event
