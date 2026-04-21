package Service;

import Model.Gastos;
import Repository.Repository;


@org.springframework.stereotype.Service


public class Service {


    private final Repository repository;
    private final Gastos entity;

    public Service(Repository repository, Gastos entity) {
        this.repository = repository;
        this.entity = entity;
    }

    public void salvarGasto(Gastos gasto) {
        repository.saveAndFlush(entity);
    }

    public void buscarGasto(Long id) throws Throwable {
        repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Usuário não encontrado"));
    }

    public void deletarGasto(Long id) {
        repository.deleteById(id);

    }

    public Gastos atualizarGastos(Long id, Gastos gasto) throws Throwable {
        Gastos gastosEntity = (Gastos) repository.findById(id).orElseThrow(() -> new RuntimeException("Gasto não encontrado"));

    Gastos usuarioAtualizado = Gastos.builder()
                .ID(gasto.getId() != null
                        ? gasto.getId()
                        : gastosEntity.getId())
                .nome(gasto.getNomeDoGasto() != null
                        ? gasto.getNomeDoGasto()
                        : gastosEntity.getNomeDoGasto())
                .email(gasto.getDia() != null
                        ? gasto.getDia()
                        : gastosEntity.getDia())

                .build();



    }
}



