package br.edu.universidade.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="professor")
public class Professor {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String sexo;
    private String endereco;
    private String formacao;
    private String titulacao;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idcidade", foreignKey=@ForeignKey(name="professor_ibfk_1"))
    private Cidade idCidade; 
    private String email;
    //private Telefone telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id){

        this.id = id;
    }

    public String getNome(){

        return nome;
    }

    public void setNome(String nome){

        this.nome = nome;
    }

    public String getCpf(){

        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getSexo(){

        return sexo;
    }


    public void setSexo(String sexo){

        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Cidade getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Cidade idCidade) {
        this.idCidade = idCidade;
    }

   /* public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }*/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
