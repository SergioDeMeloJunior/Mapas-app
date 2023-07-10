package com.demelo.mapas;

import java.util.Objects;

public class Estado implements Comparable<Estado> {

    private String sigla;
    private String nome;

    public Estado(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        Objects.requireNonNull(sigla);
        Objects.requireNonNull(nome);


    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "com.demelo.mapas.Estado{" +
                "sigla='" + sigla + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return sigla.equals(estado.sigla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sigla);
    }

    public int compareTo(Estado o){
        return getSigla().compareTo(o.getSigla());
    }
}
