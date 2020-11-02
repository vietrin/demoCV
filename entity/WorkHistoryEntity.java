

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="workHistory")
@Getter
@Setter
public class WorkHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_WorkHistory ;
    private String title ;
    private long orderMother ;
}
