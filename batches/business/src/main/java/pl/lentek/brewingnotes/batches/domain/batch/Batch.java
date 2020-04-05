package pl.lentek.brewingnotes.batches.domain.batch;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "BATCH")
public class Batch {

  @Id
  @Column(name = "ID_BATCH")
  private Long id;

  @Column(name = "BATCH_NAME")
  String name;

  @Column(name = "ID_STYLE")
  Long styleId;

  @Column(name = "CREATION_DATE")
  LocalDateTime creationDateTime;
}
