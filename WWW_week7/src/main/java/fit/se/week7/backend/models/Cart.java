package fit.se.week7.backend.models;

import fit.se.week7.backend.enums.CartStatus;
import fit.se.week7.backend.pks.CartKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @Enumerated
    private CartKey id;
    @Enumerated(EnumType.STRING)
    private CartStatus status;
}
