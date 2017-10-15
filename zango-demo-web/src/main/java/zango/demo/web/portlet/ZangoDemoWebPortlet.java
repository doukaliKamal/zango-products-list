package zango.demo.web.portlet;

import zango.demo.core.service.ProduitLocalServiceUtil;
import zango.demo.web.constants.ZangoDemoWebPortletKeys;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Kamal doukali
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.zango",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=zango-demo-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ZangoDemoWebPortletKeys.ZangoDemoWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ZangoDemoWebPortlet extends MVCPortlet {
	
	//Contrôleur de la demo
	
	 private static final Log log=LogFactoryUtil.getLog(ZangoDemoWebPortlet.class);
	 @Override
	 public void render(RenderRequest renderRequest, RenderResponse renderResponse)
	   throws IOException, PortletException {
	  // TODO Auto-generated method stub
	  super.render(renderRequest, renderResponse);
	 }	 
	 
	 @ProcessAction(name="addProduct")
	 public void addProduct(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException {
	  String lib=ParamUtil.getString(actionRequest,"lib");
	  long prix=ParamUtil.getLong(actionRequest,"prix");
	  //Date dateMiseVente=ParamUtil.getDate(actionRequest,"dateMiseVente", "dd/mm/dddd");
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
	  Date dateMiseVente =(Date) ParamUtil.getDate(actionRequest, "dateMiseVente",sdf);
	  ProduitLocalServiceUtil.saveProduct(lib, prix, dateMiseVente);
	  
	 }
	
	
	
}