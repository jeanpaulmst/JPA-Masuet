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
public class Cliente {

    @Column
    private String apellido;

    @Column
    private int dni;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    //Propietaria
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    //No propietaria
    @OneToMany(mappedBy = "cliente")
    private Set<Factura> facturas;
}
