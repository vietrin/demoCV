package vn.htv.HybridCV.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="professional")
@Getter
@Setter
public class ProfessionalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Professional ;
    private String description ;
}
