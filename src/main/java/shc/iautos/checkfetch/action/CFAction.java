package shc.iautos.checkfetch.action;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import shc.iautos.checkfetch.service.CFService;
import shc.iautos.domain.IautosSellerInfo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.interceptor.PreResultListener;

@Controller("cfAction")
public class CFAction extends ActionSupport implements
		ModelDriven<IautosSellerInfo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5516616391512978802L;

	private IautosSellerInfo seller = null;
	private IautosSellerInfo newSeller = null;

	public IautosSellerInfo getNewSeller() {
		return newSeller;
	}

	public void setNewSeller(IautosSellerInfo newSeller) {
		this.newSeller = newSeller;
	}

	public IautosSellerInfo getSeller() {
		return seller;
	}

	public void setSeller(IautosSellerInfo seller) {
		this.seller = seller;
	}

	public final static Logger getLogger() {
		return LoggerFactory.getLogger(CFAction.class);
	}

	private List<IautosSellerInfo> sellers = null;

	public List<IautosSellerInfo> getSellers() {
		return sellers;
	}

	public void setSellers(List<IautosSellerInfo> sellers) {
		this.sellers = sellers;
	}

	@Autowired
	private CFService cfService;

	public CFService getCfService() {
		return cfService;
	}

	@Autowired
	public void setCfService(CFService cfService) {
		this.cfService = cfService;
	}

	public String listIncompletedSellers() {
		sellers = this.cfService.listIncompletedSellers();

		ActionInvocation actionInvocation = ActionContext.getContext()
				.getActionInvocation();
		actionInvocation.addPreResultListener(new PreResultListener() {

			@Override
			public void beforeResult(ActionInvocation invocation,
					String resultCode) {
				getLogger().info("get incompleted sellers:" + sellers.size());

			}
		});
		return SUCCESS;
	}

	public String getIncompletedSeller() {
		Map<String, Object> params = ActionContext.getContext().getParameters();
		String seqID = ((String[]) params.get("seqID"))[0];
		seller = this.cfService.getIncompletedSeller(seqID);
		return SUCCESS;
	}

	public String saveIncompletedSeller() {

		if (StringUtils.isBlank(newSeller.getShopAddress())) {
			newSeller.setShopAddress(null);
		}
		if (StringUtils.isBlank(newSeller.getShopPhone())) {
			newSeller.setShopPhone(null);
		}
		if (StringUtils.isBlank(newSeller.getShopName())) {
			newSeller.setShopName(null);
		}

		this.cfService.saveIncompletedSeller(newSeller);
		seller = this.cfService.getIncompletedSeller(newSeller.getSeqID());
		return SUCCESS;
	}

	@Override
	public IautosSellerInfo getModel() {

		if (null == newSeller) {
			newSeller = new IautosSellerInfo();
		}
		return newSeller;
	}
}
