/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author victo
 */
public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private double Salario;

    public Cliente(String nome, String telefone, String email, double Salario) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.Salario = Salario;
    }
    
    

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public double getSalario() {
        return Salario;
    }
    
    
}
