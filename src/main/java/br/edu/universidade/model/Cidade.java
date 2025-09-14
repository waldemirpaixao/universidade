package br.edu.universidade.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cidade")
public class Cidade {

    public Cidade(){

        //CONSTRUTOR PADRÃO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcidade", nullable = false)
    private Long idCidade;

    @Column(nullable = false)
    private String uf;

    @Column(name="nomecidade", nullable = false)
    private String nomeCidade;


    /**
     * @return Long return the idcidade
     */
    public Long getIdCidade() {
        return idCidade;
    }

    /**
     * @param idcidade the idcidade to set
     */
    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }

    /**
     * @return String return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return String return the nomecidade
     */
    public String getNomecidade() {
        return nomeCidade;
    }

    /**
     * @param nomecidade the nomecidade to set
     */
    public void setNomecidade(String nomecidade) {
             this.nomeCidade = nomecidade;
    }

}
