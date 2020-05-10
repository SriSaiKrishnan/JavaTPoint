package com.sai.io;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class Example14 {
    public static void main(String[] args) {
        String file = "/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testin1.txt";
        FilePermission filePermission1 =  new FilePermission("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/-","read");
        PermissionCollection permission = filePermission1.newPermissionCollection();
        permission.add(filePermission1);
        FilePermission file2 = new FilePermission(file, "write");
        if(permission.implies(new FilePermission(file, "read,write"))) {
            System.out.println("Read, Write permission is granted for the path "+file );
        }else {
            System.out.println("No Read, Write permission is granted for the path "+file);            }
    }
}
