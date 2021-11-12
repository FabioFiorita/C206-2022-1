/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 *
 * @author fabio
 */
public class Arquivo {
    
    
    public void escrever(Aluno a1) {
        
        OutputStream os = null;
        OutputStreamWriter osr = null;
        BufferedWriter bw = null;
        String linhaEscrever;
        
        try {
            
            os = new FileOutputStream("Arquivo.txt", true); //salvar no arquivo
            osr = new OutputStreamWriter(os); //conversor
            bw = new BufferedWriter(osr); //o q vai digitar
            
            bw.write("Aluno");
            bw.newLine();
            bw.write(a1.nome + "\n");
            bw.write(a1.matricula + "\n");
            bw.write(a1.curso + "\n");
            
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public ArrayList<Aluno> ler() {
        
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        ArrayList<Aluno> acheiNoArquivo = new ArrayList<>();
        String linhaLer;
        
        try {
            
            is = new FileInputStream("Arquivo.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr); 
            
            linhaLer = br.readLine();
            while(linhaLer != null) {
               if(linhaLer.contains("Aluno")) {
                   Aluno aux = new Aluno();
                   aux.nome = br.readLine();
                   aux.matricula = Integer.parseInt(br.readLine());
                   aux.curso = br.readLine();
                   acheiNoArquivo.add(aux);
               }
               linhaLer = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return acheiNoArquivo;
    }

}