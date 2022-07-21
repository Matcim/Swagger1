package co.develhope.esercizioSwagger1.controller;


import co.develhope.esercizioSwagger1.entities.DatiUtente;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/primo")
@Tag(name = "matteo",description = "la mia prima api")
public class PrimoController {

  @GetMapping(value = "")
  @ApiOperation(value = "ciao primo ", httpMethod = "GET",notes = "la mia prima descrizione di get")
  @ResponseStatus(HttpStatus.OK)
  @ApiResponses({
          @ApiResponse(code = 200, message = "ok status"),
          @ApiResponse(code = 404,message = "impossibile raggiungere il percorso "),
  @ApiResponse(code = 400 , message = "errore interno di spring ",response = String.class)})
   public DatiUtente primoGet(){

      return  new DatiUtente("matteo");
  }

  @PostMapping(value = "/secondo")
  @Tag(name = "matteo",description = "la mia seconda api")
  public void secondoController(@RequestBody(required = false) DatiUtente datiUtente){

  }

}
