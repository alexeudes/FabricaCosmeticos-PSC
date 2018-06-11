package beans;

import java.io.Serializable;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import basicas.Fornecedor;
import negocio.Fachada;

@FacesConverter(forClass = FornecedorConverter.class, value= "fornecedorConverter")
public class FornecedorConverter implements Converter , Serializable{

	private static final long serialVersionUID = 1L;
	private Fachada fachada = Fachada.getInstancia();
	private Fornecedor fornecedor = new Fornecedor();
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent uiComponent, String value) {
        /*if (value != null && !value.isEmpty()) {
        	uiComponent.g;
            return (Fornecedor) fachada.searchByKeyFornecedor(Integer.parseInt(value)); 
        }*/
	      if (value != null && !value.isEmpty()) {
	            return (Fornecedor) uiComponent.getAttributes().get(value);
	        }
        return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent uiComponent, Object value) {
        /*if (value instanceof Fornecedor) {
        	Fornecedor fornecedor= (Fornecedor) value;
            if (fornecedor != null && fornecedor instanceof Fornecedor && fornecedor.getId() != null) {
                //uiComponent.getAttributes().put(entity.getId().toString(), entity);
                return fornecedor.getId().toString();
            }
        }*/
        if (value instanceof Fornecedor) {
        	Fornecedor entity= (Fornecedor) value;
            if (entity != null && entity instanceof Fornecedor && entity.getId() != null) {
                uiComponent.getAttributes().put( entity.getId().toString(), entity);
                return entity.getId().toString();
            }
        }
        return "";
	}

}
