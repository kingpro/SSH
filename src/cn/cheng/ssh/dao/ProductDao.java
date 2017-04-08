package cn.cheng.ssh.dao;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import cn.cheng.ssh.domain.Product;
/**
 * 商品管理的DAO类
 * @author cheng
 *
 */
//注入Hibernate模板 extends HibernateDaoSupport
public class ProductDao extends HibernateDaoSupport{

	/**
	 * DAO中保存商品的方法
	 * @param product
	 */
	public void save(Product product){
		System.out.println("DAO中的保存商品方法执行了...");
		//调用Hibernate模板中的save方法
		this.getHibernateTemplate().save(product);
	}
	
}
