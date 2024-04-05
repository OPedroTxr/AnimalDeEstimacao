package gerenciador;

import classes.Animal;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author 15512921657
 */
public class GerenciadorAnimal {
    private List<Animal> _animais;
    
    public GerenciadorAnimal(){
        _animais = new ArrayList<>();
    }
    
    public void addAnimal(int cod, String nome, String especie, String raca, int idade, double peso){
        Animal _animal = new Animal(cod, nome, especie, raca, idade, peso);
        _animais.add(_animal);
    }
    
    public void addAnimal(Animal _animal){
         _animais.add(_animal);
    }
    
    public String imprimirAnimais(){
                String animaisImpressos = "" ;
            for (Animal animais: _animais){
                animaisImpressos =  animaisImpressos + animais.toString() + "\n";
            }
        return animaisImpressos;
    }
    
    public void Editar(Animal animal, Animal outro){
        animal.setNome(outro.getNome());
        animal.setEspecie(outro.getEspecie());
        animal.setRaca(outro.getRaca());
        animal.setIdade(outro.getIdade());
        animal.setPeso(outro.getPeso());
    }
    
    public int size(){
        return _animais.size();
    }

    public List<Animal> getAnimais() {
        return _animais;
    }
    
}
