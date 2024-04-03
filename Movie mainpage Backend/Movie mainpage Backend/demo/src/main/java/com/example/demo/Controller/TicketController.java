package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Ticket;
import com.example.demo.Service.TicketService;
@RestController
public class TicketController {
    @Autowired
    TicketService ms;
    @PostMapping("/api/ticket")
    public ResponseEntity<Ticket>addelements(@RequestBody Ticket m)
    {
        Ticket mm=ms.create(m);
        return new ResponseEntity<>(mm,HttpStatus.CREATED);
    }
    @GetMapping("/api/tickets")
    public ResponseEntity<List<Ticket>> showinfo()
    {
        return new ResponseEntity<>(ms.getAll(),HttpStatus.OK);
    }
    @GetMapping("/api/ticket/{ticketId}")
    public ResponseEntity<Ticket> getById(@PathVariable Integer ticketId)
    {
        Ticket obj=ms.getMe(ticketId);
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }
    @PutMapping("/api/ticket/{ticketId}")
    public ResponseEntity<Ticket> putMethodName(@PathVariable("ticketId") int id, @RequestBody Ticket m) {
        if(ms.updateDetails(id,m) == true)
        {
            return new ResponseEntity<>(m,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
@DeleteMapping("/api/ticket/{ticketId}")
    public ResponseEntity<Boolean> delete(@PathVariable("ticketId") int id)
    {
        if(ms.deleteMedicine(id) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
}

