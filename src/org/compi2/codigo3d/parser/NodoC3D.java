package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String etqV;
    private String etqF;
    
    public NodoC3D(String cad) {
        this.cad = cad;
        
    }
    public void setEtiquetas( String etqV, String etqF)
    {
        this.etqF = etqF;
        this.etqV = etqV;
    }
    public String getCad()
    {
        return cad;
    }
    public String getEtqV()
    {
        return etqV;
    }
    public String getEtqF()
    {
        return etqF;
    }
    
}
