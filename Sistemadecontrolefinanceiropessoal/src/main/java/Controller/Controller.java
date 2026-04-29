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
    public ResponseEntity<Void> salvarGasto(@RequestBody Gastos gasto) {
        gastosService.salvarGasto(gasto);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizarGasto(@PathVariable Long id,
                                               @RequestBody Gastos gasto) {
        gastosService.atualizarGastos(id, gasto);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarGasto(@PathVariable Long id) {
        gastosService.deletarGasto(id);
        return ResponseEntity.ok().build();
    }

        }



