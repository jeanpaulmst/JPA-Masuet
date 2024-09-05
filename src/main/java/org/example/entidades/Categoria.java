package org.example.entidades;

import lombok.*;
import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;

    //No propietaria
    @ManyToMany(mappedBy = "categorias")
    private Set<Articulo> articulos;

}
