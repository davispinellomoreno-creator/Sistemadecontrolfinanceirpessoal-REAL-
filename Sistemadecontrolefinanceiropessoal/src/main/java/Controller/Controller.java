package Controller;

import Model.Gastos;
import Service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controle")
public class Controller {


    private final Service gastosService;


    public  Controller(Service gastosService) {
        this.gastosService = gastosService;

    }


    @GetMapping("/{id}")
    public ResponseEntity<Gastos> buscarGastoPorId(@PathVariable Long id)  {
        Gastos gasto = gastosService.buscarGasto(id);
        return ResponseEntity.ok(gasto);
    }

            @PostMapping
            public ResponseEntity <Void> salvarGasto (@RequestBody Gastos gasto){
                gastosService.salvarGasto(gasto);

                return ResponseEntity.ok().build();
            }
            @PutMapping
                    public ResponseEntity<Void> atualizarGasto(@RequestBody Gastos gasto,@RequestParam Long id){
                gastosService.atualizarGastos(gasto,id);
                return ResponseEntity.ok().build();
            }
            @DeleteMapping
                    public ResponseEntity <Gastos> deletarGastoPorId (@RequestParam Long id){
                gastosService.deletarGasto(id);
                return ResponseEntity.ok().build();
            }

        }

    }

