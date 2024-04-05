package classes;

import java.util.Objects;

/**
 *
 * @author 15512921657
 */
public class Animal {
    private int cod;
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private double peso;

    public Animal(int cod, String nome, String especie, String raca, int idade, double peso) {
        this.cod = cod;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }
    
    public Animal(Animal animal){
        this.cod = animal.getCod();
        this.nome = animal.getNome();
        this.especie = animal.getEspecie();
        this.raca = animal.getRaca();
        this.idade = animal.getIdade();
        this.peso = animal.getPeso();
    }

    public Animal() {
        this.cod = 0;
        this.nome = "";
        this.especie = "";
        this.raca = "";
        this.idade = 0;
        this.peso = 0.0;
    }

    //setters
    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //getters
    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return cod + " - nome:" + nome + ", especie:" + especie + ", raca:" + raca + ", idade:" + idade + " anos, peso:" + peso + "kg";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.cod;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.especie);
        hash = 79 * hash + Objects.hashCode(this.raca);
        hash = 79 * hash + this.idade;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (this.idade != other.idade) {
            return false;
        }
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.especie, other.especie)) {
            return false;
        }
        return Objects.equals(this.raca, other.raca);
    }
}
