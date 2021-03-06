package dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface IDAOGenerico<Entity> {
	public Entity update(Entity objeto);
	public List<Entity> getAll();
	public void insert(Entity objeto);
	public void insertCollection(Collection<Entity> colecao);
	public void remove(Entity objeto);
	public Entity searchByKey(Serializable chave);
	public void refresh(Entity object);

}
