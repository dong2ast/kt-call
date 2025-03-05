package ktcall.domain;

import java.util.*;
import ktcall.domain.*;
import ktcall.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class Reported extends AbstractEvent {

    private Long id;
    private String name;
    private String phoneNumber;
    private String reason;
}
