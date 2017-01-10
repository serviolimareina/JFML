package jfml.operator;

/**
 * Abstract class for representing LogicalTypes
 * @author sotillo19
 *
 */
public abstract class LogicalType {

	/**
	 * Default constructor
	 */
	public LogicalType() {
		
	}

	/**
	 * Get the method for operator AND / OR
	 */
	public abstract String getOperator();
	
	/**
	 * Gets the i-th element of the Aggregation
	 * Both the element AND and the element OR contain two elements, clause or an element 
	 * AND followed by an element clause or an element OR followed by an element clause. 
	 * The element clause represents the clause to be used in the fuzzy expression of the 
	 * aggregated fuzzy term under definition.
	 * @param i 0=first element, 1=last element
	 * @return the content of the i-th part i of the Aggregation
	 */
	public abstract Object getContent(int i);

	/**
	 * Gets the aggregation depending on the operator AND / OR
	 * @param degree1
	 * @param degree2
	 * @return the aggregation result
	 */
	public abstract float operate(float degree1, float degree2);
}
