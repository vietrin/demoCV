

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="certificate")
@Getter
@Setter
public class CertificateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Certificate ;
    private String title ;
    private long orderMother ;
}
