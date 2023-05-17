package cm.cti.cinema.serviceavis.models;


import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="contactUs")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactUs {
private Long id;
private String email;
private String nom;
private String prenom;
private VarcharJdbcType message;
}
