package app.kafkaconsumerwikimedia.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "WikiMedia_Recent_Changes")
@Getter
@Setter
public class WikiMediaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Lob
    private String eventData;
}
