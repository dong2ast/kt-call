package ktcall.domain;

import java.util.Date;
import java.util.List;
import ktcall.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "notificationHistories",
    path = "notificationHistories"
)
public interface NotificationHistoryRepository
    extends PagingAndSortingRepository<NotificationHistory, Long> {}
