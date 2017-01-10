package jfml.parameter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for the fourParamType complex type.
 *  
 * <pre>
 * &lt;complexType name="fourParamType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="param1" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="param2" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="param3" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="param4" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author sotillo19
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fourParamType")
public class FourParamType extends Parameter{

    @XmlAttribute(name = "param1", required = true)
    protected float param1;
    @XmlAttribute(name = "param2", required = true)
    protected float param2;
    @XmlAttribute(name = "param3", required = true)
    protected float param3;
    @XmlAttribute(name = "param4", required = true)
    protected float param4;

    /**
     * Gets the value of the attribute param1.
     * @return the value of the attribute param1.
     */
    public float getParam1() {
        return param1;
    }

    /**
     * Sets the value for the attribute param1.
     * @param value value
     */
    public void setParam1(float value) {
        this.param1 = value;
    }

    /**
     * Gets the value of the attribute param2.
     * @return the value of the attribute param2.
     */
    public float getParam2() {
        return param2;
    }

    /**
     * Sets the value for the attribute param2.
     * @param value value
     */
    public void setParam2(float value) {
        this.param2 = value;
    }

    /**
     * Gets the value of the attribute param3.
     * @return the value of the attribute param3.
     */
    public float getParam3() {
        return param3;
    }

    /**
     * Sets the value for the attribute param3.
     * @param value value
     */
    public void setParam3(float value) {
        this.param3 = value;
    }

    /**
     * Gets the value of the attribute param4.
     * @return the value of the attribute param4.
     */
    public float getParam4() {
        return param4;
    }

    /**
     * Sets the value for the attribute param4.
     * @param value value
     */
    public void setParam4(float value) {
        this.param4 = value;
    }

	@Override
	public int getParameterLength() {
		return 4;
	}

	@Override
	public float getParameter(int i) {
		if(i>0 && i<=getParameterLength()){
			if(i==1)
				return getParam1();
			else if(i==2)
				return getParam2();
			else if(i==3)
				return getParam3();
			else if(i==4)
				return getParam4();
		}
		return -1;	
	}

}
