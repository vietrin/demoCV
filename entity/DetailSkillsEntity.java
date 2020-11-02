

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="DetailSkills")
@Getter
@Setter
public class DetailSkillsEntity extends  AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "id_Skills")
    private SkillsEntity skillsEntity;
    private String description ;




}
