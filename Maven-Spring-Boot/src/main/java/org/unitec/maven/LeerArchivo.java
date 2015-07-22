package org.unitec.maven;

/**
 * @author gatuzo07
 */

import java.io.*;

public class LeerArchivo implements Leer{
    
    @Override
    public String leer() throws Exception{
        File file=new File("/Users/gatuzo07/Desktop/Lectura.txt");
        FileInputStream fis=new FileInputStream(file);
        StringBuilder sb=new StringBuilder();
        int ch=0;
        while((ch=fis.read())!=-1){
            sb.append((char)ch);
        }
        return sb.toString();
    }
    
}
