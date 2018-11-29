package testHibernate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by jihun on 2018. 11. 28..
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
public class License {
    @Id
    @GeneratedValue(generator = "myGenerator")
    @GenericGenerator(name = "myGenerator", strategy = "foreign", parameters = @Parameter(value="person", name="property"))
    private long id;

    private String licenseNumber;
    private Date issue_date;

    @OneToOne
    @JoinColumn(name="person_id")
    private Person person;
}
