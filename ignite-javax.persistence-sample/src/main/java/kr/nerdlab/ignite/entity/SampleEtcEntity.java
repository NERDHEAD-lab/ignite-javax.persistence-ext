package kr.nerdlab.ignite.entity;

import org.hibernate.annotations.Index;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sample_etc_entity")
public class SampleEtcEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", length = 23)
    protected Long id;

    @Index(name = "idx_etc_value_1", columnNames = "etc_value_1")
    @Column(name = "etc_value_1", length = 2000)
    protected String subValue1;


    @OneToMany(mappedBy = "etc")
    protected List<SampleMainEntity> mainEntities = new ArrayList<>();
}
