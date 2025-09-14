package br.edu.universidade.model;

import java.time.LocalDate;

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
@Table(name = "aluno")
public class Aluno {

    
    public Aluno() {
        // Default constructor
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    
    private String primeiroNome;

    private String segundoNome;

    private String ultimoNome;

    private String cpf;

    private String sexo;

    private LocalDate dtnascimento;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idcidade", foreignKey=@ForeignKey(name="aluno_ibfk_1"))
    private Cidade idcidade;

    private String endereco;

 

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nome
     */
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    /**
     * @param nome the nome to set
     */
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }


      /**
     * @return String return the nome
     */
    public String getSegundoNome() {
        return segundoNome;
    }

    /**
     * @param nome the nome to set
     */
    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }


      /**
     * @return String return the nome
     */
    public String geUltimoNome() {
        return ultimoNome;
    }

    /**
     * @param nome the nome to set
     */
    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return String return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return String return the dtnascimento
     */
    public LocalDate getDtnascimento() {
        return dtnascimento;
    }

    /**
     * @param dtnascimento the dtnascimento to set
     */
    public void setDtnascimento(LocalDate dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    /**
     * @return Integer return the idcidade
     */
    public Cidade getIdcidade() {
        return idcidade;
    }

    /**
     * @param idcidade the idcidade to set
     */
    public void setIdcidade(Cidade idcidade) {
        this.idcidade = idcidade;
    }

    /**
     * @return String return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
