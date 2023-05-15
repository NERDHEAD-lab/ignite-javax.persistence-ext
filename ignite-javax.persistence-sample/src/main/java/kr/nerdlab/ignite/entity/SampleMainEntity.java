package kr.nerdlab.ignite.entity;


import org.hibernate.annotations.Index;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sample_main_entity")
public class SampleMainEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", length = 23)
    protected Long id;

    @ManyToOne
    @JoinColumn(name = "sub_id", nullable = true)
    private SampleSubEntity subEntity;

    @Index(name = "idx_main_value_1", columnNames = "value_1")
    @Column(name = "value_1", length = 2000)
    protected String value1;

    @Column(name = "value_2", length = 2000)
    protected String value2;

    @ManyToOne
    @JoinTable(name = "pdf_resource_owner",
            joinColumns = @JoinColumn(name = "main_id"),
            inverseJoinColumns = @JoinColumn(name = "etc_id"))
    protected SampleEtcEntity etc;
}
