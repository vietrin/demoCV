package vn.htv.HybridCV.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="project")
@Getter
@Setter
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Project ;
    private String title ;
    private long orderMother ;
}
