package cm.cti.cinema.serviceavis.models;

import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="avis")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Avis {
private String commentaire;
}
