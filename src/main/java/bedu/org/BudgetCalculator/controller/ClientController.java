package bedu.org.BudgetCalculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import bedu.org.BudgetCalculator.dto.ClientDTO;
import bedu.org.BudgetCalculator.dto.CreateClientDTO;
import bedu.org.BudgetCalculator.service.ClientService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ClientDTO> findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientDTO save(@Valid @RequestBody CreateClientDTO data) {
        return service.save(data);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ClientDTO updateCliente(@Valid @PathVariable Long id, @RequestBody CreateClientDTO data) {
        return service.update(id, data);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCliente(@PathVariable Long id) {
        service.delete(id);
    }

}
