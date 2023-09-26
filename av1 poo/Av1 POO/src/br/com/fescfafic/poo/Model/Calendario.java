package br.com.fescfafic.poo.Model;
import java.time.LocalDate;

public class Calendario {
    public Reservaespaco[] eventosReservados = new Reservaespaco[5];
    public boolean verificarDisponibilidade(LocalDate data) {
        for (int i = 0; i < this.eventosReservados.length; i++) {
            if (this.eventosReservados[i] != null && this.eventosReservados[i].evento.data.equals(data)) {
                return false;
            }
        }
        return true;
    }
    public boolean verificarDisponibilidade(String local) {
        for (int i = 0; i < this.eventosReservados.length; i++) {
            if (this.eventosReservados[i] != null && this.eventosReservados[i].evento.local.equals(local)) {
                return false;
            }
        }
        return true;
    }
    public void inserirEvento(Organizador organizador, Evento evento) {
        if (!organizador.temEspacoParaEventos()) {
            System.out.println("A lista de eventos organizados deste organizador está cheia");
        } else if (!this.verificarDisponibilidade(evento.data) && !this.verificarDisponibilidade(evento.local)) {
            System.out.printf("Data e Local indisponíveis para \"%s\"\n", evento.nome);
        } else {
            for (int i = 0; i < this.eventosReservados.length; i++) {
                if (this.eventosReservados[i] == null) {
                    this.eventosReservados[i] = new Reservaespaco(organizador, evento);
                    organizador.adicionarEvento(evento);
                    return;
                }
            }
            System.out.println("A lista de eventos reservados deste calendário está cheia");
        }
    }
    public void cancelarEvento(Organizador organizador, Evento evento) {
        for (int i = 0; i < this.eventosReservados.length; i++) {
            if (this.eventosReservados[i] != null && this.eventosReservados[i].evento == evento) {
                if (this.eventosReservados[i].organizador != organizador) {
                    System.out.println("Este organizador não pode cancelar um evento de outro organizador");
                } else {
                    organizador.removerEvento(evento);
                    this.eventosReservados[i] = null;
                }
                return;
            }
        }
        System.out.println("Evento não encontrado");
    }
    public void exibirInfo() {
        System.out.println("----------------INICIO DO CALENDARIO DE EVENTOS----------------");
        for (int i = 0; i < this.eventosReservados.length; i++) {
            if (this.eventosReservados[i] != null) {
                this.eventosReservados[i].exibirInfo();
            }
        }
        System.out.println("----------------FINAL DO CALENDARIO DE EVENTOS----------------\n");
    }
}
