package vn.htv.HybridCV.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="profile")
@Getter
@Setter
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Profile ;
    private String name ;
    private String gender ;
    private String dayOfBirth ;
    private String email ;
    private String image ;
    private String office ;


}
