package ktcall.domain;

import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class LockedUsim extends AbstractEvent {

    private Long id;
    private String phoneNumber;
    private String usim;
}
