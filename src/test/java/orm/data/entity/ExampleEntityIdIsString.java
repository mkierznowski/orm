package orm.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.nask.agent.component.api.database.domain.IEntity;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.nio.file.Path;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExampleEntityIdIsString implements IEntity {

    @Id
    private String identify;
    private int age;
    private Integer doubledAge;
    private String sampleTest;
    private LocalDateTime creationTime;
    @Transient
    private Path path;
}
