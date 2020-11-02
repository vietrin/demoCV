

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="skills")
@Getter
@Setter
public class SkillsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Skills ;
    private String title ;
    private long orderMother ;
}
