package ENTIDADE;

import java.time.LocalDate;
import java.time.LocalTime;

public class CReserva {

    //ATRIBUTOS
    private int id;
    private CCliente cliente;
    private CQuadra quadra;
    private LocalDate data;
    private LocalTime horario;

    //CONSTRUTOR
    public CReserva (int id, CCliente cliente, CQuadra quadra, LocalDate data, LocalTime horario){
        this.id = id;
        this.cliente = cliente;
        this.quadra = quadra;
        this.data = data;
        this.horario = horario;
    }

    public CReserva (CCliente cliente, CQuadra quadra, LocalDate data, LocalTime horario){
        this.cliente = cliente;
        this.quadra = quadra;
        this.data = data;
        this.horario = horario;
    }

    public CReserva (){
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public CQuadra getQuadra() {
        return quadra;
    }

    public void setQuadra(CQuadra quadra) {
        this.quadra = quadra;
    }

    public CCliente getCliente() {
        return cliente;
    }

    public void setCliente(CCliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
