package ma.zango.portlet;

import ma.zango.constants.ProduitPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import org.osgi.service.component.annotations.Component;

import java.util.ArrayList;

import com.liferay.portal.kernel.log.Log;

import com.liferay.portal.kernel.log.LogFactoryUtil;

import ma.zango.portlet.Produit;


/**
 * @author kamal doukali
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=portlet-produits Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ProduitPortletKeys.Produit,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ProduitPortlet extends MVCPortlet {

		private static final Log LOG = LogFactoryUtil.getLog(ProduitPortlet.class);
		private static final String LOG_HEADER = "[Produit-Portlet]";

@Override
    public void init (PortletConfig config) throws PortletException {
        super.init(config);
    }
	
	@Override
    public void render (RenderRequest request, RenderResponse response) throws PortletException, java.io.IOException {

		// Dans cette méthode il faut appeler le service builder
		
		ArrayList<Produit> produits = new ArrayList<Produit>();
		Produit p1 = new Produit("Pc","10000","01/01/2016");
		Produit p2 = new Produit("Tablette","15000","31/12/2017");
		Produit p3 = new Produit("Smartphone","4000","01/06/2017");
		
		
		produits.add(p1);
		produits.add(p2);
		produits.add(p3);	
		
        request.setAttribute("listeProduits", produits);

        super.render(request, response);
    }

    @Override
    public void processAction (ActionRequest request, ActionResponse response) throws PortletException, java.io.IOException {
        
		String lib = request.getParameter("lib");
		String prix = request.getParameter("prix");
		String dateMiseVente = request.getParameter("dateMiseVente");
		
		//appel du modéle pour enregistrement du produit dans la base
        LOG.trace(String.format("%s Formulaire data -> %s", LOG_HEADER, lib+prix+dateMiseVente));
        super.processAction(request, response);
    }
    
    @Override
    public void destroy () {
        String message = "Destruction de portlet ...";
        LOG.trace(String.format("%s destroy() -> %s", LOG_HEADER, message));
        super.destroy();
    }
}
