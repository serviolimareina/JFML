package jfml.knowledgebase.variable;

/**
 * Java class for representing the values w and z in the tsukamotoVariableType
 * @author sotillo19
 *
 */
public class WZ {

	float w;
	float z;
	
	public WZ(float w, float z){
		this.w=w;
		this.z=z;
	}

	/**
	 * @return the w value
	 */
	public float getW() {
		return w;
	}

	/**
	 * @return the z value
	 */
	public float getZ() {
		return z;
	}

	/**
	 * @param w the w to set
	 */
	public void setW(float w) {
		this.w = w;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(float z) {
		this.z = z;
	}
	
	
}
