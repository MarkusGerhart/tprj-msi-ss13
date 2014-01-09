/**
 */
package org.eclipselabs.spray.shapes.shape;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anchor Predefinied</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.shape.AnchorPredefinied#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.shapes.shape.ShapePackage#getAnchorPredefinied()
 * @model
 * @generated
 */
public interface AnchorPredefinied extends AnchorType
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.spray.shapes.shape.AnchorPredefiniedEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.eclipselabs.spray.shapes.shape.AnchorPredefiniedEnum
   * @see #setValue(AnchorPredefiniedEnum)
   * @see org.eclipselabs.spray.shapes.shape.ShapePackage#getAnchorPredefinied_Value()
   * @model
   * @generated
   */
  AnchorPredefiniedEnum getValue();

  /**
   * Sets the value of the '{@link org.eclipselabs.spray.shapes.shape.AnchorPredefinied#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.eclipselabs.spray.shapes.shape.AnchorPredefiniedEnum
   * @see #getValue()
   * @generated
   */
  void setValue(AnchorPredefiniedEnum value);

} // AnchorPredefinied
