package br.com.alura.mvc.mudi.Controller;

import br.com.alura.mvc.mudi.Model.Pedido;
import br.com.alura.mvc.mudi.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
   @Autowired
   private PedidoRepository pedidoRepositoryrepository;

    @GetMapping("/home")
    public String home(Model model){
        List<Pedido> pedidos = pedidoRepositoryrepository.findAll();
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
