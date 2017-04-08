package cn.cheng.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import cn.cheng.ssh.dao.ProductDao;
import cn.cheng.ssh.domain.Product;
/**
 * ��Ʒ�����ҵ�����
 * @author cheng
 *
 */
@Transactional
public class ProductService {
	
	//ҵ���ע��DAO����
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	/**
	 * ҵ��㱣����Ʒ�ķ���
	 * @param product
	 */
	public void save(Product product){
		System.out.println("Service�е�save����ִ����...");
		productDao.save(product);
	}

}
