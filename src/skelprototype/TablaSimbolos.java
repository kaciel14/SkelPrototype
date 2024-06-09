
package skelprototype;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TablaSimbolos {
    ArrayList<Variable> ts;
    OperationStack os;
    
    public TablaSimbolos(){
        ts = new ArrayList<>();
        os = new OperationStack();
    }
    
    public void add(String id, String tipo){
        if(isContained(id)){
            System.out.println("No añadido");
        }else{
            ts.add(new Variable(id, tipo));
        } 
    }
    
//    public void add(String id, String tipo, Object valor){
//        if(isContained(id)){
//            System.out.println("No añadido");
//        }else{
//            ts.add(new Variable(id, tipo, valor));
//            System.out.println("agregado");
//        } 
//    }
    
    public void resetTable() {
        ts.clear();
    }
    
    
    public Variable get(int pos){
        return ts.get(pos);
    }
    
    public Variable get(String id){
        for(Variable v: ts){
            if (v.id.equals(id)){
                return v;
            }
        }
        return null;
    }
    
    public Variable getLast(){
        return ts.get(ts.size()-1);
    }
    
    public boolean isContained(String id){
        
        for(Variable v: ts){
            if (v.id.equals(id)){
                return true;
            }
        }
        return false;
    }
    
    class Variable{
        String id, tipo;
        Object valor;
        
        public Variable(String id, String tipo){
            this.id = id;
            this.tipo = tipo;
            switch(this.tipo){
                case "int":
                    this.valor = 0;
                    break;
                case "dec":
                    this.valor = 0.0;
                    break;
                case "bool":
                    this.valor = false;
                    break;
                case "String":
                    this.valor = "";
                    break;
                case "char":
                    this.valor = "";
                    break;
            }
        }
        
//        public Variable(String id, String tipo, Object valor){
//            this.id = id;
//            this.tipo = tipo;
//            this.valor = valor;
//        }
        
        public void setValue(Object o){
            try{
                switch(this.tipo){
                case "int":
                    this.valor = Integer.valueOf(String.valueOf(o));
                    break;
                case "dec":
                    this.valor = Float.valueOf(String.valueOf(o));
                    break;
                case "bool":
                    this.valor = Boolean.valueOf(String.valueOf(o));
                    break;
                case "String":
                    this.valor = String.valueOf(o).replaceAll("\"", "");
                    break;
                case "char":
                    this.valor = String.valueOf(o);
                    break;
            }
            }catch(Exception ex){
                System.out.println("Error de dato");
                JOptionPane.showMessageDialog(null, "Tipo de dato erroneo. " + ex.getMessage());
            }
            
        }
        
        public MyTokens getTokenTipoValor(){
            switch(this.tipo){
                case "int":
                    return MyTokens.Numero;
                case "dec":
                    return MyTokens.NumeroDecimal;
                case "bool":
                    return MyTokens.TrueFalse;
                case "String":
                    return MyTokens.Texto;
            }
            return null;
        }
        
        @Override
        public String toString(){
            return (tipo + ", "+ id+", "+ valor+"\n");
        }
    }
}
