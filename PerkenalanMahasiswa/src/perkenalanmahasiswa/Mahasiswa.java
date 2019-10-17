/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkenalanmahasiswa;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    public int nim;
    public String nama;
    
    public void perkenalkanDiri(int nim,String nama){
        System.out.println("Hello Everyone");
        System.out.println("My NIM is "+nim);
        System.out.println("My Name is "+nama);
        
    }
}
