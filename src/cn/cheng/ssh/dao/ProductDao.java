package cn.cheng.ssh.dao;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import cn.cheng.ssh.domain.Product;
/**
 * ��Ʒ�����DAO��
 * @author cheng
 *
 */
//ע��Hibernateģ�� extends HibernateDaoSupport
public class ProductDao extends HibernateDaoSupport{

	/**
	 * DAO�б�����Ʒ�ķ���
	 * @param product
	 */
	public void save(Product product){
		System.out.println("DAO�еı�����Ʒ����ִ����...");
		//����Hibernateģ���е�save����
		this.getHibernateTemplate().save(product);
	}
	
}
