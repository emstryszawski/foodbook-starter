package pl.edu.pjatk.foodbook.productservice.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Allergen {
    @Id
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Allergen allergen = (Allergen) o;
        return name != null && Objects.equals(name, allergen.name);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}