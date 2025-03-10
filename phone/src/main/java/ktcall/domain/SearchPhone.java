package ktcall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "SearchPhone_table")
@Data
public class SearchPhone {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String owner;
    private String phoneNumber;
    private String usimStatus;
    private String imeiStatus;
}
