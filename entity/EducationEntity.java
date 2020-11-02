package vn.htv.HybridCV.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="education")
@Getter
@Setter
public class EducationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Education ;
    private String title ;
    private long orderMother ;

}
