package shc.iautos.checkfetch.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import shc.iautos.checkfetch.service.CFService;
import shc.iautos.domain.IautosCarInfo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.PreResultListener;

@Controller
public class CFAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5516616391512978802L;

	public final static Logger getLogger() {
		return LoggerFactory.getLogger(CFAction.class);
	}

	private CFService cfService;

	public CFService getCfService() {
		return cfService;
	}

	public void setCfService(CFService cfService) {
		this.cfService = cfService;
	}

	@Override
	public String execute() {
		List<IautosCarInfo> carInfos = this.cfService.listIncompletedCars();

		ServletActionContext.getRequest().setAttribute("cars", carInfos);

		ActionInvocation actionInvocation = ActionContext.getContext()
				.getActionInvocation();
		actionInvocation.addPreResultListener(new PreResultListener() {

			@Override
			public void beforeResult(ActionInvocation invocation,
					String resultCode) {

				@SuppressWarnings("unchecked")
				List<IautosCarInfo> cars = (List<IautosCarInfo>) invocation
						.getInvocationContext().get("cars");

				getLogger().info("get incompleted car " + cars.size());
			}
		});

		return SUCCESS;
	}
}
