package shop;

import java.util.List;

public interface GeneralWarehouse {
	public abstract void add(Product product);

	public abstract Product get(Product product);

	public abstract void set(Product product);

	public abstract void remove(Product product);

	public abstract List<Product> getAllProducts();
}
