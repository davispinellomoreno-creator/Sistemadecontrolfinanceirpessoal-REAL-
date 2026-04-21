package Service;

import Model.Entity;
import Repository.Repository;


@org.springframework.stereotype.Service


public class Service {


    private final Repository repository;
 private final Entity entity;

   public Service(Repository repository, Entity entity) {
        this.repository = repository;
       this.entity = entity;
   }

    public void salvarGasto(Entity gasto) {
        repository.saveAndFlush(entity);
    }

    public void buscarGasto(Long id) throws Throwable {
        repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Usuário não encontrado"));
    }

       public void deletarGasto(Long id){
          repository.deleteById(id);

        }
        public Entity atualizarGastos (Long id, Entity gasto) throws Throwable {
             Entity gastosEntity = (Entity) repository.findById(id).orElseThrow( ()-> new RuntimeException("Gasto não encontrado"));

        }

   }

