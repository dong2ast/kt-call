package ktcall.domain;

import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class ChangedStatus extends AbstractEvent {

    private Long id;
    private String owner;
    private String phoneNumber;
    private String usimStatus;
    private String imeiStatus;
}
