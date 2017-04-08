package cn.cheng.ssh.action;
/**
 * ��Ʒ�����Action��
 * @author cheng
 *
 */
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import cn.cheng.ssh.domain.Product;
import cn.cheng.ssh.service.ProductService;

public class ProductAction extends ActionSupport implements ModelDriven<Product>{

	//ģ������ʹ�õ���
	private Product product=new Product();
	
	@Override
	public Product getModel() {
		return product;
	}
	
	//Struts��Spring���Ϲ����а������Զ�ע���ҵ�����
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	/**
	 * ������Ʒ��ִ�з�����save
	 */
	public String save(){
		System.out.println("Action�е�save����ִ����...");
		productService.save(product);
		return NONE;
	}
	
}
