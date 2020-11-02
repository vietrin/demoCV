

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="cv")
@Getter
@Setter
public class CvEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Profile", referencedColumnName = "id_Profile")
    private ProfileEntity profileEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Education", referencedColumnName = "id_Education")
    private EducationEntity educationEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Project", referencedColumnName = "id_Project")
    private ProjectEntity projectEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_WorkHistory", referencedColumnName = "id_WorkHistory")
    private WorkHistoryEntity workHistoryEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Skills", referencedColumnName = "id_Skills")
    private SkillsEntity skillsEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Certificate", referencedColumnName = "id_Certificate")
    private CertificateEntity certificateEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Professional", referencedColumnName = "id_Professional")
    private ProfessionalEntity professionalEntity;
}
