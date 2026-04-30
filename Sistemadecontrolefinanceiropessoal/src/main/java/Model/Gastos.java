package Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jshell.Snippet;
import lombok.*;
import org.hibernate.grammars.hql.HqlParser;

import java.time.LocalDate;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@jakarta.persistence.Entity
@Table ( name = "Cadastro_Gastos")
public class Gastos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String nomeDoGasto;
    private LocalDate dia;
    private double gasto;



}
