package ktcall.domain;

import java.time.LocalDate;
import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeletedReport extends AbstractEvent {

    private Long id;

    public DeletedReport(Mgmt aggregate) {
        super(aggregate);
    }

    public DeletedReport() {
        super();
    }
}
//>>> DDD / Domain Event
