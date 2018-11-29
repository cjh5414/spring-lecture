package testHibernate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by jihun on 2018. 11. 28..
 */

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Person {
    @Id
    @GeneratedValue
    @Column(name="person_id")
    private long id;
    private String firstName;
    private String lastName;

    @OneToOne(mappedBy="person", cascade = CascadeType.ALL)
    private License license;
}
