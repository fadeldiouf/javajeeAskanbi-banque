package sn.askanbiBank.dao;

import java.util.List;

public interface Idao <T>{
	public void save (T t);
	public List<T> liste();
	public void update (T t);
	public void delete(int id);
	public T getByID (int id);

}
