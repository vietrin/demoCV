

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DetailWorkHistory")
@Getter
@Setter
public class DetailWorkHistoryEntity extends AbstractEntity  {
    @ManyToOne
    @JoinColumn(name = "id_WorkHistory")
    private WorkHistoryEntity  workHistoryEntity;
    private String company ;
    private String date ;
    private String position;
}
