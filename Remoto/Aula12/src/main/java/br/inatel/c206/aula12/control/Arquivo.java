package br.inatel.c206.aula12.control;

import br.inatel.c206.aula12.model.Aluno;

import java.io.*;
import java.util.ArrayList;

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
