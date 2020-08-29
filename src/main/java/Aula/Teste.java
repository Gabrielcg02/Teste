
package Aula;


 class Pessoa{

    String nome;
    int idade;

    Pessoa(){}

    Pessoa(String nome){
        this.nome = nome;
    }
     
    Pessoa(String nome, int idade){

        this.nome = nome;
        this.idade = idade;
    }

    String getNome(){
        return this.nome;
    }

    void trocarNome(String novoNome){
        if(this.idade >= 18) this.nome = novoNome; 
    }




}