package app.kafkaconsumerwikimedia.Repository;

import app.kafkaconsumerwikimedia.Entity.WikiMediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikiMediaData,Long> {
}
