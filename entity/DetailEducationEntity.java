

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="DetailEducation")
@Getter
@Setter
public class DetailEducationEntity extends  AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "id_Education")
    private EducationEntity educationEntity;
    private String dateFrom;
    private String dateTo;
    private String major;

}
