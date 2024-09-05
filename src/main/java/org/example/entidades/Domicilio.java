package org.example.entidades;

import lombok.*;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombreCalle;

    @Column
    private int numero;

    //No propietaria
    @OneToOne(mappedBy = "domicilio")
    private Cliente cliente;
}
