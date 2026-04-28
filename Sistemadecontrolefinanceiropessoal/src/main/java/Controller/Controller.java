package Controller;

import Model.Gastos;
import Service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controle")
public class Controller {


    private final Service gastosService;
    private final Gastos gasto;

    public  Controller(Service gastosService) {
        this.gastosService = gastosService;
        this.gasto = gasto;


        @GetMapping
     public ResponseEntity<Gastos> buscarGastosPorId(@RequestParam Long id){
            return ResponseEntity.ok(gastosService.buscarGasto(id);

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
}
