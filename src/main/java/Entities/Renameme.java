package Entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "RENAMEME")
public class Renameme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Size(max = 255)
    @Column(name = "DUMMYSTR1")
    private String dummystr1;

    @Size(max = 255)
    @Column(name = "DUMMYSTR2")
    private String dummystr2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDummystr1() {
        return dummystr1;
    }

    public void setDummystr1(String dummystr1) {
        this.dummystr1 = dummystr1;
    }

    public String getDummystr2() {
        return dummystr2;
    }

    public void setDummystr2(String dummystr2) {
        this.dummystr2 = dummystr2;
    }

}