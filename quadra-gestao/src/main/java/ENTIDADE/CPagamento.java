package ENTIDADE;

import java.time.LocalDate;

public class CPagamento {

    //ATRIBUTOS
    private int id;
    private CReserva reserva;
    private double valor;
    private LocalDate dataPagamento;

    //CONSTRUTOR

    public CPagamento (int id, CReserva reserva, double valor, LocalDate dataPagamento){
        this.id = id;
        this.reserva = reserva;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }

    public CPagamento (CReserva reserva, double valor, LocalDate dataPagamento){
        this.reserva = reserva;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }

    public CPagamento(){
    }

    //MÉTODOS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CReserva getReserva() {
        return reserva;
    }

    public void setReserva(CReserva reserva) {
        this.reserva = reserva;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
