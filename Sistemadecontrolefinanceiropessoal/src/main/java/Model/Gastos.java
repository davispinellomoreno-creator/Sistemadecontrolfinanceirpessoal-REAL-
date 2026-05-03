package Model;

import jakarta.persistence.*;
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
@Entity
@Table ( name = "Cadastro_Gastos")
public class Gastos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String nomeDoGasto;
    private LocalDate dia;
    private double gasto;



}
