package Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@jakarta.persistence.Entity
@Table ( name = "Cadastro_Gastos")
public class Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String nomeDoGasto;
    private LocalDate dia;
    private double gasto;

}
