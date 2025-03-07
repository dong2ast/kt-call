package ktcall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ReportCommand {

    private String name;
    private String phoneNumber;
    private String reason;
}
