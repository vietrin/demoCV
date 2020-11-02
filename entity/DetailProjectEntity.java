package vn.htv.HybridCV.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DetailProject")
@Getter
@Setter
public class DetailProjectEntity extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "id_Project")
    private ProjectEntity projectEntity;
    private String role ;
    private String responsibility ;
    private String description ;
    private String teamSize ;
    private String dateFrom;
    private String dateTo;
    private String technology;
    private String position;
}
