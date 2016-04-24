/**
 *  Copyright 2014-15 by Riccardo Massera (TheCoder4.Eu) and Stephan Rauh (http://www.beyondjava.net).
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

package net.bootsfaces.component.scrollUp;

import javax.el.ValueExpression;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;

import net.bootsfaces.C;
import net.bootsfaces.listeners.AddResourcesListener;
import net.bootsfaces.utils.BsfUtils;


/** This class holds the attributes of &lt;b:scrollUp /&gt;. */
@FacesComponent("net.bootsfaces.component.scrollUp.ScrollUp")
public class ScrollUp extends UIComponentBase  {
	
	public static final String COMPONENT_TYPE = "net.bootsfaces.component.scrollUp.ScrollUp";
	
	public static final String COMPONENT_FAMILY = "net.bootsfaces.component";
	
	public static final String DEFAULT_RENDERER = "net.bootsfaces.component.scrollUp.ScrollUp";
	
	public ScrollUp() {
		setRendererType(DEFAULT_RENDERER);
		AddResourcesListener.addThemedCSSResource("scrollup.css");
  		AddResourcesListener.addResourceToHeadButAfterJQuery(C.BSF_LIBRARY, "js/jquery.scrollUp.min.js");
	}
	
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	/** 
	 * Manage EL-expression for snake-case attributes
	 */
	public void setValueExpression(String name, ValueExpression binding) {
		name = BsfUtils.snakeCaseToCamelCase(name);
		super.setValueExpression(name, binding);
	}		
	
    protected enum PropertyKeys {
		name,
		distance,
		from,
		speed,
		animation,
		animationSpeed,
		text,
		title,
		image,
		easing,
		trigger,
		target,
		overlay
		;
        String toString;

        PropertyKeys(String toString) {
            this.toString = toString;
        }

        PropertyKeys() {}

        public String toString() {
            return ((this.toString != null) ? this.toString : super.toString());
        }
    }
	

	/**
	 * Element ID <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getName() {
		String value = (String)getStateHelper().eval(PropertyKeys.name, null);
		return  value;
	}
	
	/**
	 * Element ID <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setName(String _name) {
	    getStateHelper().put(PropertyKeys.name, _name);
    }
	

	/**
	 * Distance from top/bottom before showing element (px) <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getDistance() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.distance, 0);
		return (int) value;
	}
	
	/**
	 * Distance from top/bottom before showing element (px) <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setDistance(int _distance) {
	    getStateHelper().put(PropertyKeys.distance, _distance);
    }
	

	/**
	 * scroll direction: 'top' or 'bottom' <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getFrom() {
		String value = (String)getStateHelper().eval(PropertyKeys.from, null);
		return  value;
	}
	
	/**
	 * scroll direction: 'top' or 'bottom' <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setFrom(String _from) {
	    getStateHelper().put(PropertyKeys.from, _from);
    }
	

	/**
	 * Speed back to top (ms). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getSpeed() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.speed, 0);
		return (int) value;
	}
	
	/**
	 * Speed back to top (ms). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setSpeed(int _speed) {
	    getStateHelper().put(PropertyKeys.speed, _speed);
    }
	

	/**
	 * Animation type: Fade, slide, none. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getAnimation() {
		String value = (String)getStateHelper().eval(PropertyKeys.animation, null);
		return  value;
	}
	
	/**
	 * Animation type: Fade, slide, none. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setAnimation(String _animation) {
	    getStateHelper().put(PropertyKeys.animation, _animation);
    }
	

	/**
	 * Animation speed (ms). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getAnimationSpeed() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.animationSpeed, 0);
		return (int) value;
	}
	
	/**
	 * Animation speed (ms). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setAnimationSpeed(int _animationSpeed) {
	    getStateHelper().put(PropertyKeys.animationSpeed, _animationSpeed);
    }
	

	/**
	 * Text for element, can contain HTML. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getText() {
		String value = (String)getStateHelper().eval(PropertyKeys.text, null);
		return  value;
	}
	
	/**
	 * Text for element, can contain HTML. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setText(String _text) {
	    getStateHelper().put(PropertyKeys.text, _text);
    }
	

	/**
	 * Set a custom &lt;a&gt; title if required. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTitle() {
		String value = (String)getStateHelper().eval(PropertyKeys.title, null);
		return  value;
	}
	
	/**
	 * Set a custom &lt;a&gt; title if required. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTitle(String _title) {
	    getStateHelper().put(PropertyKeys.title, _title);
    }
	

	/**
	 * Set true to use image. (Must be set in related css). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getImage() {
		String value = (String)getStateHelper().eval(PropertyKeys.image, null);
		return  value;
	}
	
	/**
	 * Set true to use image. (Must be set in related css). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setImage(String _image) {
	    getStateHelper().put(PropertyKeys.image, _image);
    }
	

	/**
	 * Scroll easing (see http://easings.net/). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getEasing() {
		String value = (String)getStateHelper().eval(PropertyKeys.easing, null);
		return  value;
	}
	
	/**
	 * Scroll easing (see http://easings.net/). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setEasing(String _easing) {
	    getStateHelper().put(PropertyKeys.easing, _easing);
    }
	

	/**
	 * Set a custom triggering element. Can be an HTML string or jQuery object <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTrigger() {
		String value = (String)getStateHelper().eval(PropertyKeys.trigger, null);
		return  value;
	}
	
	/**
	 * Set a custom triggering element. Can be an HTML string or jQuery object <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTrigger(String _trigger) {
	    getStateHelper().put(PropertyKeys.trigger, _trigger);
    }
	

	/**
	 * Set a custom target element for scrolling to. Can be element or number. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTarget() {
		String value = (String)getStateHelper().eval(PropertyKeys.target, null);
		return  value;
	}
	
	/**
	 * Set a custom target element for scrolling to. Can be element or number. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTarget(String _target) {
	    getStateHelper().put(PropertyKeys.target, _target);
    }
	

	/**
	 * Set CSS color to display scrollUp active point, e.g '#00FFFF' <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOverlay() {
		String value = (String)getStateHelper().eval(PropertyKeys.overlay, null);
		return  value;
	}
	
	/**
	 * Set CSS color to display scrollUp active point, e.g '#00FFFF' <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOverlay(String _overlay) {
	    getStateHelper().put(PropertyKeys.overlay, _overlay);
    }
}
