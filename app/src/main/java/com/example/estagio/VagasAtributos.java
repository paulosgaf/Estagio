package com.example.estagio;

public class VagasAtributos {

        //Info da Lista de Vagas
        private int imagem;
        private String titulo;
        private String nome_empresa;
        private String remuneracao;
        private String carga_horaria;
        private String turno;
        private String tempo;
        private int selo;


        public VagasAtributos(int imagem, String titulo, String nome_empresa, String remuneracao, String carga_horaria, String turno, String tempo, int selo) {

            this.imagem = imagem;
            this.titulo = titulo;
            this.nome_empresa = nome_empresa;
            this.remuneracao = remuneracao;
            this.carga_horaria = carga_horaria;
            this.turno = turno;
            this.tempo = tempo;
            this.selo = selo;
        }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public String getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(String remuneracao) {
        this.remuneracao = remuneracao;
    }

    public String getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(String carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public int getSelo() {
        return selo;
    }

    public void setSelo(int selo) {
        this.selo = selo;
    }
}
