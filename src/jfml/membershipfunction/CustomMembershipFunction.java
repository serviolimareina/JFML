package jfml.membershipfunction;

import java.util.ArrayList;

import jfml.parameter.Parameter;

/**
 * Class for implementing custom membership functions
 * @author sotillo19
 *
 */
public class CustomMembershipFunction extends MembershipFunction {

	String name = "custom";
	
	public CustomMembershipFunction(CustomShapeType c) {
		// TODO Auto-generated constructor stub
	} 
	
	public CustomMembershipFunction() {
		// TODO Auto-generated constructor stub
	}

	public CustomMembershipFunction(Parameter p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	public CustomMembershipFunction(CustomShapeType customShape, float domainLeft, float domainRight) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getMembershipDegree(float x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Float> getXValuesDefuzzifier() {
		// TODO Auto-generated method stub
		return null;
	}

}
