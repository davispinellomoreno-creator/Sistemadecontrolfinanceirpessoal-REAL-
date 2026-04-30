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

    public Gastos buscarGasto(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Gasto não encontrado"));
    }

    public void deletarGasto(Long id) {
        repository.deleteById(id);

    }

    public Gastos atualizarGastos(Long id, Gastos gasto) {

        Gastos gastosEntity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Gasto não encontrado"));

        Gastos gastosAtualizado = Gastos.builder()
                .id(gastosEntity.getId())
                .nomeDoGasto(gasto.getNomeDoGasto() != null ? gasto.getNomeDoGasto() : gastosEntity.getNomeDoGasto())
                .dia(gasto.getDia() != null ? gasto.getDia() : gastosEntity.getDia())
                .build();

        return repository.save(gastosAtualizado);
    }

    }




