package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IProductDao;
import pe.edu.upc.entity.Product;
import pe.edu.upc.service.IProductService;

public class ProductServicelmpl implements IProductService{
	
	@Inject
	private IProductDao pD;

	@Override
	public void insert(Product p) {
		pD.insert(p);
		// TODO Auto-generated method stub
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return pD.list();
	}

	@Override
	public List<Product> fingByNameProduct(Product p) {
		// TODO Auto-generated method stub
		return pD.findByNameProdcut(p);
	}
	
	public void eliminar(int idproduct) {
		pD.eliminar(idproduct);
	}

}
