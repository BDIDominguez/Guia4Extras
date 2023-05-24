/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4extra;

import java.time.LocalDate;
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Collections;
import javax.tools.*;

/**
 *
 * @author Dario
 */
public class Amarre {
    private String nombre;
    private int documento;
    private LocalDate desde;
    private LocalDate hasta;
    private int posicion;
    private Barco barco;

    public Amarre() {
    }

    public Amarre(String nombre, int documento, LocalDate desde, LocalDate hasta, int posicion, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.desde = desde;
        this.hasta = hasta;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getDesde() {
        return desde;
    }

    public void setDesde(LocalDate desde) {
        this.desde = desde;
    }

    public LocalDate getHasta() {
        return hasta;
    }

    public void setHasta(LocalDate hasta) {
        this.hasta = hasta;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    // le pedi a chatGPT un codigo para poder ejecutar el contenido de un String como si fuera codigo JAVA pero no funciona como quiero XD
    public static void ejecutarCodigoJava(String codigo,Amarre amarre1, Yate yate) throws Exception {
        
        System.out.println("" + codigo);
        // Crear una clase temporal
        String className = "TempClass";
        String methodName = "tempMethod";
        String classCode = "public class " + className + " { public static void " + methodName + "(Amarre amarre1, Yate yate) { " + codigo + " } }";
        System.out.println(classCode);

        // Compilar y cargar la clase
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        try (StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null)) {
            JavaFileObject compilationUnit = new SimpleJavaFileObject(URI.create(className + ".java"), JavaFileObject.Kind.SOURCE) {
                @Override
                public CharSequence getCharContent(boolean ignoreEncodingErrors) {
                    return classCode;
                }
            };
            Iterable<? extends JavaFileObject> compilationUnits = Collections.singletonList(compilationUnit);
            compiler.getTask(null, fileManager, null, null, null, compilationUnits).call();
        }

        // Ejecutar el método
        Class<?> tempClass = Class.forName(className);
        Method tempMethod = tempClass.getDeclaredMethod(methodName);
        tempMethod.invoke(null);
    }

}

/*
public class Main {
    public static void main(String[] args) {
        String codigo = "System.out.println(\"Hola\");";

        try {
            MisMetodos.ejecutarCodigoJava(codigo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/