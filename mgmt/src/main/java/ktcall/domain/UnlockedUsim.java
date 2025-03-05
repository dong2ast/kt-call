package ktcall.domain;

import java.time.LocalDate;
import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class UnlockedUsim extends AbstractEvent {

    private Long id;
    private String phoneNumber;

    public UnlockedUsim(Mgmt aggregate) {
        super(aggregate);
    }

    public UnlockedUsim() {
        super();
    }
}
//>>> DDD / Domain Event
