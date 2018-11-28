package testHibernate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jihun on 2018. 11. 28..
 */


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Category {
    @Id
    @GeneratedValue  // 자동으로 생성
    @Column(name="category_id")
    private int id;

    private String name;

    @OneToMany(mappedBy="category", cascade=CascadeType.ALL)
    private Set<Product> products = new HashSet<Product>();
}
