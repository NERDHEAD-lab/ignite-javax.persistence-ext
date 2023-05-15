package kr.nerdlab.ignite.entity;

import org.hibernate.annotations.Index;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "sample_sub_entity")
public class SampleSubEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", length = 23)
    protected Long id;

    @OneToMany
    @JoinColumn(name = "main_id", nullable = true)
    private List<SampleMainEntity> entity;

    @Index(name = "idx_sub_value_1", columnNames = "sub_value_1")
    @Column(name = "sub_value_1", length = 2000)
    protected String subValue1;
}
