package com.demelo.mapas;

import java.util.Objects;

public class Cidade implements Comparable<Cidade> {

    private int IbgeCodigo;
    private String nome;
    private int totalHabitantes;

    public int getIbgeCodigo() {
        return IbgeCodigo;
    }

    public void setIbgeCodigo(int ibgeCodigo) {
        IbgeCodigo = ibgeCodigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalHabitantes() {
        return totalHabitantes;
    }

    public void setTotalHabitantes(int totalHabitantes) {
        this.totalHabitantes = totalHabitantes;
    }

    public Cidade(int ibgeCodigo, String nome, int totalHabitantes) {
        IbgeCodigo = ibgeCodigo;
        this.nome = nome;
        this.totalHabitantes = totalHabitantes;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidades = (Cidade) o;
        return IbgeCodigo == cidades.IbgeCodigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(IbgeCodigo);
    }

    public int compareTo(Cidade o) {
        return Integer.compare(getIbgeCodigo(),o.IbgeCodigo);

    }


}
