package Controller;

import Model.Gastos;
import Service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.servlet.function.ServerResponse.ok;

@RestController
@RequestMapping("/controle")
public class Controller {


    private final Service gastosService;
    private final Gastos gasto;

    public Controller(Service gastosService) {
        this.gastosService = gastosService;
        this.gasto = gasto;


        @GetMapping
     public ResponseEntity<Gastos> buscarGastosPorId(@RequestParam Long id){
            return ResponseEntity.ok(gastosService.buscarGasto(id);

        }

    }
}
