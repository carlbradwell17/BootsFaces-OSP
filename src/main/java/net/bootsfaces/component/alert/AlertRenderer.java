/**
 *  Copyright 2014-16 by Riccardo Massera (TheCoder4.Eu) and Stephan Rauh (http://www.beyondjava.net).
 *  
 *  This file is part of BootsFaces.
 *  
 *  BootsFaces is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  BootsFaces is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with BootsFaces. If not, see <http://www.gnu.org/licenses/>.
 */

package net.bootsfaces.component.alert;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Responsive;
import net.bootsfaces.render.Tooltip;

/** This class generates the HTML code of &lt;b:alert /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.alert.Alert")
public class AlertRenderer extends CoreRenderer {

	/**
	 * This methods generates the HTML code of the current b:alert.
	 * <code>encodeBegin</code> generates the start of the component. After the,
	 * the JSF framework calls <code>encodeChildren()</code> to generate the
	 * HTML code between the beginning and the end of the component. For
	 * instance, in the case of a panel component the content of the panel is
	 * generated by <code>encodeChildren()</code>. After that,
	 * <code>encodeEnd()</code> is called to generate the rest of the HTML code.
	 * 
	 * @param context
	 *            the FacesContext.
	 * @param component
	 *            the current b:alert.
	 * @throws IOException
	 *             thrown if something goes wrong when writing the HTML code.
	 */
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
		if (!component.isRendered()) {
			return;
		}
		Alert alert = (Alert) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = alert.getClientId();
		// Map<String, Object> attrs = alert.getAttributes();

		String sev = alert.getSeverity();

		String t = alert.getTitle();
		boolean closbl = alert.isClosable();

		rw.startElement("div", alert);
		rw.writeAttribute("id", clientId, "id");
		Tooltip.generateTooltip(context, component, rw);

		String style = alert.getStyle();
		if (null != style)
			rw.writeAttribute("style", style, "style");

		String styleClass = alert.getStyleClass();
		if (null == styleClass)
			styleClass = "";
		else
			styleClass = " " + styleClass;
		
		styleClass += Responsive.getResponsiveStyleClass(alert, false);

		if (sev != null) {
			rw.writeAttribute("class", "alert alert-" + sev + " fadein" + styleClass, "class");
		} else {
			rw.writeAttribute("class", "alert fadein" + styleClass, "class");
		}
		if (closbl) {
			rw.startElement("button", alert);
			rw.writeAttribute("type", "button", "type");
			rw.writeAttribute("class", "close", "class");
			rw.writeAttribute("data-dismiss", "alert", "data-dismiss");
			rw.write("&times;");
			rw.endElement("button");
		}
		if (t != null) {
			rw.startElement("strong", alert);
			rw.writeText(t, null);
			rw.endElement("strong");
			rw.startElement("br", alert);
			rw.endElement("br");
		}
	}

	/**
	 * This methods generates the HTML code of the current b:alert.
	 * <code>encodeBegin</code> generates the start of the component. After the,
	 * the JSF framework calls <code>encodeChildren()</code> to generate the
	 * HTML code between the beginning and the end of the component. For
	 * instance, in the case of a panel component the content of the panel is
	 * generated by <code>encodeChildren()</code>. After that,
	 * <code>encodeEnd()</code> is called to generate the rest of the HTML code.
	 * 
	 * @param context
	 *            the FacesContext.
	 * @param component
	 *            the current b:alert.
	 * @throws IOException
	 *             thrown if something goes wrong when writing the HTML code.
	 */
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
		if (!component.isRendered()) {
			return;
		}
		Alert alert = (Alert) component;
		ResponseWriter rw = context.getResponseWriter();
		rw.endElement("div");
		Tooltip.activateTooltips(context, alert);
	}
}
